import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Choose an integer problem to solve (1-23, 0 to exit): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter length in centimeters: ");
                int lengthInCentimeters = scanner.nextInt();
                int lengthInMeters = lengthInCentimeters / 100;
                System.out.println("Length in meters: " + lengthInMeters);
                break;

            case 2:
                System.out.print("Enter weight in kilograms: ");
                int weightInKilograms = scanner.nextInt();
                int weightInMetricTons = weightInKilograms / 1000;
                System.out.println("Weight in metric tons: " + weightInMetricTons);
                break;

            case 3:
                System.out.print("Enter file size in bytes: ");
                int fileSizeInBytes = scanner.nextInt();
                int fileSizeInKilobytes = fileSizeInBytes / 1024;
                System.out.println("File size in kilobytes: " + fileSizeInKilobytes);
                break;

            case 4:
                System.out.print("Enter A: ");
                int A = scanner.nextInt();
                System.out.print("Enter B: ");
                int B = scanner.nextInt();
                int times = A / B;
                System.out.println("B can be placed in A " + times + " times.");
                break;

            case 5:
                System.out.print("Enter A: ");
                int A5 = scanner.nextInt();
                System.out.print("Enter B: ");
                int B5 = scanner.nextInt();
                int remainder = A5 % B5;
                System.out.println("B can be placed in the remainder of A " + remainder + " times.");
                break;

            case 6:
                System.out.print("Enter a two-digit number: ");
                int number6 = scanner.nextInt();
                int tensDigit = (number6 / 10) % 10;
                int unitsDigit = number6 % 10;
                System.out.println("Tens digit: " + tensDigit);
                System.out.println("Units digit: " + unitsDigit);
                break;

            case 7:
                System.out.print("Enter a three-digit number: ");
                int number7 = scanner.nextInt();
                int hundredsDigit = (number7 / 100) % 10;
                int tensDigit7 = (number7 / 10) % 10;
                int unitsDigit7 = number7 % 10;
                int sum7 = hundredsDigit + tensDigit7 + unitsDigit7;
                System.out.println("Sum of the digits: " + sum7);
                break;

            case 8:
                System.out.print("Enter a three-digit number: ");
                int number8 = scanner.nextInt();
                int reversedNumber = (number8 % 10) * 100 + ((number8 / 10) % 10) * 10 + (number8 / 100);
                System.out.println("Reversed number: " + reversedNumber);
                break;

            case 9:
                System.out.print("Enter a three-digit number: ");
                int number9 = scanner.nextInt();
                int hundredsDigit9 = (number9 / 100) % 10;
                System.out.println("Hundreds digit: " + hundredsDigit9);
                break;

            case 10:
                System.out.print("Enter a three-digit number: ");
                int number10 = scanner.nextInt();
                int tensDigit10 = (number10 / 10) % 10;
                int unitsDigit10 = number10 % 10;
                System.out.println("Tens digit: " + tensDigit10);
                System.out.println("Units digit: " + unitsDigit10);
                break;

            case 11:
                System.out.print("Enter a three-digit number: ");
                int number11 = scanner.nextInt();
                int hundredsDigit11 = (number11 / 100) % 10;
                int tensDigit11 = (number11 / 10) % 10;
                int unitsDigit11 = number11 % 10;
                int sum11 = hundredsDigit11 + tensDigit11 + unitsDigit11;
                System.out.println("Sum of the digits: " + sum11);
                break;

            case 12:
                System.out.print("Enter a three-digit number: ");
                int number12 = scanner.nextInt();
                int reversedNumber12 = (number12 % 10) * 100 + ((number12 / 10) % 10) * 10 + (number12 / 100);
                System.out.println("Reversed number: " + reversedNumber12);
                break;

            case 13:
                System.out.print("Enter a three-digit number: ");
                int number13 = scanner.nextInt();
                int remainingNumber13 = (number13 % 100);
                System.out.println("Number after removing the first digit: " + remainingNumber13);
                break;

            case 14:
                System.out.print("Enter a three-digit number: ");
                int number14 = scanner.nextInt();
                int remainingNumber14 = (number14 / 10);
                System.out.println("Number after removing the first digit: " + remainingNumber14);
                break;

            case 15:
                System.out.print("Enter a three-digit number: ");
                int number15 = scanner.nextInt();
                int tensDigit15 = (number15 / 10) % 10;
                int unitsDigit15 = number15 % 10;
                int swappedNumber15 = (number15 / 100) * 100 + unitsDigit15 * 10 + tensDigit15;
                System.out.println("Swapped number: " + swappedNumber15);
                break;

            case 16:
                System.out.print("Enter a three-digit number: ");
                int number16 = scanner.nextInt();
                int tensDigit16 = (number16 / 10) % 10;
                int unitsDigit16 = number16 % 10;
                int swappedNumber16 = (number16 / 100) * 100 + unitsDigit16 * 10 + tensDigit16;
                System.out.println("Swapped number: " + swappedNumber16);
                break;

            case 17:
                System.out.print("Enter a three-digit number: ");
                int number17 = scanner.nextInt();
                int hundredsDigit17 = (number17 / 100) % 10;
                System.out.println("Hundreds digit: " + hundredsDigit17);
                break;

            case 18:
                System.out.print("Enter a four-digit number: ");
                int number18 = scanner.nextInt();
                int thousandsDigit18 = (number18 / 1000) % 10;
                System.out.println("Thousands digit: " + thousandsDigit18);
                break;

            case 19:
                System.out.print("Enter seconds: ");
                int seconds19 = scanner.nextInt();
                int minutes19 = seconds19 / 60;
                System.out.println("Minutes: " + minutes19);
                break;

            case 20:
                System.out.print("Enter seconds: ");
                int seconds20 = scanner.nextInt();
                int hours20 = seconds20 / 3600;
                System.out.println("Hours: " + hours20);
                break;

            case 21:
                System.out.print("Enter seconds: ");
                int seconds21 = scanner.nextInt();
                int minutes21 = seconds21 / 60;
                int remainingSeconds21 = seconds21 % 60;
                System.out.println("Minutes: " + minutes21);
                System.out.println("Remaining seconds: " + remainingSeconds21);
                break;

            case 22:
                System.out.print("Enter seconds: ");
                int seconds22 = scanner.nextInt();
                int hours22 = seconds22 / 3600;
                int remainingSeconds22 = seconds22 % 3600;
                int minutes22 = remainingSeconds22 / 60;
                System.out.println("Hours: " + hours22);
                System.out.println("Minutes: " + minutes22);
                break;

            case 23:
                System.out.print("Enter seconds: ");
                int seconds23 = scanner.nextInt();
                int hours23 = seconds23 / 3600;
                int remainingSeconds23 = seconds23 % 3600;
                int minutes23 = remainingSeconds23 / 60;
                int remainingSeconds23Final = remainingSeconds23 % 60;
                System.out.println("Hours: " + hours23);
                System.out.println("Minutes: " + minutes23);
                System.out.println("Remaining seconds: " + remainingSeconds23Final);
                break;

            case 0:
                System.out.println("Exiting the program.");
                break;

            default:
                System.out.println("Invalid choice. Please choose a valid problem or enter 0 to exit.");
                break;
        }
    }
}