import java.util.Scanner;

public class sum_of_the_primenumber {
    private static Scanner sc;
    int j,i;
    public static void main(String[] arg)
    {
        int flag=0;
        int j,i;
        System.out.println("Enter the number" );
        sc=new Scanner(System.in);
        int b= sc.nextInt();
        for (i=2;i<b;i++)
        {
            if (b%i==0)
            {
                flag=1;
            }
        }
        if (flag==1)
        {
            System.out.println("Not a prime number");
        }
        else
        {
            System.out.println("Prime number");
        }
    }
}
