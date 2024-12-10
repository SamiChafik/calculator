import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A,B,ch;
        int Addition,Subtraction,Multiplication,Division,Exponentiation,Square_Root,Factorial;

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
            System.out.print("\n=== Menu ===\n1-Addition (+)\n2-Subtraction (-)\n3-Multiplication (*)\n4-Division (/)\n5-Exponentiation (Power)\n6-Square Root\n7-Factorial\n0-Exit\n\nEnter your choice : ");
            ch = chx.nextInt();

            if (ch < 0 || ch > 7) {
                System.out.println("=> Invalid choice try again.");
                continue;
            }

            switch (ch) {
                case 1:
                    Addition = A + B;
                    System.out.println(A + " + " + B + " is : " + Addition);
                    break;
                case 2:
                    Subtraction = A - B;
                    System.out.println(A + " - " + B + " is : " + Subtraction);
                    break;
                case 3:
                    Multiplication = A * B;
                    System.out.println(A + " x " + B + " is : " + Multiplication);
                    break;
                case 4:
                    Division = A / B;
                    System.out.println(A + " / " + B + " is : " + Division);
                    break;
                case 5:
                    int ch2;
                    double power1,power2;
                    Scanner chx2 = new Scanner(System.in);
                    System.out.print("\n1- A power B\n2- B power A\n0- Return\nEntre your choice : ");
                    ch2 = chx2.nextInt();

                    if (ch2 < 0 || ch2 > 2) {
                        System.out.println("=> Invalid choice try again.");
                        continue;
                    }

                    if (ch2 == 1) {
                        power1 = Math.pow(A, B);
                        System.out.println(A + " power " + B + " is : " + power1);
                    } else if (ch2 == 2) {
                        power2 = Math.pow(B, A);
                        System.out.println(B + " power " + A + " is : " + power2);
                    } else break;
                case 6:
                    int ch3;
                    Scanner chx3 = new Scanner(System.in);
                    System.out.print("\n1- Square Root of A\n2- Square Root of B\n0- Return\nentre your choice : ");
                    ch3 = chx3.nextInt();

                    if (ch3 < 0 || ch3 > 2) {
                        System.out.println("=> Invalid choice try again.");
                        continue;
                    }

                    if (ch3 == 1) {
                        System.out.println("Square Root of " + A + " is : " + Math.sqrt(A));
                    } else if (ch3 == 2) {
                        System.out.println("Square Root of " + B + " is : " + Math.sqrt(B));
                    }
                    break;

                case 7:
                    int ch4,i;
                    Scanner chx4 = new Scanner(System.in);
                    System.out.print("\n1- Factorial of A\n2- Factorial of B\n0- Return\nEntre your choice : ");
                    ch4 = chx4.nextInt();

                    if (ch4 < 0 || ch4 > 2) {
                        System.out.println("=> Invalid choice try again.");
                        continue;
                    }

                    if (ch4 == 1) {
                        if (A < 0) {
                            System.out.println("Factorial of a negative number is not defined.");
                            break;
                        } else {
                            long factorial = 1;
                            for (i = 1; i <= A; i++) {
                                factorial *= i;
                            }
                            System.out.println("Factorial " + A + " is : " + factorial);
                        }
                    } else if (ch4 == 2) {
                        if (B < 0) {
                            System.out.println("Factorial of a negative number is not defined.");
                            break;
                        } else {
                            long factorial = 1;
                            for (i = 1; i <= B; i++) {
                                factorial *= i;
                            }
                            System.out.println("Factorial " + B + "is : " + factorial);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
            }
        } while (ch!=0);
    }
}