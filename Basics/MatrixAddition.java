public class MatrixAddition {

    public static int[][] add(int[][] A, int[][] B) {
        int R = A.length;       
        int C = A[0].length;    
        int[][] S = new int[R][C]; 

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                S[i][j] = A[i][j] + B[i][j];
            }
        }

        return S;
    }

    public static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A = {
            { 1, 2, 3 },
            { 4, 5, 6 }
        };

        int[][] B = {
            { 7, 8, 9 },
            { 10, 11, 12 }
        };

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("\nMatrix B:");
        printMatrix(B);

        // Add A and B
        int[][] sum = add(A, B);

        System.out.println("\nSum of A and B:");
        printMatrix(sum);
    }
}
