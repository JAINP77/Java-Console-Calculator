package Calculator;
import java.util.*;

public class Calculator {
    public static int add(int a,int b){
        return a+b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static double divide(int a, int b){
        if(b==0){
            System.out.println("division by zero is not allowed");
            return 0;
        }
        return (double)a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean continuecalucation = true;

        while(continuecalucation){
            System.out.print("Enter First Number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter Second Number: ");
            int num2 = sc.nextInt();

            System.out.print("Choose operation: +,-,*,/");
            char operator = sc.next().charAt(0);


            switch (operator) {
                case '+':
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case '-':
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case '*':
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case '/':
                    System.out.println("Result: " + divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operator.");
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = sc.next();
            if (response.equalsIgnoreCase("no") || response.equalsIgnoreCase("n")) {
                continuecalucation = false;
            }
        }

        System.out.println("Calculator exited.");
        sc.close();
    }

}
