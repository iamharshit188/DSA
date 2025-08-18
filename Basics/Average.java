import java.util.Scanner;
class Average
{
    public static void main(String [] args)
    {
        int num_1 , num_2 , num_3;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter three numbers");
        num_1 = sc.nextInt();
        num_2 = sc.nextInt();
        num_3 = sc.nextInt();
        
        int average = (num_1 + num_2 + num_3) / 3;
        System.out.println("Average :" + average);
    }
}