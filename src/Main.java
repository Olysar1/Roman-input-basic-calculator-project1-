import java.util.Scanner;


public class Main {
    //////////////////////////////try4///////////////////////////////////

    //operator functions:
    public static int result = 0; //keep the latest result

    public static void add(int x, int y) {
        result = x + y;
        System.out.println("The result is: "+result);
    }

    public static void subtract(int x, int y) {
        result = x - y;
        System.out.println("The result is: "+result);
    }

    public static void multiply(int x, int y) {
        result = x * y;
        System.out.println("The result is: "+result);
    }

    public static void divide(int x, int y) {
        result = x / y;
        System.out.println("The result is: "+result);
    }

    public static void modulo(int x, int y) {
        result = x % y;
        System.out.println("The result is: "+result);
    }


    public static void main(String[] args) {

        //variable area:
        int num1, num2;
        String operator;
        Scanner scan = new Scanner(System.in);

        //calculator code:
        System.out.println("enter the first number: ");
        num1 = scan.nextInt();
        result = num1;

        while(true) {
            System.out.println("enter operator(or \"end\" to terminate the calculator): ");
            operator = scan.next();
            if (operator.equals("end")) {
                System.out.println("calculator terminated. final result: "+result);
                break;
            }
            System.out.println("enter a number: ");
            num2 = scan.nextInt();
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

/////////////////////////////////try1//////////////////////////////////////
//        int num1;
//        int num2;
//        String operator;
//        int result = 0;
//
//        Scanner input = new Scanner(System.in);
//        num1 = input.nextInt();
//        operator = input.next();
//        num2 = input.nextInt();
//        if (operator.equals("+")) {
//            result = num1 + num2;
//        }
//        System.out.println(result);

/////////////////////////////////try2/////////////////////////////////////
//        ArrayList<Integer> userInputNum = new ArrayList<Integer>();
//        ArrayList<String> userInputOperator = new ArrayList<String>();
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter first number: ");
//        int result = 0;
//        while(true) {
//            String userInput = input.next();
//            if (userInput.equals("end")) {
//                //
//                System.out.println(result);
//                break;
//            }
//            if (userInput.equals("+")||userInput.equals("-")||userInput.equals("*")||userInput.equals("/")) {
//                System.out.println("Enter next number: ");
//                userInputOperator.add(userInput);
//            } else {
//                System.out.println("Enter operator or \"end\": ");
//                userInputNum.add(Integer.parseInt(userInput));
//            }
//        }
//
//        System.out.println(userInputOperator);
//        System.out.println(userInputNum);

///////////////////////////////try3///////////////////////////////////////

//        int temp;
//        int result;
//        String exit;
//        String operator = "";
//
//        Scanner s=new Scanner(System.in);
//
//        System.out.println("enter first number: ");
//        result = s.nextInt();
//
//        while(true) {
//            if (operator.equals("end")) {
//                System.out.println("the final result is - "+result);
//                break;
//            }
//            System.out.println("enter a number: ");
//            temp = s.nextInt();
//            System.out.println("enter an operator(+,-,*,/,%) between " + result + " and " + temp + ": ");
//            operator = s.next();
//
//            switch(operator) {
//                case "+":
//                    result += temp;
//                    System.out.println(result);
//                    break;
//                case "-":
//                    result -= temp;
//                    System.out.println(result);
//                    break;
//                case "*":
//                    result = result*temp;
//                    System.out.println(result);
//                    break;
//                case "/":
//                    result = result/temp;
//                    System.out.println(result);
//                    break;
//                case "%":
//                    result = result%temp;
//                    System.out.println(result);
//                    break;
//                //default: System.out.println("invalid operator");
//            }
//        }
    }
}