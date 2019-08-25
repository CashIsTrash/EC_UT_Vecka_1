package se.lexicon.Konstantinos;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        boolean repeat = true;
        while (repeat == true){
            printMessage();

            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();

            readChoice(choice);


            try {
                System.out.print("Number 1 = ");
                double num1 = sc.nextDouble();

                System.out.print("Number 2 = ");
                double num2 = sc.nextDouble();
                System.out.println();

                System.out.println("----------------------");
                if (choice.equals("Addition")) {
                    System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));

                } else if (choice.equals("Subtraction")) {
                    subtract(num1, num2);
                    System.out.println(num1 + " - " + num2 + " = " + subtract(num1, num2));
                } else if (choice.equals("Multiplication")) {
                    subtract(num1, num2);
                    System.out.println(num1 + " * " + num2 + " = " + multiply(num1, num2));
                } else {
                    divide(num1, num2);
                    System.out.println(num1 + " / " + num2 + " = " + divide(num1, num2));
                }
                System.out.println("----------------------\n");
            } catch (Exception e) {
                System.out.println("\nType a number please!");
            }
        }

    }

    public static void printMessage() {
        System.out.println("Welcome! \n");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("Hint: Please Type 'Addition' NOT 'addition'!\n");
        System.out.print("--> Your choice is: ");
    }

    public static String readChoice(String ch){
        String choice = ch;

        switch (choice){

            case "Addition":
                System.out.println("ADD");
                break;

            case "Subtraction":
                System.out.println("SUBTRACT");
                break;

            case "Multiplication":
                System.out.println("MULTIPLY");
                break;

            case "Division":
                System.out.println("DIVIDE");
                break;

            default:
                System.out.println("EXITING...");
                System.exit(1);
                break;

        }
        return choice;}

    public static double add(double num1, double num2){
        double result = 0;
        result = num1 + num2;
        return result;
    }
    public static double subtract(double num1, double num2){
        double result = 0;
        result = num1 - num2;
        return result;
    }
    public static double multiply(double num1, double num2){
        double result = 0;
        result = num1 * num2;
        return result;
    }
    public static double divide(double num1, double num2){
        double result = 0;
        result = num1 / num2;
        return result;
    }


}
