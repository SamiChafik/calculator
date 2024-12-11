import java.util.Locale;
import java.util.Scanner;

public class Main {

static double A, B;

    static void addition() {

        Scanner num = new Scanner(System.in);
        num.useLocale(Locale.US);
        System.out.print("\nEnter two numbers\nA: "); //println to add new line after the text
        A = num.nextDouble();
        System.out.print("B: ");
        B = num.nextDouble();
        System.out.println(A + " + " + B + " is : " + (A + B) + "\n");
    }

    static void subtraction() {
        Scanner num = new Scanner(System.in);
        num.useLocale(Locale.US);
        System.out.print("\nEnter two numbers\nA: "); //println to add new line after the text
        A = num.nextDouble();
        System.out.print("B: ");
        B = num.nextDouble();
        System.out.println(A + " - " + B + " is : " + (A - B));
    }

    static void multiplication() {
        Scanner num = new Scanner(System.in);
        num.useLocale(Locale.US);
        System.out.print("\nEnter two numbers\nA: "); //println to add new line after the text
        A = num.nextDouble();
        System.out.print("B: ");
        B = num.nextDouble();
        System.out.println(A + " x " + B + " is : " + (A * B));
    }

    static void division() {
        Scanner num = new Scanner(System.in);
        num.useLocale(Locale.US);
        System.out.print("\nEnter two numbers\nA: "); //println to add new line after the text
        A = num.nextDouble();
        System.out.print("B: ");
        B = num.nextDouble();
        if (A == 0 || B == 0) {
            System.out.println("You cant divide by 0");
        } else {
            System.out.println(A + " / " + B + " is : " + (A / B));
        }
    }

    static void power() {
        Scanner num = new Scanner(System.in);
        num.useLocale(Locale.US);
        System.out.print("\nEnter a number\nA: "); //println to add new line after the text
        A = num.nextDouble();
        System.out.print("\nenter the power: ");
        B = num.nextDouble();
        System.out.println(A + " power " + B + " is : " + Math.pow(A, B));
    }

    static void square_Root() {
        Scanner num = new Scanner(System.in);
        num.useLocale(Locale.US);
        System.out.print("\nEnter a number\nA: ");//println to add new line after the text
        A = num.nextDouble();
        System.out.println("Square Root of " + A + " is : " + Math.sqrt(A));
    }

    static void factorial() {
        int i;

        Scanner num = new Scanner(System.in);
        num.useLocale(Locale.US);
        System.out.print("\nEnter a number\nA: ");//println to add new line after the text
        A = num.nextDouble();

        if (A < 0) {
            System.out.println("Factorial of a negative number is not defined.");
            return;
        } else {
            long factorial = 1;
            for (i = 1; i <= A; i++) {
                factorial *= i;
            }
            System.out.println("Factorial " + A + " is : " + factorial);
        }
    }

    public static void main(String[] args) {
        int ch;


        do {

            Scanner chx = new Scanner(System.in);
            System.out.print("\n=== Menu ===\n1-Addition (+)\n2-Subtraction (-)\n3-Multiplication (*)\n4-Division (/)\n5-Exponentiation (Power)\n6-Square Root\n7-Factorial\n0-Exit\n\nEnter your choice : ");
            ch = chx.nextInt();

            if (ch < 0 || ch > 7) {
                System.out.println("=> Invalid choice try again.");
                continue;
            }

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