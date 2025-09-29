class ArithmaticException {

    public static void main(String[] args) {
        try {
            int n = 34;
            System.out.println(n / 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
