import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();

        int A, B, N, K, n, a, k, result;

        switch (option) {
            case 1:
                A = scanner.nextInt();
                B = scanner.nextInt();
                result = 0;
                while (A >= B) {
                    A -= B;
                    result = A;
                }
                System.out.println("Empty part of section A: " + result);
                break;
            case 2:
                A = scanner.nextInt();
                B = scanner.nextInt();
                result = 0;
                while (A >= B) {
                    A -= B;
                    result++;
                }
                System.out.println("Sections B can be placed in section A: " + result);
                break;
            case 3:
                N = scanner.nextInt();
                K = scanner.nextInt();
                result = 0;
                while (N >= K) {
                    N -= K;
                    result++;
                }
                System.out.println("Remainder: " + N + ", Quotient: " + result);
                break;
            case 4:
                n = scanner.nextInt();
                while (n % 3 == 0) {
                    n /= 3;
                }
                if (n == 1) {
                    System.out.println("power of 3");
                } else {
                    System.out.println("not power of 3");
                }
                break;
            case 5:
                n = scanner.nextInt();
                k = 0;
                while (n > 1) {
                    n /= 2;
                    k++;
                }
                System.out.println("k: " + k);
                break;
            case 6:
                n = scanner.nextInt();
                result = 1;
                while (n > 0) {
                    result *= n;
                    n -= 2;
                }
                System.out.println("n!!: " + result);
                break;
            case 7:
                n = scanner.nextInt();
                k = 1;
                while (k * k <= n) {
                    k++;
                }
                System.out.println("k: " + k);
                break;
            case 8:
                n = scanner.nextInt();
                k = 1;
                while (k * k <= n) {
                    k++;
                }
                k--;
                System.out.println("k: " + k);
                break;
            case 9:
                n = scanner.nextInt();
                k = 1;
                while (3 * k <= n) {
                    k++;
                }
                System.out.println("k: " + k);
                break;
            case 10:
                n = scanner.nextInt();
                k = n / 3;
                System.out.println("k: " + k);
                break;
            case 11:
                n = scanner.nextInt();
                result = 0;
                k = 1;
                while (result < n) {
                    result += k;
                    k++;
                }
                System.out.println("k: " + k + ", Sum: " + result);
                break;
            case 12:
                n = scanner.nextInt();
                result = 0;
                k = 1;
                while (result <= n) {
                    result += k;
                    k++;
                }
                k--;
                System.out.println("k: " + k + ", Sum: " + result);
                break;
            case 13:
                a = scanner.nextInt();
                double sum13 = 0;
                k = 1;
                while (sum13 < a) {
                    sum13 += 1.0 / k;
                    k++;
                }
                System.out.println("k: " + k + ", Sum: " + sum13);
                break;
            case 14:
                a = scanner.nextInt();
                double sum14 = 0;
                k = 1;
                while (sum14 <= a) {
                    sum14 += 1.0 / k;
                    k++;
                }
                k--;
                System.out.println("k: " + k + ", Sum: " + sum14);
                break;
            default:
                System.out.println("Invalid option!");
        }

        scanner.close();
    }
}
