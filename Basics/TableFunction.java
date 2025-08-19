import java.util.Scanner;
class TableFunction
{
    static void printTable(int n)
    {
        for( int i = 1 ; i<= 10 ; i++ )
           {
            System.out.println(n + " X " + i + " = " + n*i);
           }
    }
    public static void main(String []args)
    {
        System.out.println("Enter the number");
        Scanner keyboard = new Scanner(System.in);
        int n = keyboard.nextInt() ;
        printTable(n);
    }
}
