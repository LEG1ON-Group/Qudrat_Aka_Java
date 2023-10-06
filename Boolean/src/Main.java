import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Choose (1-35): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("A: ");
                int A1 = scanner.nextInt();
                boolean isPositive1 = A1 > 0;
                System.out.println(isPositive1);
                break;

            case 2:
                System.out.print("A: ");
                int A2 = scanner.nextInt();
                boolean isOdd = A2 % 2 != 0;
                System.out.println(isOdd);
                break;

            case 3:
                System.out.print("A: ");
                int A3 = scanner.nextInt();
                boolean isEven3 = A3 % 2 == 0;
                System.out.println(isEven3);
                break;

            case 4:
                System.out.print("A: ");
                int A4 = scanner.nextInt();
                System.out.print("B: ");
                int B4 = scanner.nextInt();
                boolean condition4 = A4 > 2 && B4 <= 3;
                System.out.println(condition4);
                break;

            case 5:
                System.out.print("A: ");
                int A5 = scanner.nextInt();
                System.out.print("B: ");
                int B5 = scanner.nextInt();
                boolean condition5 = A5 >= 0 || B5 < -2;
                System.out.println(condition5);
                break;

            case 6:
                System.out.print("A: ");
                int A6 = scanner.nextInt();
                System.out.print("B: ");
                int B6 = scanner.nextInt();
                System.out.print("C: ");
                int C6 = scanner.nextInt();
                boolean condition6 = A6 <= B6 && B6 <= C6;
                System.out.println(condition6);
                break;

            case 7:
                System.out.print("A: ");
                int A7 = scanner.nextInt();
                System.out.print("B: ");
                int B7 = scanner.nextInt();
                System.out.print("C: ");
                int C7 = scanner.nextInt();
                boolean condition7 = B7 > A7 && B7 < C7;
                System.out.println(condition7);
                break;

            case 8:
                System.out.print(" A: ");
                int A8 = scanner.nextInt();
                System.out.print("B: ");
                int B8 = scanner.nextInt();
                boolean areBothOdd = A8 % 2 != 0 && B8 % 2 != 0;
                System.out.println(areBothOdd);
                break;

            case 9:
                System.out.print("A: ");
                int A9 = scanner.nextInt();
                System.out.print("B: ");
                int B9 = scanner.nextInt();
                boolean atLeastOneOdd = A9 % 2 != 0 || B9 % 2 != 0;
                System.out.println(atLeastOneOdd);
                break;

            case 10:
                System.out.print("A: ");
                int A10 = scanner.nextInt();
                System.out.print("B: ");
                int B10 = scanner.nextInt();
                boolean onlyOneOdd = (A10 % 2 != 0 && B10 % 2 == 0) || (A10 % 2 == 0 && B10 % 2 != 0);
                System.out.println(onlyOneOdd);
                break;

            case 11:
                System.out.print("A: ");
                int A11 = scanner.nextInt();
                System.out.print("B: ");
                int B11 = scanner.nextInt();
                boolean bothEvenOrOdd = (A11 % 2 == 0 && B11 % 2 == 0) || (A11 % 2 != 0 && B11 % 2 != 0);
                System.out.println(bothEvenOrOdd);
                break;

            case 12:
                System.out.print("A: ");
                int A12 = scanner.nextInt();
                System.out.print("B: ");
                int B12 = scanner.nextInt();
                System.out.print("C: ");
                int C12 = scanner.nextInt();
                boolean allPositive12 = A12 > 0 && B12 > 0 && C12 > 0;
                System.out.println(allPositive12);
                break;

            case 13:
                System.out.print("A: ");
                int A13 = scanner.nextInt();
                System.out.print("B: ");
                int B13 = scanner.nextInt();
                System.out.print("C: ");
                int C13 = scanner.nextInt();
                boolean atLeastOnePositive13 = A13 > 0 || B13 > 0 || C13 > 0;
                System.out.println(atLeastOnePositive13);
                break;

            case 14:
                System.out.print("A: ");
                int A14 = scanner.nextInt();
                System.out.print("B: ");
                int B14 = scanner.nextInt();
                System.out.print("C: ");
                int C14 = scanner.nextInt();
                boolean onlyOnePositive14 = (A14 > 0 && B14 <= 0 && C14 <= 0) || (A14 <= 0 && B14 > 0 && C14 <= 0) || (A14 <= 0 && B14 <= 0 && C14 > 0);
                System.out.println(onlyOnePositive14);
                break;

            case 15:
                System.out.print("A: ");
                int A15 = scanner.nextInt();
                System.out.print("B: ");
                int B15 = scanner.nextInt();
                System.out.print("C: ");
                int C15 = scanner.nextInt();
                boolean onlyTwoPositive15 = (A15 > 0 && B15 > 0 && C15 <= 0) || (A15 > 0 && B15 <= 0 && C15 > 0) || (A15 <= 0 && B15 > 0 && C15 > 0);
                System.out.println(onlyTwoPositive15);
                break;
            case 16:
                System.out.print(": ");
                int positiveInt16 = scanner.nextInt();
                boolean isEvenTwoDigit16 = positiveInt16 >= 10 && positiveInt16 <= 99 && positiveInt16 % 2 == 0;
                System.out.println(isEvenTwoDigit16);
                break;
            case 17:
                System.out.print(": ");
                int positiveInt17 = scanner.nextInt();
                boolean isOddThreeDigit17 = positiveInt17 >= 100 && positiveInt17 <= 999 && positiveInt17 % 2 != 0;
                System.out.println(isOddThreeDigit17);
                break;

            case 18:
                System.out.print("a: ");
                int a18 = scanner.nextInt();
                System.out.print("b: ");
                int b18 = scanner.nextInt();
                System.out.print("c: ");
                int c18 = scanner.nextInt();
                boolean atLeastTwoEqual18 = a18 == b18 || b18 == c18 || a18 == c18;
                System.out.println(atLeastTwoEqual18);
                break;

            case 19:
                System.out.print("a: ");
                int a19 = scanner.nextInt();
                System.out.print("b: ");
                int b19 = scanner.nextInt();
                System.out.print("c: ");
                int c19 = scanner.nextInt();
                boolean hasMutuallyExclusivePair19 = (a19 + b19 == 0) || (b19 + c19 == 0) || (a19 + c19 == 0);
                System.out.println(hasMutuallyExclusivePair19);
                break;

            case 20:
                System.out.print(": ");
                int number20 = scanner.nextInt();
                int digit1 = number20 / 100;
                int digit2 = (number20 / 10) % 10;
                int digit3 = number20 % 10;
                boolean allDifferentDigits20 = digit1 != digit2 && digit1 != digit3 && digit2 != digit3;
                System.out.println(allDifferentDigits20);
                break;
            case 21:
                System.out.print(": ");
                int number21 = scanner.nextInt();
                int digit21_1 = number21 / 100;
                int digit21_2 = (number21 / 10) % 10;
                int digit21_3 = number21 % 10;
                boolean consecutiveDigits21 = (digit21_1 == digit21_2 - 1 && digit21_2 == digit21_3 - 1) || (digit21_1 == digit21_2 + 1 && digit21_2 == digit21_3 + 1);
                System.out.println(consecutiveDigits21);
                break;

            case 22:
                System.out.print(": ");
                int number22 = scanner.nextInt();
                int digit22_1 = number22 / 100;
                int digit22_2 = (number22 / 10) % 10;
                int digit22_3 = number22 % 10;
                boolean ascendingOrDescending22 = (digit22_1 < digit22_2 && digit22_2 < digit22_3) || (digit22_1 > digit22_2 && digit22_2 > digit22_3);
                System.out.println(ascendingOrDescending22);
                break;

            case 23:
                System.out.print(": ");
                int number23 = scanner.nextInt();
                String strNumber23 = Integer.toString(number23);
                String reversedStrNumber23 = new StringBuilder(strNumber23).reverse().toString();
                boolean isPalindrome23 = strNumber23.equals(reversedStrNumber23);
                System.out.println(isPalindrome23);
                break;

            case 24:
                System.out.print("A: ");
                int A24 = scanner.nextInt();
                System.out.print("B: ");
                int B24 = scanner.nextInt();
                System.out.print("C: ");
                int C24 = scanner.nextInt();
                double discriminant24 = B24 * B24 - 4 * A24 * C24;
                boolean hasRealRoot24 = discriminant24 >= 0;
                System.out.println(hasRealRoot24);
                break;

            case 25:
                System.out.print("x: ");
                double x25 = scanner.nextDouble();
                System.out.print("y: ");
                double y25 = scanner.nextDouble();
                boolean isInSecondQuadrant25 = x25 < 0 && y25 > 0;
                System.out.println(isInSecondQuadrant25);
                break;

            case 26:
                System.out.print("x: ");
                double x26 = scanner.nextDouble();
                System.out.print("y: ");
                double y26 = scanner.nextDouble();
                boolean isInFourthQuadrant26 = x26 > 0 && y26 < 0;
                System.out.println(isInFourthQuadrant26);
                break;

            case 27:
                System.out.print("x: ");
                double x27 = scanner.nextDouble();
                System.out.print("y: ");
                double y27 = scanner.nextDouble();
                boolean isInSecondOrThirdQuadrant27 = (x27 < 0 && y27 > 0) || (x27 < 0 && y27 < 0);
                System.out.println(isInSecondOrThirdQuadrant27);
                break;

            case 28:
                System.out.print("x: ");
                double x28 = scanner.nextDouble();
                System.out.print("y: ");
                double y28 = scanner.nextDouble();
                boolean isInFirstOrThirdQuadrant28 = (x28 > 0 && y28 > 0) || (x28 > 0 && y28 < 0);
                System.out.println(isInFirstOrThirdQuadrant28);
                break;

            case 29:
                System.out.print("x: ");
                double x29 = scanner.nextDouble();
                System.out.print("y: ");
                double y29 = scanner.nextDouble();
                System.out.print("x1: ");
                double x1_29 = scanner.nextDouble();
                System.out.print("x2: ");
                double x2_29 = scanner.nextDouble();
                System.out.print("y1: ");
                double y1_29 = scanner.nextDouble();
                System.out.print("y2: ");
                double y2_29 = scanner.nextDouble();
                boolean isInsideRectangle29 = x29 >= x1_29 && x29 <= x2_29 && y29 <= y1_29 && y29 >= y2_29;
                System.out.println(isInsideRectangle29);
                break;

            case 30:
                System.out.print("a: ");
                int a30 = scanner.nextInt();
                System.out.print("b: ");
                int b30 = scanner.nextInt();
                System.out.print("c: ");
                int c30 = scanner.nextInt();
                boolean isEquilateral30 = a30 == b30 && b30 == c30;
                System.out.println(isEquilateral30);
                break;

            case 31:
                System.out.print("a: ");
                int a31 = scanner.nextInt();
                System.out.print("b: ");
                int b31 = scanner.nextInt();
                System.out.print("c: ");
                int c31 = scanner.nextInt();
                boolean isIsosceles31 = (a31 == b31 && b31 != c31) || (a31 == c31 && c31 != b31) || (b31 == c31 && c31 != a31);
                System.out.println(isIsosceles31);
                break;

            case 32:
                System.out.print("a: ");
                int a32 = scanner.nextInt();
                System.out.print("b: ");
                int b32 = scanner.nextInt();
                System.out.print("c: ");
                int c32 = scanner.nextInt();
                boolean isRightAngled32 = (a32 * a32 == b32 * b32 + c32 * c32) || (b32 * b32 == a32 * a32 + c32 * c32) || (c32 * c32 == a32 * a32 + b32 * b32);
                System.out.println(isRightAngled32);
                break;

            case 33:
                System.out.print("a: ");
                int a33 = scanner.nextInt();
                System.out.print("b: ");
                int b33 = scanner.nextInt();
                System.out.print("c: ");
                int c33 = scanner.nextInt();
                boolean canFormTriangle33 = (a33 + b33 > c33) && (a33 + c33 > b33) && (b33 + c33 > a33);
                System.out.println(canFormTriangle33);
                break;

            case 34:
                System.out.print("x: ");
                int x34 = scanner.nextInt();
                System.out.print("y: ");
                int y34 = scanner.nextInt();
                boolean isWhite34 = (x34 + y34) % 2 == 0;
                System.out.println(isWhite34);
                break;

            case 35:
                System.out.print("(x1, y1) and (x2, y2): ");
                int x1_35 = scanner.nextInt();
                int y1_35 = scanner.nextInt();
                int x2_35 = scanner.nextInt();
                int y2_35 = scanner.nextInt();
                boolean areOnTheSameDiagonal35 = Math.abs(x1_35 - x2_35) == Math.abs(y1_35 - y2_35);
                System.out.println(areOnTheSameDiagonal35);
                break;
        }
    }
}