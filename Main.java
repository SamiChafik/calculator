import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static double A, B;
    static int ch;
    static Scanner num = new Scanner(System.in);
    static {
        num.useLocale(Locale.US);
    }

    static void Menu() {
        while (true) {
            try {
                System.out.print("\n=== Menu ===\n1-Addition (+)\n2-Subtraction (-)\n3-Multiplication (*)\n4-Division (/)\n5-Exponentiation (Power)\n6-Square Root\n7-Factorial\n0-Exit\n\nEnter your choice : ");
                ch = num.nextInt();
                if (ch >= 0 && ch <= 7) {
                    break;
                }
                System.out.println("=> Invalid choice. Please select a valid option (0-7).");
            } catch (InputMismatchException e) {
                System.err.println("=> Invalid input. Please enter a choice.");
                num.next();
            }
        }
    }

    static void numInput(){
        while (true) {
            try {
                System.out.print("\nEntre two numbers\nA: "); //println to add new line after the text
                A = num.nextDouble();
                System.out.print("B: "); //println to add new line after the text
                B = num.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.err.println("=> Invalid input. Please enter a number.");
                num.next();
            }
        }
    }

    static void addition() {
        numInput();
        System.out.println("\n" + A + " + " + B + " is : " + (A + B) + "\n");
    }

    static void subtraction() {
        numInput();
        System.out.println("\n" + A + " - " + B + " is : " + (A - B));
    }

    static void multiplication() {
        numInput();
        System.out.println("\n" + A + " x " + B + " is : " + (A * B));
    }

    static void division() {
        numInput();
        if (B == 0) {
            System.out.println("You cant divide by 0");
        } else {
            System.out.println("\n" + A + " / " + B + " is : " + (A / B));
        }
    }

    static void power() {
        while (true) {
            try {
                System.out.print("\nEnter a number\nA: "); //println to add new line after the text
                A = num.nextDouble();
                System.out.print("Enter the power: ");
                B = num.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("=> Invalid input. Please enter a number.");
                num.next();
            }
        }
        System.out.println("\n" + A + " power " + B + " is : " + Math.pow(A, B));
    }

    static void square_Root() {
        while (true) {
            try {
                System.out.print("\nEnter a number\nA: ");//println to add new line after the text
                A = num.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("=> Invalid input. Please enter a number.");
                num.next();
            }
        }
        System.out.println("Square Root of " + A + " is : " + Math.sqrt(A));
    }

    static void factorial() {
        int i;
        while (true) {
            try {
                System.out.print("\nEnter a number\nA: ");//println to add new line after the text
                A = num.nextDouble();
                break;
            } catch (Exception e) {
                System.out.println("=> Invalid input. Please enter a number.");
                num.next();
            }
        }

        if (A < 0) {
            System.out.println("Factorial of a negative number is not defined.");
        } else {
            long factorial = 1;
            for (i = 1; i <= A; i++) {
                factorial *= i;
            }
            System.out.println("Factorial " + A + " is : " + factorial);
        }
    }

    public static void main(String[] args) {
        do {
            Menu();
            switch (ch) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    square_Root();
                    break;
                case 7:
                    factorial();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
            }
        } while (ch!=0);
    }
}