// Delacre an integer value num with a value 100
// Convert it to double using widening casting
// Covert the same integer to byte using narrowwing casting 
// Print all three values 
public class Question {
    public static void main(String[] args) {
        // int num = 100;
        int num = 2534;
        double numDouble = num; // Widing casting
        byte numByte = (byte) num; // Narrowing casting

        System.out.println("Integer value: " + num);
        System.out.println("Double value: " + numDouble);
        System.out.println("Byte value: " + numByte);
    }
}

