// Write a java Program that :
// Reads an integer from the user
// Uses if and else to check if it is positive or negative
// Use for loop to print from 1 to n
// Uses a switch statement to print the correspoding day of the week
//
import java.util.Scanner;

class TestQuestion1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.print("Number is negative");
        } else {
            System.out.print("number is Zero");
        }

        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        String dayName;
        switch (number) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName =
                    "Invalid input! Please enter a number between 1 and 7.";
                break;
        }

        System.out.println("The day is: " + dayName);
    }
}
