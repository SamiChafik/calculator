import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A,B,ch;
        int Addition;

        Scanner num = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        System.out.print("enter two numbers\nA: "); //println to add new line after the text
        A = num.nextInt();
        System.out.print("B: ");
        B = num2.nextInt();
        /*total = A + B;
        System.out.println(A +" + " + B + " is : " + total);*/
        do {
            Scanner chx = new Scanner(System.in);
            System.out.print("=== Menu ===\n1-Addition (+)\n2-Subtraction (-)\n3-Multiplication (*)\n4-Division (/)\n5-Exponentiation (Power)\n6-Square Root\n7-Factorial\n0-Exit\n\nenter your choice : ");
            ch = chx.nextInt();

            if (ch < 0 || ch > 7) {
                continue;
            }

            switch (ch) {
                case 1:
                    Addition = A + B;
                    System.out.println(A + " + " + B + " is : " + Addition);
                    break;
                case 2:
                    System.out.println("test 2");
                    break;
                case 3:
                    System.out.println("test 3");
                    break;
                case 4:
                    System.out.println("test 4");
                    break;
                case 5:
                    System.out.println("test 5");
                    break;
                case 6:
                    System.out.println("test 6");
                    break;
                case 7:
                    System.out.println("test 7");
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
            }
        } while (ch!=0);
    }
}