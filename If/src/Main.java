import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(":");
        int issueNumber = scanner.nextInt();

        switch (issueNumber) {
            case 1:
                System.out.println("if1:");
                int if1Number = scanner.nextInt();
                if1Number = (if1Number > 0) ? if1Number + 1 : if1Number;
                System.out.println(if1Number);
                break;

            case 2:
                System.out.println("if2:");
                int if2Number = scanner.nextInt();
                if (if2Number > 0) {
                    if2Number++;
                } else {
                    if2Number -= 2;
                }
                System.out.println(if2Number);
                break;

            case 3:
                System.out.println("if3:");
                int if3Number = scanner.nextInt();
                if (if3Number > 0) {
                    if3Number++;
                } else if (if3Number < 0) {
                    if3Number -= 2;
                } else {
                    if3Number += 10;
                }
                System.out.println(if3Number);
                break;

            case 4:
                System.out.println("if4:");
                int if4Num1 = scanner.nextInt();
                int if4Num2 = scanner.nextInt();
                int if4Num3 = scanner.nextInt();
                int if4Count = 0;
                if (if4Num1 > 0) {
                    if4Count++;
                }
                if (if4Num2 > 0) {
                    if4Count++;
                }
                if (if4Num3 > 0) {
                    if4Count++;
                }
                System.out.println(if4Count);
                break;

            case 5:
                System.out.println("if5:");
                int if5Num1 = scanner.nextInt();
                int if5Num2 = scanner.nextInt();
                int if5Num3 = scanner.nextInt();
                int if5PosCount = 0;
                int if5NegCount = 0;
                if (if5Num1 > 0) {
                    if5PosCount++;
                } else if (if5Num1 < 0) {
                    if5NegCount++;
                }
                if (if5Num2 > 0) {
                    if5PosCount++;
                } else if (if5Num2 < 0) {
                    if5NegCount++;
                }
                if (if5Num3 > 0) {
                    if5PosCount++;
                } else if (if5Num3 < 0) {
                    if5NegCount++;
                }
                System.out.println(if5PosCount);
                System.out.println(if5NegCount);
                break;

            case 6:
                System.out.println("if6:");
                int if6Num1 = scanner.nextInt();
                int if6Num2 = scanner.nextInt();
                int if6Max = (if6Num1 > if6Num2) ? if6Num1 : if6Num2;
                System.out.println(if6Max);
                break;

            case 7:
                System.out.println("if7:");
                int if7Num1 = scanner.nextInt();
                int if7Num2 = scanner.nextInt();
                int if7MinSeq = (if7Num1 < if7Num2) ? 1 : 2;
                System.out.println(if7MinSeq);
                break;

            case 8:
                System.out.println("if8:");
                int if8Num1 = scanner.nextInt();
                int if8Num2 = scanner.nextInt();
                if (if8Num1 > if8Num2) {
                    System.out.println(if8Num1 + " " + if8Num2);
                } else {
                    System.out.println(if8Num2 + " " + if8Num1);
                }
                break;

            case 9:
                System.out.println("A and B for if9:");
                double if9A = scanner.nextDouble();
                double if9B = scanner.nextDouble();
                if (if9A > if9B) {
                    double temp = if9A;
                    if9A = if9B;
                    if9B = temp;
                }
                System.out.println("A: " + if9A + ", B: " + if9B);
                break;

            case 10:
                System.out.println("A and B for if10:");
                int if10A = scanner.nextInt();
                int if10B = scanner.nextInt();
                if (if10A != if10B) {
                    int sum = if10A + if10B;
                    if10A = sum;
                    if10B = sum;
                }
                System.out.println("A: " + if10A + ", B: " + if10B);
                break;

            case 11:
                System.out.println("A and B for if11:");
                int if11A = scanner.nextInt();
                int if11B = scanner.nextInt();
                if (if11A != if11B) {
                    int max = Math.max(if11A, if11B);
                    if11A = max;
                    if11B = max;
                }
                System.out.println("A: " + if11A + ", B: " + if11B);
                break;

            case 12:
                System.out.println("if12:");
                double if12Num1 = scanner.nextDouble();
                double if12Num2 = scanner.nextDouble();
                double if12Num3 = scanner.nextDouble();
                double if12Min = Math.min(Math.min(if12Num1, if12Num2), if12Num3);
                System.out.println(if12Min);
                break;

            case 13:
                System.out.println("if13:");
                double if13Num1 = scanner.nextDouble();
                double if13Num2 = scanner.nextDouble();
                double if13Num3 = scanner.nextDouble();
                double if13Sum = if13Num1 + if13Num2 + if13Num3;
                double if13Max = Math.max(Math.max(if13Num1, if13Num2), if13Num3);
                double if13Min = Math.min(Math.min(if13Num1, if13Num2), if13Num3);
                double if13Average = (if13Sum - if13Max - if13Min) / 1.0;
                System.out.println(if13Average);
                break;

            case 14:
                System.out.println("if14:");
                double if14Num1 = scanner.nextDouble();
                double if14Num2 = scanner.nextDouble();
                double if14Num3 = scanner.nextDouble();
                double if14Min = Math.min(Math.min(if14Num1, if14Num2), if14Num3);
                double if14Max = Math.max(Math.max(if14Num1, if14Num2), if14Num3);
                System.out.println(if14Min + ", " + if14Max);
                break;

            case 15:
                System.out.println("if15:");
                int if15Num1 = scanner.nextInt();
                int if15Num2 = scanner.nextInt();
                int if15Num3 = scanner.nextInt();
                if ((if15Num1 + if15Num2) > (if15Num1 + if15Num3) && (if15Num1 + if15Num2) > (if15Num2 + if15Num3)) {
                    System.out.println(if15Num1 + " and " + if15Num2);
                } else if ((if15Num1 + if15Num3) > (if15Num1 + if15Num2) && (if15Num1 + if15Num3) > (if15Num2 + if15Num3)) {
                    System.out.println(if15Num1 + " and " + if15Num3);
                } else {
                    System.out.println(if15Num2 + " and " + if15Num3);
                }
                break;

            case 16:
                System.out.println("A, B, and C for if16:");
                double if16A = scanner.nextDouble();
                double if16B = scanner.nextDouble();
                double if16C = scanner.nextDouble();
                if (if16A <= if16B && if16B <= if16C) {
                    if16A *= 2;
                    if16B *= 2;
                    if16C *= 2;
                } else {
                    if16A = -if16A;
                    if16B = -if16B;
                    if16C = -if16C;
                }
                System.out.println("A: " + if16A + ", B: " + if16B + ", C: " + if16C);
                break;

            case 17:
                System.out.println("A, B, and C for if17:");
                double if17A = scanner.nextDouble();
                double if17B = scanner.nextDouble();
                double if17C = scanner.nextDouble();
                if ((if17A <= if17B && if17B <= if17C) || (if17A >= if17B && if17B >= if17C)) {
                    if17A *= 2;
                    if17B *= 2;
                    if17C *= 2;
                } else {
                    if17A = -if17A;
                    if17B = -if17B;
                    if17C = -if17C;
                }
                System.out.println("A: " + if17A + ", B: " + if17B + ", C: " + if17C);
                break;

            case 18:
                System.out.println("if18:");
                int if18Num1 = scanner.nextInt();
                int if18Num2 = scanner.nextInt();
                int if18Num3 = scanner.nextInt();
                if (if18Num1 == if18Num2) {
                    System.out.println("3");
                } else if (if18Num2 == if18Num3) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
                break;

            case 19:
                System.out.println("if19:");
                int if19Num1 = scanner.nextInt();
                int if19Num2 = scanner.nextInt();
                int if19Num3 = scanner.nextInt();
                int if19Num4 = scanner.nextInt();
                if (if19Num1 == if19Num2 && if19Num1 == if19Num3) {
                    System.out.println("4");
                } else if (if19Num2 == if19Num3 && if19Num2 == if19Num4) {
                    System.out.println("1");
                } else if (if19Num1 == if19Num3 && if19Num1 == if19Num4) {
                    System.out.println("2");
                } else {
                    System.out.println("3");
                }
                break;

            case 20:
                System.out.println("A, B, and C for if20:");
                double if20A = scanner.nextDouble();
                double if20B = scanner.nextDouble();
                double if20C = scanner.nextDouble();
                double distanceAB = Math.abs(if20A - if20B);
                double distanceAC = Math.abs(if20A - if20C);
                double distanceBC = Math.abs(if20B - if20C);
                double minDistance = Math.min(Math.min(distanceAB, distanceAC), distanceBC);
                System.out.println("A: " + ((minDistance == distanceAB) ? "B" : (minDistance == distanceAC) ? "C" : "B"));
                System.out.println("Distance between point A and the closest point: " + minDistance);
                break;

            case 21:
                System.out.println("if21:");
                int if21Number = scanner.nextInt();
                if (if21Number == 0) {
                    System.out.println("Output: 0");
                } else if (if21Number > 0) {
                    if (if21Number % 2 == 0) {
                        System.out.println("Output: 2");
                    } else {
                        System.out.println("Output: 1");
                    }
                } else {
                    if (if21Number % 2 == 0) {
                        System.out.println("Output: -2");
                    } else {
                        System.out.println("Output: -1");
                    }
                }
                break;

            case 22:
                System.out.println("x and y for if22:");
                double if22X = scanner.nextDouble();
                double if22Y = scanner.nextDouble();
                if (if22X > 0 && if22Y > 0) {
                    System.out.println("Quadrant: I");
                } else if (if22X < 0 && if22Y > 0) {
                    System.out.println("Quadrant: II");
                } else if (if22X < 0 && if22Y < 0) {
                    System.out.println("Quadrant: III");
                } else if (if22X > 0 && if22Y < 0) {
                    System.out.println("Quadrant: IV");
                }
                break;

            case 23:
                System.out.println("(x1, y1), (x2, y2), (x3, y3) for if23:");
                double x1 = scanner.nextDouble();
                double y1 = scanner.nextDouble();
                double x2 = scanner.nextDouble();
                double y2 = scanner.nextDouble();
                double x3 = scanner.nextDouble();
                double y3 = scanner.nextDouble();
                double x4, y4;

                if (x1 == x2) {
                    x4 = x3;
                } else if (x1 == x3) {
                    x4 = x2;
                } else {
                    x4 = x1;
                }

                if (y1 == y2) {
                    y4 = y3;
                } else if (y1 == y3) {
                    y4 = y2;
                } else {
                    y4 = y1;
                }

                System.out.println("Coordinates of the fourth end: (" + x4 + ", " + y4 + ")");
                break;

            case 24:
                System.out.println("x for if24:");
                double if24X = scanner.nextDouble();
                double if24Result;
                if (if24X > 0) {
                    if24Result = 2 - Math.sin(if24X);
                } else {
                    if24Result = if24X - 6;
                }
                System.out.println(if24Result);
                break;

            case 25:
                System.out.println("x for if25:");
                double if25X = scanner.nextDouble();
                double if25Result;
                if (if25X < -2 || if25X > 2) {
                    if25Result = 2 * if25X;
                } else {
                    if25Result = -3 * if25X;
                }
                System.out.println(if25Result);
                break;

            case 26:
                System.out.println("x for if26:");
                double if26X = scanner.nextDouble();
                double if26Result;
                if (if26X <= 0) {
                    if26Result = -if26X;
                } else if (if26X < 2) {
                    if26Result = if26X;
                } else {
                    if26Result = 4;
                }
                System.out.println(if26Result);
                break;

            case 27:
                System.out.println("x for if27:");
                double if27X = scanner.nextDouble();
                double if27Result;
                if (if27X < 0) {
                    if27Result = 0;
                } else if (if27X >= 0 && if27X < 1) {
                    if27Result = 1;
                } else if (if27X >= 1 && if27X < 2) {
                    if27Result = -1;
                } else {
                    if27Result = 0;
                }
                System.out.println(if27Result);
                break;

            case 28:
                System.out.println("Year for if28:");
                int if28Year = scanner.nextInt();
                int if28Days;
                if ((if28Year % 4 == 0 && if28Year % 100 != 0) || (if28Year % 400 == 0)) {
                    if28Days = 366;
                } else {
                    if28Days = 365;
                }
                System.out.println("Number of days in the year " + if28Year + ": " + if28Days);
                break;

            case 29:
                System.out.println("if29:");
                int if29Number = scanner.nextInt();
                if (if29Number > 0) {
                    if (if29Number % 2 == 0) {
                        System.out.println("Musbat juft son");
                    } else {
                        System.out.println("Musbat toq raqam");
                    }
                } else if (if29Number < 0) {
                    if (if29Number % 2 == 0) {
                        System.out.println("Manfiy juft son");
                    } else {
                        System.out.println("Manfiy toq raqam");
                    }
                } else {
                    System.out.println("Number is equal to zero");
                }
                break;

            case 30:
                System.out.println("if30:");
                int if30Number = scanner.nextInt();
                String if30Result = "";

                if (if30Number >= 1 && if30Number <= 9) {
                    if30Result = "one-digit ";
                } else if (if30Number >= 10 && if30Number <= 99) {
                    if30Result = "two-digit ";
                } else if (if30Number >= 100 && if30Number <= 999) {
                    if30Result = "three-digit ";
                }

                if (if30Number % 2 == 0) {
                    if30Result += "even number";
                } else {
                    if30Result += "odd number";
                }

                System.out.println(if30Result);
                break;

            default:
                System.out.println("Invalid issue number.");
        }
    }
}