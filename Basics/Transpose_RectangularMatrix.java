public class Transpose_RectangularMatrix {

    // Method to transpose a matrix and return a new matrix
    public static int[][] transpose(int[][] m) {
        int R = m.length;       // number of rows
        int C = m[0].length;    // number of columns
        int[][] t = new int[C][R]; // transposed matrix (C x R)

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                t[j][i] = m[i][j];
            }
        }
        return t;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example: 2x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Transpose and store in a new matrix
        int[][] transposed = transpose(matrix);

        System.out.println("\nTransposed Matrix:");
        printMatrix(transposed);
    }
}
