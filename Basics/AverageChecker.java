// Java Program to check if the the average is greater than each of the number, using realtional and logical operator
// 
import java.util.Scanner;
class AverageChecker {

    // Function to check if the average is greater than each number
    static boolean isAverageGreaterThanEach(int x, int y, int z) {
        double average = (double)(x + y + z) / 3; //Use double to avoid integer division errors
        return (average > x) && (average > y) && (average > z);
    }

    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        double average = (double)(num1 + num2 + num3) / 3;
        System.out.println("Average: " + average);

        if (isAverageGreaterThanEach(num1, num2, num3)) {
            System.out.println("Average is greater than each number.");
        } else {
            System.out.println("Average is NOT greater than each number.");
        }
        sc.close();
    }
}
