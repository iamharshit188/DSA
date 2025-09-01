class Print2DArray {
    public static void main(String []args)
    {
        int [] [] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // Step 2 
        System.out.println(" 2D Array Elements ");
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[i].length ; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
