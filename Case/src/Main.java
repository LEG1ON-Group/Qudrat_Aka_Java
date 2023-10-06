import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Enter the case number (1-20): ");
        choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Case 1: Days of the week
                System.out.println("Enter a number (1-7): ");
                int dayNumber = scanner.nextInt();
                String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                if (dayNumber >= 1 && dayNumber <= 7) {
                    System.out.println(dayNumber + "st " + daysOfWeek[dayNumber - 1]);
                } else {
                    System.out.println("Invalid input");
                }
                break;

            case 2:
                // Case 2: Evaluation results
                System.out.println("Enter a number (1-5): ");
                int evaluation = scanner.nextInt();
                String[] evaluationResults = {"error", "poor", "unsatisfactory", "satisfactory", "good", "excellent"};
                if (evaluation >= 1 && evaluation <= 5) {
                    System.out.println(evaluationResults[evaluation]);
                } else {
                    System.out.println("Invalid input");
                }
                break;

            case 3:
                // Case 3: Month phase
                System.out.println("Enter the month number: ");
                int monthNumber = scanner.nextInt();
                String[] monthPhases = {"winter", "spring", "summer", "autumn"};
                if (monthNumber >= 1 && monthNumber <= 12) {
                    int phaseIndex = (monthNumber - 1) / 3;
                    System.out.println(monthNumber + "nd month, \"" + monthPhases[phaseIndex] + "\"");
                } else {
                    System.out.println("Invalid input");
                }
                break;

            case 4:
                // Case 4: Number of days in a month
                System.out.println("Enter the month number: ");
                int month = scanner.nextInt();
                int daysInMonth;
                if (month >= 1 && month <= 12) {
                    if (month == 2) {
                        daysInMonth = 28; // Assuming a non-leap year
                    } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                        daysInMonth = 30;
                    } else {
                        daysInMonth = 31;
                    }
                    System.out.println("There are " + daysInMonth + " days in month " + month);
                } else {
                    System.out.println("Invalid input");
                }
                break;

            case 5:
                // Case 5: Arithmetic operations
                System.out.println("Enter two numbers A and B: ");
                double numA = scanner.nextDouble();
                double numB = scanner.nextDouble();
                System.out.println("Enter the operation (1-Addition, 2-Subtraction, 3-Division, 4-Multiplication): ");
                int operation = scanner.nextInt();
                double result = 0;

                switch (operation) {
                    case 1:
                        result = numA + numB;
                        break;
                    case 2:
                        result = numA - numB;
                        break;
                    case 3:
                        if (numB != 0) {
                            result = numA / numB;
                        } else {
                            System.out.println("Division by zero is not allowed.");
                            return;
                        }
                        break;
                    case 4:
                        result = numA * numB;
                        break;
                    default:
                        System.out.println("Invalid operation");
                        return;
                }

                System.out.println("Result: " + result);
                break;

            case 6:
                // Case 6: Length units conversion
                System.out.println("Enter the unit of length (1-decimeter, 2-kilometer, 3-meter, 4-millimeter, 5-centimeter): ");
                int lengthUnit = scanner.nextInt();
                System.out.println("Enter the length in this unit: ");
                double length = scanner.nextDouble();
                double lengthInMeters;

                switch (lengthUnit) {
                    case 1:
                        lengthInMeters = length / 10; // Convert decimeters to meters
                        break;
                    case 2:
                        lengthInMeters = length * 1000; // Convert kilometers to meters
                        break;
                    case 3:
                        lengthInMeters = length; // Meters
                        break;
                    case 4:
                        lengthInMeters = length / 1000; // Convert millimeters to meters
                        break;
                    case 5:
                        lengthInMeters = length / 100; // Convert centimeters to meters
                        break;
                    default:
                        System.out.println("Invalid input");
                        return;
                }

                System.out.println("Length in meters: " + lengthInMeters);
                break;

            case 7:
                // Case 7: Weight units conversion
                System.out.println("Enter the unit of weight (1-kilogram, 2-milligram, 3-gram, 4-ton, 5-centner): ");
                int weightUnit = scanner.nextInt();
                System.out.println("Enter the weight in this unit: ");
                double weightValue = scanner.nextDouble();
                double weightInKilograms;

                switch (weightUnit) {
                    case 1:
                        weightInKilograms = weightValue; // Kilograms
                        break;
                    case 2:
                        weightInKilograms = weightValue / 1_000_000; // Convert milligrams to kilograms
                        break;
                    case 3:
                        weightInKilograms = weightValue / 1000; // Convert grams to kilograms
                        break;
                    case 4:
                        weightInKilograms = weightValue * 1000; // Convert tons to kilograms
                        break;
                    case 5:
                        weightInKilograms = weightValue * 100; // Convert centners to kilograms
                        break;
                    default:
                        System.out.println("Invalid input");
                        return;
                }

                System.out.println("Weight in kilograms: " + weightInKilograms);
                break;

            case 8:
                // Case 8: Representing a date
                System.out.println("Enter the day (D) and month (M): ");
                int day = scanner.nextInt();
                int monthInput = scanner.nextInt();
                int year = 2023; // Assuming a non-leap year
                String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

                if (monthInput >= 1 && monthInput <= 12 && day >= 1 && day <= 31) {
                    if (day <= 28 || (day == 29 && monthInput != 2) || (day == 28 && monthInput == 2 && year % 4 != 0)) {
                        System.out.println(day + " " + months[monthInput - 1] + " " + year);
                    } else {
                        System.out.println("Invalid date");
                    }
                } else {
                    System.out.println("Invalid input");
                }
                break;

            case 9:
                // Case 9: Date after given date
                System.out.println("Enter the day (D) and month (M): ");
                int inputDay = scanner.nextInt();
                int inputMonth = scanner.nextInt();

                if (inputMonth >= 1 && inputMonth <= 12 && inputDay >= 1 && inputDay <= 31) {
                    if (inputDay <= 28 || (inputDay == 29 && inputMonth != 2) || (inputDay == 28 && inputMonth == 2 && year % 4 != 0)) {
                        int nextDay = inputDay + 1;
                        int nextMonth = inputMonth;
                        if (nextDay > 31 || (nextDay == 31 && (nextMonth == 4 || nextMonth == 6 || nextMonth == 9 || nextMonth == 11)) || (nextDay == 30 && nextMonth == 2) || (nextDay == 29 && nextMonth == 2 && year % 4 != 0)) {
                            nextDay = 1;
                            nextMonth++;
                        }
                        if (nextMonth > 12) {
                            nextMonth = 1;
                            year++;
                        }

                        System.out.println("The date after " + inputDay + " " + months[inputMonth - 1] + " is " + nextDay + " " + months[nextMonth - 1] + " " + year);
                    } else {
                        System.out.println("Invalid date");
                    }
                } else {
                    System.out.println("Invalid input");
                }
                break;

            case 10:
                // Case 10: Robot movement
                System.out.println("Enter the current direction (s/n/j/g) and command (0/1/2): ");
                char currentDirection = scanner.next().charAt(0);
                int command = scanner.nextInt();
                char newDirection = currentDirection;

                switch (command) {
                    case 0:
                        break;
                    case 1:
                        switch (currentDirection) {
                            case 's':
                                newDirection = 'q'; // Turn left from north to east
                                break;
                            case 'n':
                                newDirection = 'g'; // Turn left from south to west
                                break;
                            case 'q':
                                newDirection = 'j'; // Turn left from east to south
                                break;
                            case 'g':
                                newDirection = 's'; // Turn left from west to north
                                break;
                        }
                        break;
                    case 2:
                        switch (currentDirection) {
                            case 's':
                                newDirection = 'g'; // Turn right from north to west
                                break;
                            case 'n':
                                newDirection = 'q'; // Turn right from south to east
                                break;
                            case 'q':
                                newDirection = 's'; // Turn right from east to north
                                break;
                            case 'g':
                                newDirection = 'j'; // Turn right from west to south
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid input");
                        return;
                }

                System.out.println("New direction: " + newDirection);
                break;

            case 11:
                // Case 11: Locator state
                System.out.println("Enter the initial direction (s/n/j/g), and two commands (K1, K2): ");
                char initialDirection = scanner.next().charAt(0);
                int k1 = scanner.nextInt();
                int k2 = scanner.nextInt();
                char finalDirection = initialDirection;

                switch (k1) {
                    case 0:
                        break;
                    case 1:
                        switch (initialDirection) {
                            case 's':
                                finalDirection = 'q'; // Turn left from north to east
                                break;
                            case 'n':
                                finalDirection = 'g'; // Turn left from south to west
                                break;
                            case 'q':
                                finalDirection = 'j'; // Turn left from east to south
                                break;
                            case 'g':
                                finalDirection = 's'; // Turn left from west to north
                                break;
                        }
                        break;
                    case 2:
                        switch (initialDirection) {
                            case 's':
                                finalDirection = 'g'; // Turn right from north to west
                                break;
                            case 'n':
                                finalDirection = 'q'; // Turn right from south to east
                                break;
                            case 'q':
                                finalDirection = 's'; // Turn right from east to north
                                break;
                            case 'g':
                                finalDirection = 'j'; // Turn right from west to south
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid input");
                        return;
                }

                switch (k2) {
                    case 0:
                        break;
                    case 1:
                        switch (finalDirection) {
                            case 's':
                                finalDirection = 'q'; // Turn left from north to east
                                break;
                            case 'n':
                                finalDirection = 'g'; // Turn left from south to west
                                break;
                            case 'q':
                                finalDirection = 'j'; // Turn left from east to south
                                break;
                            case 'g':
                                finalDirection = 's'; // Turn left from west to north
                                break;
                        }
                        break;
                    case 2:
                        switch (finalDirection) {
                            case 's':
                                finalDirection = 'g'; // Turn right from north to west
                                break;
                            case 'n':
                                finalDirection = 'q'; // Turn right from south to east
                                break;
                            case 'q':
                                finalDirection = 's'; // Turn right from east to north
                                break;
                            case 'g':
                                finalDirection = 'j'; // Turn right from west to south
                                break;
                        }
                        break;
                    default:
                        System.out.println("Invalid input");
                        return;
                }

                System.out.println("Final direction: " + finalDirection);
                break;

            case 13:
                // Case 13: Equilateral triangle elements
                System.out.println("Enter one element (a, c, h, S): ");
                char element13 = scanner.next().charAt(0);
                double value13 = scanner.nextDouble();
                double a13, c13, h13, S13;

                switch (element13) {
                    case 'a':
                        a13 = value13;
                        c13 = a13 * Math.sqrt(2);
                        h13 = c13 / 2;
                        S13 = (a13 * a13) / 2;
                        System.out.println("c: " + c13);
                        System.out.println("h: " + h13);
                        System.out.println("S: " + S13);
                        break;
                    case 'c':
                        c13 = value13;
                        a13 = c13 / Math.sqrt(2);
                        h13 = c13 / 2;
                        S13 = (a13 * a13) / 2;
                        System.out.println("a: " + a13);
                        System.out.println("h: " + h13);
                        System.out.println("S: " + S13);
                        break;
                    case 'h':
                        h13 = value13;
                        c13 = 2 * h13;
                        a13 = c13 / Math.sqrt(2);
                        S13 = (a13 * a13) / 2;
                        System.out.println("a: " + a13);
                        System.out.println("c: " + c13);
                        System.out.println("S: " + S13);
                        break;
                    case 'S':
                        S13 = value13;
                        a13 = Math.sqrt(2 * S13);
                        c13 = a13 * Math.sqrt(2);
                        h13 = c13 / 2;
                        System.out.println("a: " + a13);
                        System.out.println("c: " + c13);
                        System.out.println("h: " + h13);
                        break;
                    default:
                        System.out.println("Invalid input");
                        return;
                }
                break;

            case 14:
                // Case 14: Equilateral triangle elements with inscribed circle
                System.out.println("Enter one element (a, R1, R2, S): ");
                char element14 = scanner.next().charAt(0);
                double value14 = scanner.nextDouble();
                double R1, R2, S14;

                switch (element14) {
                    case 'a':
                        double a14 = value14;
                        R1 = (a14 * Math.sqrt(3)) / 6;
                        R2 = 2 - R1;
                        S14 = (Math.sqrt(3) * a14 * a14) / 4;
                        System.out.println("R1: " + R1);
                        System.out.println("R2: " + R2);
                        System.out.println("S: " + S14);
                        break;
                    case 'R1':
                        R1 = value14;
                        double a14R1 = 6 * R1 / Math.sqrt(3);
                        R2 = 2 - R1;
                        S14 = (Math.sqrt(3) * a14R1 * a14R1) / 4;
                        System.out.println("a: " + a14R1);
                        System.out.println("R2: " + R2);
                        System.out.println("S: " + S14);
                        break;
                    case 'R2':
                        R2 = value14;
                        R1 = 2 - R2;
                        double a14R2 = 6 * R2 / Math.sqrt(3);
                        S14 = (Math.sqrt(3) * a14R2 * a14R2) / 4;
                        System.out.println("a: " + a14R2);
                        System.out.println("R1: " + R1);
                        System.out.println("S: " + S14);
                        break;
                    case 'S':
                        S14 = value14;
                        double a14S = Math.sqrt((4 * S14) / Math.sqrt(3));
                        R1 = (a14S * Math.sqrt(3)) / 6;
                        R2 = 2 - R1;
                        System.out.println("a: " + a14S);
                        System.out.println("R1: " + R1);
                        System.out.println("R2: " + R2);
                        break;
                    default:
                        System.out.println("Invalid input");
                        return;
                }
                break;

            case 15:
                // Case 15: Playing cards
                System.out.println("Enter card value (6-14) and card type (1-brick, 2-apple, 3-jack, 4-crow): ");
                int cardValue = scanner.nextInt();
                int cardType = scanner.nextInt();
                String cardName = "";

                if (cardValue >= 6 && cardValue <= 14 && cardType >= 1 && cardType <= 4) {
                    String[] cardTypes = {"brick", "apple", "jack", "crow"};
                    String[] cardValues = {"", "", "", "", "", "", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "salt"};
                    cardName = cardValues[cardValue] + " of " + cardTypes[cardType - 1];
                } else {
                    System.out.println("Invalid input");
                    return;
                }

                System.out.println(cardName);
                break;

            case 16:
                // Case 16: Age in words
                System.out.println("Enter age (20-69): ");
                int age = scanner.nextInt();
                String ageInWords = "";

                if (age >= 20 && age <= 69) {
                    int tens = age / 10;
                    int ones = age % 10;

                    String[] tensWords = {"", "", "twenty", "thirty", "forty", "fifty", "sixty"};
                    String[] onesWords = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

                    ageInWords = tensWords[tens] + " " + onesWords[ones] + " years old";
                } else {
                    System.out.println("Invalid input");
                    return;
                }

                System.out.println(ageInWords);
                break;

            case 17:
                // Case 17: Educational issues in words
                System.out.println("Enter the number of educational issues (10-40): ");
                int educationalIssues = scanner.nextInt();
                String issuesInWords = "";

                if (educationalIssues >= 10 && educationalIssues <= 40) {
                    int tens = educationalIssues / 10;
                    int ones = educationalIssues % 10;

                    String[] tensWords = {"", "", "twenty", "thirty", "forty"};
                    String[] onesWords = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

                    issuesInWords = tensWords[tens] + " " + onesWords[ones] + " issues";
                } else {
                    System.out.println("Invalid input");
                    return;
                }

                System.out.println(issuesInWords);
                break;

            case 18:
                // Case 18: Numbers between 100-999 in words
                System.out.println("Enter a number between 100 and 999: ");
                int number = scanner.nextInt();

                if (number >= 100 && number <= 999) {
                    int hundreds = number / 100;
                    int tens = (number % 100) / 10;
                    int ones = number % 10;

                    String[] numberWords = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
                    String[] tensWords = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
                    String[] specialWords = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

                    String result = "";

                    if (hundreds > 0) {
                        result += numberWords[hundreds] + " hundred";
                        if (tens > 0 || ones > 0) {
                            result += " and ";
                        }
                    }

                    if (tens == 1) {
                        result += specialWords[ones];
                    } else {
                        result += tensWords[tens];
                        if (ones > 0) {
                            result += "-" + numberWords[ones];
                        }
                    }

                    System.out.println(result);
                } else {
                    System.out.println("Invalid input");
                }
                break;

            case 19:
                // Case 19: Eastern calendar year
                System.out.println("Enter a year: ");
                int year19 = scanner.nextInt();
                int cycle = year19 % 60;
                String[] colors = {"green", "red", "yellow", "white", "black"};
                String[] animals = {"mouse", "cow", "tiger", "rabbit", "dragon", "snake", "horse", "sheep", "monkey", "chicken", "dog", "horse"};

                System.out.println("The Year of the " + colors[cycle % 5] + " " + animals[cycle % 12]);
                break;

            case 20:
                // Case 20: Zodiac signs
                System.out.println("Enter the day (D) and month (M): ");
                int day20 = scanner.nextInt();
                int month20 = scanner.nextInt();
                String zodiacSign = "";

                switch (month20) {
                    case 1:
                        zodiacSign = (day20 >= 20) ? "Aquarius" : "Capricorn";
                        break;
                    case 2:
                        zodiacSign = (day20 >= 19) ? "Pisces" : "Aquarius";
                        break;
                    case 3:
                        zodiacSign = (day20 >= 21) ? "Aries" : "Pisces";
                        break;
                    case 4:
                        zodiacSign = (day20 >= 20) ? "Taurus" : "Aries";
                        break;
                    case 5:
                        zodiacSign = (day20 >= 21) ? "Gemini" : "Taurus";
                        break;
                    case 6:
                        zodiacSign = (day20 >= 21) ? "Cancer" : "Gemini";
                        break;
                    case 7:
                        zodiacSign = (day20 >= 23) ? "Leo" : "Cancer";
                        break;
                    case 8:
                        zodiacSign = (day20 >= 23) ? "Virgo" : "Leo";
                        break;
                    case 9:
                        zodiacSign = (day20 >= 23) ? "Libra" : "Virgo";
                        break;
                    case 10:
                        zodiacSign = (day20 >= 23) ? "Scorpio" : "Libra";
                        break;
                    case 11:
                        zodiacSign = (day20 >= 23) ? "Sagittarius" : "Scorpio";
                        break;
                    case 12:
                        zodiacSign = (day20 >= 22) ? "Capricorn" : "Sagittarius";
                        break;
                    default:
                        System.out.println("Invalid input");
                        return;
                }

                System.out.println("Zodiac sign: " + zodiacSign);
                break;

            default:
                System.out.println("Invalid case number");
                break;
        }
    }
}
