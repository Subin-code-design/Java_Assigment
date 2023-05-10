import java.util.Scanner;

public class prime_number {
    private static Scanner sc;
    int flag=0;
    int j,i;
    //System.out.println("Largest in given array is " );
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
//    public static void main(String arg[])
//    {
//        int flag=0;
//        int j,i;
//        System.out.println("Enter the number" );
//        sc=new Scanner(System.in);
//        int b= sc.nextInt();
//        if(b % 2 == 0)
//            System.out.println(num + " is even");
//        else
//            System.out.println(num + " is odd");
//    }
