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

    //converter function(Arabic to Roman);

    //converter function(Roman to Arabic):
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

    //operator functions:
    public static int result = 0; //keep the latest result
    static Scanner scan = new Scanner(System.in); //scanner

    public static void add(int x, int y) {
        result = x + y;
        System.out.println("The current result is: "+result);
    }

    public static void subtract(int x, int y) {
        result = x - y;
        System.out.println("The current result is: "+result);
    }

    public static void multiply(int x, int y) {
        result = x * y;
        System.out.println("The current result is: "+result);
    }

    public static void divide(int x, int y) {
        result = x / y;
        System.out.println("The current result is: "+result);
    }

    public static void modulo(int x, int y) {
        result = x % y;
        System.out.println("The current result is: "+result);
    }

//////////////////////////////////////
    public static void main(String[] args) {

//        int p =  romanToArabic("McMXlVIII");
//        System.out.println(p);

        //variable area:
        int num1, num2;
        String operator;

        //calculator code:
        System.out.println("enter the first number: ");
        num1 = romanToArabic(scan.nextLine());
        result = num1;

        while(true) {
            System.out.println("enter operator(or \"end\" to terminate the calculator): ");
            operator = scan.nextLine();
            if (operator.equals("end")) {
                System.out.println("calculator terminated. final result: "+result);
                break;
            }
            System.out.println("enter a number: ");
            String x = scan.nextLine();
            num2 = romanToArabic(x);

            switch(operator) {
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