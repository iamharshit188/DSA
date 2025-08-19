// Program to take a input from the user [ Done ]
// if the number is less than or equal to 0, print invalid input [ Done ]
// If the number is valid use a for loop to print number 1 to number [ Done ]
// Use a while loop to calculate the sun of even number between 1 and number
// Use a do while loop to print multiplication table of number
// Ask the user to choose an option using a switch statement
// 1 - Print whether n is Prime or Not
// 2 - Print whether n is odd or even
// Exit
import java.util.Scanner;

class TestQuestion2 {

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid Input");
        } else {
            // Using for loop to solve 3 part: print number 1 to number
            System.out.println("\nNumbers from 1 to " + number + ":");
            for (int i = 1; i <= number; i++) {
                System.out.println(i);
            }

            // Using while loop to calculate the sum of even numbers between 1 and number
            int evenSum = 0;
            int currentNum = 1;
            while (currentNum <= number) {
                if (currentNum % 2 == 0) {
                    evenSum += currentNum;
                }
                currentNum++;
            }
            System.out.println(
                "Sum of even numbers between 1 and " +
                number +
                " is: " +
                evenSum
            );

            // Using do while to print multiplication table of the number
            System.out.println("\nMultiplication table for " + number + ":");
            int i = 1; // 'i' must be declared outside the do-while loop
            do {
                System.out.println(number + " x " + i + " = " + number * i);
                i++;
            } while (i <= 10); // Loop until 'i' reaches 10

            // Ask the user to choose an option using a switch statement
            System.out.println("\nChoose an option:");
            System.out.println(
                "1 - Print whether " + number + " is Prime or Not"
            );
            System.out.println(
                "2 - Print whether " + number + " is odd or even"
            );
            System.out.println("3 - Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    // Check if n is Prime or Not
                    boolean isPrime = true;
                    if (number <= 1) {
                        isPrime = false;
                    } else {
                        for (int j = 2; j * j <= number; j++) {
                            // Optimized check up to sqrt(number)
                            if (number % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                    }
                    if (isPrime) {
                        System.out.println(number + " is a Prime number.");
                    } else {
                        System.out.println(number + " is not a Prime number.");
                    }
                    break;
                case 2:
                    // Check if n is odd or even
                    if (number % 2 == 0) {
                        System.out.println(number + " is an Even number.");
                    } else {
                        System.out.println(number + " is an Odd number.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println(
                        "Invalid choice. Please enter 1, 2, or 3."
                    );
                    break;
            }
        }
        sc.close(); // It's good practice to close the scanner
    }
}
