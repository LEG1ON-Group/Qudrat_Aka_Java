import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Case >");
        int problemNumber = scanner.nextInt();

        switch (problemNumber) {
            case 1:
                int k1 = scanner.nextInt();
                int n1 = scanner.nextInt();
                System.out.println(k1 * n1);
                break;

            case 2:
                int a2 = scanner.nextInt();
                int b2 = scanner.nextInt();
                for (int i = a2; i <= b2; i++) {
                    System.out.println(i);
                }
                System.out.println(b2 - a2 + 1);
                break;

            case 3:
                int a3 = scanner.nextInt();
                int b3 = scanner.nextInt();
                for (int i = b3 - 1; i > a3; i--) {
                    System.out.println(i);
                }
                System.out.println(b3 - a3 - 1);
                break;

            case 4:
                double price4 = scanner.nextDouble();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(price4 * i);
                }
                break;

            case 5:
                double price5 = scanner.nextDouble();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(price5 * (i / 10.0));
                }
                break;

            case 6:
                double price6 = scanner.nextDouble();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(price6 * (i / 10.0));
                }
                break;

            case 7:
                int a7 = scanner.nextInt();
                int b7 = scanner.nextInt();
                int sum7 = 0;
                for (int i = a7; i <= b7; i++) {
                    sum7 += i;
                }
                System.out.println(sum7);
                break;

            case 8:
                int a8 = scanner.nextInt();
                int b8 = scanner.nextInt();
                int product8 = 1;
                for (int i = a8; i <= b8; i++) {
                    product8 *= i;
                }
                System.out.println(product8);
                break;

            case 9:
                int a9 = scanner.nextInt();
                int b9 = scanner.nextInt();
                int sum9 = 0;
                for (int i = a9; i <= b9; i++) {
                    sum9 += i * i;
                }
                System.out.println(sum9);
                break;

            case 10:
                int n10 = scanner.nextInt();
                double sum10 = 0.0;
                for (int i = 1; i <= n10; i++) {
                    sum10 += 1.0 / i;
                }
                System.out.println(sum10);
                break;

            case 11:
                int n11 = scanner.nextInt();
                int sum11 = 0;
                for (int i = 0; i <= n11; i++) {
                    sum11 += (n11 + i) * (n11 + i);
                }
                System.out.println(sum11);
                break;

            case 12:
                int n12 = scanner.nextInt();
                double product12 = 1.0;
                for (double i = 1.1; i <= n12 + 0.1; i += 0.1) {
                    product12 *= i;
                }
                System.out.println(product12);
                break;

            case 13:
                int n13 = scanner.nextInt();
                double sum13 = 0.0;
                int sign = 1;
                for (double i = 1.1; i <= n13 + 0.1; i += 0.1) {
                    sum13 += sign * i;
                    sign *= -1;
                }
                System.out.println(sum13);
                break;

            case 14:
                int n14 = scanner.nextInt();
                int sum14 = 0;
                for (int i = 1; i <= n14; i++) {
                    sum14 += 2 * i - 1;
                    System.out.println(sum14);
                }
                break;

            case 15:
                int n15 = scanner.nextInt();
                double alpha15 = scanner.nextDouble();
                double result15 = Math.pow(alpha15, n15);
                System.out.println(result15);
                break;

            case 16:
                int n16 = scanner.nextInt();
                double alpha16 = scanner.nextDouble();
                for (int i = 1; i <= n16; i++) {
                    double result16 = Math.pow(alpha16, i);
                    System.out.println(result16);
                }
                break;

            case 17:
                int n17 = scanner.nextInt();
                double alpha17 = scanner.nextDouble();
                double sum17 = 0.0;
                for (int i = 0; i <= n17; i++) {
                    sum17 += Math.pow(alpha17, i);
                }
                System.out.println(sum17);
                break;

            case 18:
                int n18 = scanner.nextInt();
                double alpha18 = scanner.nextDouble();
                int sum18 = 0;
                int sign18 = -1;
                for (int i = 0; i <= n18; i++) {
                    sum18 += sign18 * Math.pow(8, i);
                    sign18 *= -1;
                }
                System.out.println(sum18);
                break;

            case 19:
                int n19 = scanner.nextInt();
                int factorial = 1;
                for (int i = 1; i <= n19; i++) {
                    factorial *= i;
                }
                System.out.println(factorial);
                break;

            case 20:
                int n20 = scanner.nextInt();
                int sum20 = 0;
                int factorial20 = 1;
                for (int i = 1; i <= n20; i++) {
                    factorial20 *= i;
                    sum20 += factorial20;
                }
                System.out.println(sum20);
                break;

            default:
                System.out.println("Invalid problem number.");
        }
    }
}
