import java.util.Locale;
import java.util.Scanner;

public class Main {

    static double A, B;
    static Scanner num = new Scanner(System.in);
    static {
        num.useLocale(Locale.US);
    }

    static int Menu () {
        int ch;
        //Scanner chx = new Scanner(System.in);
        System.out.print("\n=== Menu ===\n1-Addition (+)\n2-Subtraction (-)\n3-Multiplication (*)\n4-Division (/)\n5-Exponentiation (Power)\n6-Square Root\n7-Factorial\n0-Exit\n\nEnter your choice : ");
        ch = num.nextInt();
        return ch;
    }

    static double num1(){
        System.out.print("\nEntre two numbers\nA: "); //println to add new line after the text
        A = num.nextDouble();
        return A;
    }

    static double num2(){
        System.out.print("\nB: "); //println to add new line after the text
        B = num.nextDouble();
        return B;
    }

    static void addition() {
        A = num1();
        B = num2();
        System.out.println(A + " + " + B + " is : " + (A + B) + "\n");
    }

    static void subtraction() {
        A = num1();
        B = num2();
        System.out.println(A + " - " + B + " is : " + (A - B));
    }

    static void multiplication() {
        A = num1();
        B = num2();
        System.out.println(A + " x " + B + " is : " + (A * B));
    }

    static void division() {
        A = num1();
        B = num2();
        if (B == 0) {
            System.out.println("You cant divide by 0");
        } else {
            System.out.println(A + " / " + B + " is : " + (A / B));
        }
    }

    static void power() {
        System.out.print("\nEnter a number\nA: "); //println to add new line after the text
        A = num.nextDouble();
        System.out.print("\nenter the power: ");
        B = num.nextDouble();
        System.out.println(A + " power " + B + " is : " + Math.pow(A, B));
    }

    static void square_Root() {
        System.out.print("\nEnter a number\nA: ");//println to add new line after the text
        A = num.nextDouble();
        System.out.println("Square Root of " + A + " is : " + Math.sqrt(A));
    }

    static void factorial() {
        int i;

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
            ch = Menu();
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
                default:
                    System.out.println("=> Invalid choice try again.");
            }
        } while (ch!=0);
    }
}