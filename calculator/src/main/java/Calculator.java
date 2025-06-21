// Simple Calculator using the basic java knowledge

import java.util.Scanner;

public class Calculator {

    //Addition method
    public int add(int a, int b) {
        return a + b;
    }

    //Subtract method
    public int subtract(int a, int b) {
        return a - b;
    }

    //Multiply method
    public int multiply(int a, int b) {
        return a * b;
    }

    //Divide method
    public int divide(int a, int b) {
        return a / b;
    }

    //Mod method
    public int mod(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        //Adding Scanner Object
        Scanner inputs = new Scanner(System.in);

        //Getting User Inputs
        System.out.println("Enter the first number: ");
        int a = inputs.nextInt();

        System.out.println("Enter the second number: ");
        int b = inputs.nextInt();

        System.out.println("Tell What ur Operator is : ");
        String operator = inputs.next().toUpperCase();

        //Based on Operator Calculator logics
        switch (operator) {
            case "+" :
            case "ADD" :
                System.out.println(myCalculator.add(a, b));
                break;

            case "-" :
                case "SUBTRACT" :
                    System.out.println(myCalculator.subtract(a, b));
                    break;

            case "*" :
                case "MULTIPLY" :
                    System.out.println(myCalculator.multiply(a, b));
                    break;

            case "/" :
            case "DIVIDE" :
                System.out.println(myCalculator.divide(a, b));
                break;

            case "%" :
                case "MOD" :
                    System.out.println(myCalculator.mod(a, b));
                    break;
            default :
                System.out.println("Invalid Operator");

        }
    }
}