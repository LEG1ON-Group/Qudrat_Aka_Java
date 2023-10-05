import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;


        System.out.println("Choose a problem (1-40) or enter 0 to exit:");
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.printf("Enter the side length 'a' of the square:");
                double a = scanner.nextDouble();
                double perimeter = 4 * a;
                System.out.println("Perimeter of the square: " + perimeter);
                break;
            case 2:
                System.out.printf("Enter the side length 'a' of the square:");
                double a2 = scanner.nextDouble();
                double area = a2 * a2;
                System.out.println("Area of the square: " + area);
                break;
            case 3:
                System.out.printf("Enter the lengths 'a' and 'b' of the rectangle:");
                double a3 = scanner.nextDouble();
                double b3 = scanner.nextDouble();
                double area3 = a3 * b3;
                double perimeter3 = 2 * (a3 + b3);
                System.out.println("Area of the rectangle: " + area3);
                System.out.println("Perimeter of the rectangle: " + perimeter3);
                break;
            case 4:
                System.out.printf("Enter the diameter 'd' of the circle:");
                double d4 = scanner.nextDouble();
                double radius4 = d4 / 2;
                double length4 = Math.PI * d4;
                System.out.println("Radius of the circle: " + radius4);
                System.out.println("Length of the circle: " + length4);
                break;
            case 5:
                System.out.printf("Enter the side length 'a' of the cube:");
                double a5 = scanner.nextDouble();
                double volume5 = a5 * a5 * a5;
                double surfaceArea5 = 6 * a5 * a5;
                System.out.println("Volume of the cube: " + volume5);
                System.out.println("Surface area of the cube: " + surfaceArea5);
                break;
            case 6:
                System.out.printf("Enter the side lengths 'a', 'b', and 'c' of the parallelepiped:");
                double a6 = scanner.nextDouble();
                double b6 = scanner.nextDouble();
                double c6 = scanner.nextDouble();
                double volume6 = a6 * b6 * c6;
                double surfaceArea6 = 2 * (a6 * b6 + b6 * c6 + a6 * c6);
                System.out.println("Volume of the parallelepiped: " + volume6);
                System.out.println("Surface area of the parallelepiped: " + surfaceArea6);
                break;
            case 7:
                System.out.printf("Enter the radius 'R' of the circle:");
                double R7 = scanner.nextDouble();
                double length7 = 2 * Math.PI * R7;
                double area7 = Math.PI * R7 * R7;
                System.out.println("Length of the circle: " + length7);
                System.out.println("Area of the circle: " + area7);
                break;
            case 8:
                System.out.printf("Enter two numbers 'a' and 'b':");
                double a8 = scanner.nextDouble();
                double b8 = scanner.nextDouble();
                double average8 = (a8 + b8) / 2;
                System.out.println("Average of the two numbers: " + average8);
                break;
            case 9:
                System.out.printf("Enter two non-negative numbers 'a' and 'b':");
                double a9 = scanner.nextDouble();
                double b9 = scanner.nextDouble();
                double geometricMean9 = Math.sqrt(a9 * b9);
                System.out.println("Geometric mean of the two numbers: " + geometricMean9);
                break;
            case 10:
                System.out.printf("Enter two numbers 'a' and 'b' (not both zero):");
                double a10 = scanner.nextDouble();
                double b10 = scanner.nextDouble();
                double sum10 = a10 + b10;
                double product10 = a10 * b10;
                double squareA10 = a10 * a10;
                double squareB10 = b10 * b10;
                System.out.println("Sum of the numbers: " + sum10);
                System.out.println("Product of the numbers: " + product10);
                System.out.println("Square of 'a': " + squareA10);
                System.out.println("Square of 'b': " + squareB10);
                break;
            case 11:
                System.out.printf("Enter two numbers 'a' and 'b' (not both zero):");
                double a11 = scanner.nextDouble();
                double b11 = scanner.nextDouble();
                double sum11 = a11 + b11;
                double product11 = a11 * b11;
                double absA11 = Math.abs(a11);
                double absB11 = Math.abs(b11);
                System.out.println("Sum of the numbers: " + sum11);
                System.out.println("Product of the numbers: " + product11);
                System.out.println("Absolute value of 'a': " + absA11);
                System.out.println("Absolute value of 'b': " + absB11);
                break;
            case 12:
                System.out.printf("Enter the lengths of the two legs 'a' and 'b' of the right triangle:");
                double a12 = scanner.nextDouble();
                double b12 = scanner.nextDouble();
                double c12 = Math.sqrt(a12 * a12 + b12 * b12);
                double perimeter12 = a12 + b12 + c12;
                System.out.println("Hypotenuse 'c' of the right triangle: " + c12);
                System.out.println("Perimeter of the right triangle: " + perimeter12);
                break;
            case 13:
                System.out.printf("Enter the radii 'R1' and 'R2' of two circles (R1 > R2):");
                double R1 = scanner.nextDouble();
                double R2 = scanner.nextDouble();
                double S1 = Math.PI * R1 * R1;
                double S2 = Math.PI * R2 * R2;
                double S3 = S1 - S2;
                System.out.println("Area of the first circle: " + S1);
                System.out.println("Area of the second circle: " + S2);
                System.out.println("Area of the shaded region: " + S3);
                break;
            case 14:
                System.out.printf("Enter the length 'L' of the arc of the circle:");
                double L14 = scanner.nextDouble();
                double R14 = L14 / (2 * Math.PI);
                double S14 = Math.PI * R14 * R14;
                System.out.println("Radius of the circle: " + R14);
                System.out.println("Area of the circle: " + S14);
                break;
            case 15:
                System.out.printf("Enter the area 'S' of the circle:");
                double S15 = scanner.nextDouble();
                double R15 = Math.sqrt(S15 / Math.PI);
                double d15 = 2 * R15;
                System.out.println("Radius of the circle: " + R15);
                System.out.println("Diameter of the circle: " + d15);
                break;
            case 16:
                System.out.printf("Enter the coordinates of two points (x1, y1) and (x2, y2):");
                double x1 = scanner.nextDouble();
                double y1 = scanner.nextDouble();
                double x2 = scanner.nextDouble();
                double y2 = scanner.nextDouble();
                double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                System.out.println("Distance between the two points: " + distance);
                break;
            case 17:
                System.out.printf("Enter the coordinates of three points A, B, and C:");
                double ax = scanner.nextDouble();
                double ay = scanner.nextDouble();
                double bx = scanner.nextDouble();
                double by = scanner.nextDouble();
                double cx = scanner.nextDouble();
                double cy = scanner.nextDouble();
                double acDistance = Math.sqrt(Math.pow(cx - ax, 2) + Math.pow(cy - ay, 2));
                double bcDistance = Math.sqrt(Math.pow(cx - bx, 2) + Math.pow(cy - by, 2));
                double totalDistance = acDistance + bcDistance;
                System.out.println("Distance from A to C: " + acDistance);
                System.out.println("Distance from B to C: " + bcDistance);
                System.out.println("Total distance (AC + BC): " + totalDistance);
                break;
            case 18:
                System.out.printf("Enter the coordinates of three points A, B, and C:");
                double ax18 = scanner.nextDouble();
                double ay18 = scanner.nextDouble();
                double bx18 = scanner.nextDouble();
                double by18 = scanner.nextDouble();
                double cx18 = scanner.nextDouble();
                double cy18 = scanner.nextDouble();
                double acDistance18 = Math.sqrt(Math.pow(cx18 - ax18, 2) + Math.pow(cy18 - ay18, 2));
                double bcDistance18 = Math.sqrt(Math.pow(cx18 - bx18, 2) + Math.pow(cy18 - by18, 2));
                double productOfDistances = acDistance18 * bcDistance18;
                System.out.println("Distance from A to C: " + acDistance18);
                System.out.println("Distance from B to C: " + bcDistance18);
                System.out.println("Product of distances (AC * BC): " + productOfDistances);
                break;
            case 19:
                System.out.printf("Enter the coordinates of the vertices of the rectangle (x1, y1), (x2, y2), (x3, y3), (x4, y4):");
                double x1_19 = scanner.nextDouble();
                double y1_19 = scanner.nextDouble();
                double x2_19 = scanner.nextDouble();
                double y2_19 = scanner.nextDouble();
                double x3_19 = scanner.nextDouble();
                double y3_19 = scanner.nextDouble();
                double x4_19 = scanner.nextDouble();
                double y4_19 = scanner.nextDouble();
                double side1_19 = Math.sqrt(Math.pow(x2_19 - x1_19, 2) + Math.pow(y2_19 - y1_19, 2));
                double side2_19 = Math.sqrt(Math.pow(x3_19 - x2_19, 2) + Math.pow(y3_19 - y2_19, 2));
                double perimeter_19 = 2 * (side1_19 + side2_19);
                double area_19 = side1_19 * side2_19;
                System.out.println("Perimeter of the rectangle: " + perimeter_19);
                System.out.println("Area of the rectangle: " + area_19);
                break;
            case 20:
                System.out.printf("Enter the coordinates of two points (x1, y1) and (x2, y2):");
                double x1_20 = scanner.nextDouble();
                double y1_20 = scanner.nextDouble();
                double x2_20 = scanner.nextDouble();
                double y2_20 = scanner.nextDouble();
                double distance_20 = Math.sqrt(Math.pow(x2_20 - x1_20, 2) + Math.pow(y2_20 - y1_20, 2));
                System.out.println("Distance between the two points: " + distance_20);
                break;
            case 21:
                System.out.printf("Enter the coordinates of three points (x1, y1), (x2, y2), and (x3, y3):");
                double x1_21 = scanner.nextDouble();
                double y1_21 = scanner.nextDouble();
                double x2_21 = scanner.nextDouble();
                double y2_21 = scanner.nextDouble();
                double x3_21 = scanner.nextDouble();
                double y3_21 = scanner.nextDouble();
                double a_21 = Math.sqrt(Math.pow(x2_21 - x1_21, 2) + Math.pow(y2_21 - y1_21, 2));
                double b_21 = Math.sqrt(Math.pow(x3_21 - x2_21, 2) + Math.pow(y3_21 - y2_21, 2));
                double c_21 = Math.sqrt(Math.pow(x3_21 - x1_21, 2) + Math.pow(y3_21 - y1_21, 2));
                double s_21 = (a_21 + b_21 + c_21) / 2;
                double area_21 = Math.sqrt(s_21 * (s_21 - a_21) * (s_21 - b_21) * (s_21 - c_21));
                System.out.println("Area of the triangle: " + area_21);
                break;
            case 22:
                System.out.printf("Enter the values of 'A' and 'B':");
                double A_22 = scanner.nextDouble();
                double B_22 = scanner.nextDouble();
                System.out.println("New values of 'A' and 'B': " + B_22 + " " + A_22);
                break;
            case 23:
                System.out.printf("Enter the values of 'A', 'B', and 'C':");
                double A_23 = scanner.nextDouble();
                double B_23 = scanner.nextDouble();
                double C_23 = scanner.nextDouble();
                System.out.println("New values of 'A', 'B', and 'C': " + B_23 + " " + C_23 + " " + A_23);
                break;
            case 24:
                System.out.printf("Enter the values of 'A', 'B', and 'C':");
                double A_24 = scanner.nextDouble();
                double B_24 = scanner.nextDouble();
                double C_24 = scanner.nextDouble();
                System.out.println("New values of 'A', 'B', and 'C': " + C_24 + " " + A_24 + " " + B_24);
                break;
            case 25:
                System.out.printf("Enter the value of 'x':");
                double x_25 = scanner.nextDouble();
                double y_25 = 3 * x_25 - 6 * Math.pow(x_25, 2) - 7;
                System.out.println("Result: " + y_25);
                break;
            case 26:
                System.out.printf("Enter the value of 'x':");
                double x_26 = scanner.nextDouble();
                double y_26 = 4 * (x_26 - 3) - 7 * (x_26 - 3) + 2;
                System.out.println("Result: " + y_26);
                break;
            case 27:
                System.out.printf("Enter the value of 'A':");
                double A_27 = scanner.nextDouble();
                double A2_27 = Math.pow(A_27, 2);
                double A3_27 = Math.pow(A_27, 3);
                double A4_27 = Math.pow(A_27, 4);
                System.out.println("A^2: " + A2_27);
                System.out.println("A^3: " + A3_27);
                System.out.println("A^4: " + A4_27);
                break;
            case 28:
                System.out.printf("Enter the value of 'A':");
                double A_28 = scanner.nextDouble();
                double A2_28 = Math.pow(A_28, 2);
                double A3_28 = Math.pow(A_28, 3);
                double A4_28 = Math.pow(A_28, 4);
                System.out.println("A^2: " + A2_28);
                System.out.println("A^3: " + A3_28);
                System.out.println("A^4: " + A4_28);
                break;
            case 29:
                System.out.printf("Enter the angle 'a' in degrees (0 < a < 360):");
                double a_29 = scanner.nextDouble();
                double radians_29 = Math.toRadians(a_29);
                System.out.println("Angle in radians: " + radians_29);
                break;
            case 30:
                System.out.printf("Enter the angle 'a' in radians (0 < a < 2.7):");
                double a_30 = scanner.nextDouble();
                double degrees_30 = Math.toDegrees(a_30);
                System.out.println("Angle in degrees: " + degrees_30);
                break;
            case 31:
                System.out.printf("Enter the temperature in Fahrenheit:");
                double temperatureFahrenheit = scanner.nextDouble();
                double temperatureCelsius = (temperatureFahrenheit - 32) * 5 / 9;
                System.out.println("Temperature in Celsius: " + temperatureCelsius + " °C");
                break;
            case 32:
                System.out.printf("Enter the temperature in Celsius:");
                double temperatureCelsius32 = scanner.nextDouble();
                double temperatureFahrenheit32 = (temperatureCelsius32 * 9 / 5) + 32;
                System.out.println("Temperature in Fahrenheit: " + temperatureFahrenheit32 + " °F");
                break;
            case 33:
                System.out.printf("Enter the weight of X kg of candies in so'm:");
                double x33 = scanner.nextDouble();
                System.out.printf("Enter the weight of 1 kg of candies in so'm:");
                double y33 = scanner.nextDouble();
                double totalCost33 = x33 * y33;
                System.out.println("The total cost of the candies is: " + totalCost33 + " so'm");
                break;
            case 34:
                System.out.printf("Enter the weight of X kg of chocolate in so'm:");
                double x34 = scanner.nextDouble();
                System.out.printf("Enter the weight of 1 kg of chocolate in so'm:");
                double y34 = scanner.nextDouble();
                System.out.printf("Enter the weight of Y kg of candies in so'm:");
                double y34_candies = scanner.nextDouble();
                double totalCost34 = (x34 * y34) + (y34_candies * y34);
                System.out.println("The total cost of the chocolate and candies is: " + totalCost34 + " so'm");
                break;
            case 35:
                System.out.printf("Enter the speed of the boat in km/h (U):");
                double U35 = scanner.nextDouble();
                System.out.printf("Enter the speed of the river current in km/h (V):");
                double V35 = scanner.nextDouble();
                System.out.printf("Enter the time of travel in hours (T):");
                double T35 = scanner.nextDouble();
                double distance35 = (U35 + V35) * T35;
                System.out.println("The distance traveled by the boat: " + distance35 + " km");
                break;
            case 36:
                System.out.printf("Enter the speed of the first car in km/h (V1):");
                double V1_36 = scanner.nextDouble();
                System.out.printf("Enter the speed of the second car in km/h (V2):");
                double V2_36 = scanner.nextDouble();
                System.out.printf("Enter the time of travel in hours (T):");
                double T_36 = scanner.nextDouble();
                double distance_36 = Math.abs(V1_36 + V2_36) * T_36;
                System.out.println("The distance between the two cars after " + T_36 + " hours: " + distance_36 + " km");
                break;
            case 37:
                System.out.printf("Enter the speed of the first car in km/h (V1):");
                double V1_37 = scanner.nextDouble();
                System.out.printf("Enter the speed of the second car in km/h (V2):");
                double V2_37 = scanner.nextDouble();
                System.out.printf("Enter the time of travel in hours (T):");
                double T_37 = scanner.nextDouble();
                double distance_37 = Math.abs(V1_37 - V2_37) * T_37;
                System.out.println("The distance between the two cars after " + T_37 + " hours: " + distance_37 + " km");
                break;
            case 38:
                System.out.printf("Enter the value of 'B' in the equation 4x + B = 0:");
                double B38 = scanner.nextDouble();
                double x38 = -B38 / 4;
                System.out.println("Solution for 'x': x = " + x38);
                break;
            case 39:
                System.out.printf("Enter the values of 'A', 'B', and 'C' in the equation 4x^2 + Bx + C = 0:");
                double A39 = scanner.nextDouble();
                double B39 = scanner.nextDouble();
                double C39 = scanner.nextDouble();
                double discriminant = B39 * B39 - 4 * A39 * C39;
                if (discriminant < 0) {
                    System.out.println("No real roots.");
                } else if (discriminant == 0) {
                    double root = -B39 / (2 * A39);
                    System.out.println("Double root: x = " + root);
                } else {
                    double root1 = (-B39 + Math.sqrt(discriminant)) / (2 * A39);
                    double root2 = (-B39 - Math.sqrt(discriminant)) / (2 * A39);
                    System.out.println("Root 1: x = " + root1);
                    System.out.println("Root 2: x = " + root2);
                }
                break;
            case 40:
                System.out.printf("Enter the values of 'A' and 'B' in the system of linear equations Ax + B = 0:");
                double A40 = scanner.nextDouble();
                double B40 = scanner.nextDouble();
                if (A40 == 0) {
                    if (B40 == 0) {
                        System.out.println("Infinite solutions.");
                    } else {
                        System.out.println("No solution.");
                    }
                } else {
                    double x40 = -B40 / A40;
                    System.out.println("Solution for 'x': x = " + x40);
                }
                break;
            case 0:
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid choice. Please choose a problem (1-40) or enter 0 to exit.");
        }
    }
}
