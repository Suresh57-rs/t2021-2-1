

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String operator;
        //taking type of operation from user
        System.out.println("Enter the 'type of operation' [ +, -, *, / ]");
        operator = input.nextLine();
        double a, b;
        //taking 'a' value from user
        System.out.println("Enter 'a' value : ");
        a = input.nextDouble();
        //taking 'b' value from user
        System.out.println("Enter 'b' value : ");
        b = input.nextDouble();
        //checking operator using switch
        switch (operator) {
            case "+":
                System.out.println("Addition : " + a + " + " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println("Subtraction : " + a + " - " + b + " = " + (a - b));
                break;
            case "*":
                System.out.println("Multiplication : " + a + " * " + b + " = " + (a * b));
                break;
            case "/":
                System.out.println("Division : " + a + " / " + b + " = " + (a / b));
                break;
            default:
                System.out.println("Invalid value.");
        }


    }

}
