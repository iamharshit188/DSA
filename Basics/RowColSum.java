public class RowColSum {
    public static int rowSum(int[][] m , int r ) {
        int sum = 0 ;
        for(int j = 0; j< m[r].length; j++){
            sum += m[r][j];
            
        }
        return sum;
    }
    
    public static int colSum(int [][] m , int c ) {
        int sum = 0 ;
        for(int i = 0; i< m.length; i++){
            sum += m[i][c];
        }
        return sum;
    }
    public static void main(String [] args)
    {
       int [][]matrix = {
           {1, 2, 3},
           {4, 5, 6},
           {7, 8, 9}
       } ;
       int rowIndex = 2;
       int colIndex = 2;
       System.out.println("Row Sum: " + rowSum(matrix, rowIndex));
       System.out.println("Column Sum: " + colSum(matrix, colIndex));
    }
}