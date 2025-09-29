class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class AgeCheck {
    public static void main(String[] args) {
        int age = 15; // Example age

        try {
            checkAge(age);
            System.out.println("Age is valid.");
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    
}

