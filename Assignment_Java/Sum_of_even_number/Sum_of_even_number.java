import java.util.Scanner;

public class Sum_of_even_number {
    private static Scanner sc;
    public static void  main(String[] arg)
    {
        int number,i,sum1 = 0;
        sc=new Scanner(System.in);
        System.out.print("Enter the limit ");
        number=sc.nextInt();

        for (i=1;i<=number;i++)
        {
            if (i%2==0)
            {
                sum1=sum1+i;
            }
        }
        System.out.print("Sum of the even numbers upto "+number+ "="+sum1);
    }

}
