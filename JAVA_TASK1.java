import java.util.Scanner;

public class JAVA_TASK1 {

    static boolean chk_prime(int n) {
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cnt++;
            }
        }
        if (cnt == 2) {
            return true;
        } else {
            return false;
        }
    }

    static boolean chk_pal(int n) {
        int num = n;
        int rev = 0;
        while (n != 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n = n / 10;
        }
        if (rev == num) {
            return true;
        } else {
            return false;
        }
    }

    static long cal_fact(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static void show_fib(int n) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ch = 0;

        while (ch != 5) {

            System.out.println("\nNumber Utility Program");
            System.out.println("1 Prime");
            System.out.println("2 Palindrome");
            System.out.println("3 Factorial");
            System.out.println("4 Fibonacci");
            System.out.println("5 Exit");
            System.out.print("Enter choice: ");

            ch = sc.nextInt();

            switch (ch) {

                case 1:
                    System.out.print("Enter number: ");
                    int p = sc.nextInt();
                    if (chk_prime(p)) {
                        System.out.println("Prime number");
                    } else {
                        System.out.println("Not a prime number");
                    }
                    break;

                case 2:
                    System.out.print("Enter number: ");
                    int q = sc.nextInt();
                    if (chk_pal(q)) {
                        System.out.println("Palindrome number");
                    } else {
                        System.out.println("Not a palindrome number");
                    }
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    int f = sc.nextInt();
                    if (f < 0) {
                        System.out.println("Invalid input");
                    } else {
                        System.out.println("Factorial is " + cal_fact(f));
                    }
                    break;

                case 4:
                    System.out.print("Enter terms: ");
                    int t = sc.nextInt();
                    if (t <= 0) {
                        System.out.println("Invalid input");
                    } else {
                        show_fib(t);
                    }
                    break;

                case 5:
                    System.out.println("Program ended");
                    break;

                default:
                    System.out.println("Wrong choice");
            }
        }
        sc.close();
    }
}
