import java.util.Scanner;


public class Main {
    //////////////////////////////try4///////////////////////////////////

    //operator functions:
    public static int result = 0; //keep the latest result

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
    }
}