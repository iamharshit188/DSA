public class ArrayPractise {

    public static void main(String[] args) {
        int[][] jag = new int[3][];
        jag[0] = new int[] { 1, 2 };
        jag[1] = new int[] { 3, 4, 5 };
        jag[2] = new int[] { 6 };
        
        System.out.println("Jagged Array contents: ");
        for (int i = 0; i < jag.length; i++) {
            System.out.print("Row " + i + ": ");
            for (int j = 0; j < jag[i].length; j++) {
                System.out.print(jag[i][j] + " ");
            }
            System.out.println(); // Move to next line after each Row
        }
    }
}
