import java.util.*;


public class Main {
    //////////////////////////////try4///////////////////////////////////


    //converter map:
    static Map<Character, Integer> romanToArabicMap = new HashMap<>(){{
        put('I',1);
        put('V',5);
        put('X',10);
        put('L',50);
        put('C',100);
        put('D',500);
        put('M',1000);
    }};

    static Map<Integer, String> arabicToRomanMap = new HashMap<>(){{
        put(1, "I");
        put(4, "IV");
        put(5, "V");
        put(9, "IX");
        put(10, "X");
        put(40, "XL");
        put(50, "L");
        put(90, "XC");
        put(100, "C");
        put(400, "CD");
        put(500, "D");
        put(900, "DM");
        put(1000, "M");
    }};

    //converter method(Arabic to Roman);
    public static String arabicToRoman(int arabic) {
        //sorted list of romanToArabicMap.values():
        List<Integer> listKey = new ArrayList<>(arabicToRomanMap.keySet());
        Collections.sort(listKey, Collections.reverseOrder());

        if (arabic <= 0 || arabic >= 4000) {
            System.out.println("Illegal value. enter number between 0 and 4000.");
            return "";
        }

        String result = "";
        int i = 0;

        while ((arabic > 0 && (i < listKey.size()))) {
            String currentSymbol = arabicToRomanMap.get(listKey.get(i));
            if(arabic >= listKey.get(i)) {
                result+=currentSymbol;
                arabic-=listKey.get(i);
            } else {
                i++;
            }
        }
        return result;
    }

    //converter method(Roman to Arabic):
    public static int romanToArabic(String roman) {

        int arabicNum = romanToArabicMap.get(roman.toUpperCase().charAt(roman.length()-1));

        for (int i=roman.length()-2; i>=0; i--) {
            if(romanToArabicMap.get(roman.toUpperCase().charAt(i)) >= romanToArabicMap.get(roman.toUpperCase().charAt(i+1))) {
                arabicNum += romanToArabicMap.get(roman.toUpperCase().charAt(i));
            } else if ((romanToArabicMap.get(roman.toUpperCase().charAt(i)) < romanToArabicMap.get(roman.toUpperCase().charAt(i+1)))) {
                arabicNum -= romanToArabicMap.get(roman.toUpperCase().charAt(i));
            }
        }
        return arabicNum;
    }
    public static int result = 0; //keep the latest result
    static Scanner scan = new Scanner(System.in); //scanner

    public static void showCurrentResult() { //print current result
        System.out.println("current result is: "+arabicToRoman(result));
    }
    //operator methods:
    public static void add(int x, int y) {
        result = x + y;
        showCurrentResult();
    }

    public static void subtract(int x, int y) {
        result = x - y;
        showCurrentResult();
    }

    public static void multiply(int x, int y) {
        result = x * y;
        showCurrentResult();
    }

    public static void divide(int x, int y) {
        result = x / y;
        showCurrentResult();
    }

    public static void modulo(int x, int y) {
        result = x % y;
        showCurrentResult();
    }

//////////////////////////////////////
    public static void main(String[] args) {

        //variable area:
        int num1, num2;
        String operatorInput;

        //calculator code:
        System.out.println("enter the first number: ");
        num1 = romanToArabic(scan.nextLine());
        result = num1;

        while(true) {
            System.out.println("enter operator(or \"end\" to terminate the calculator): ");
            operatorInput = scan.nextLine();
            if (operatorInput.equals("end")) {
                System.out.println("calculator terminated. final result: "+arabicToRoman(result));
                break;
            }
            System.out.println("enter a number: ");
            String numInput = scan.nextLine();
            num2 = romanToArabic(numInput);

            switch(operatorInput) {
                case "+":
                    add(result, num2);
                    break;
                case "-":
                    subtract(result, num2);
                    break;
                case "*":
                    multiply(result, num2);
                    break;
                case "/":
                    divide(result, num2);
                    break;
                case "%":
                    modulo(result, num2);
                    break;
            }
        }
    }
}