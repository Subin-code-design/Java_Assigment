import java.util.Scanner;

public class factorial {
    private static Scanner sc;
    int j,n;
    public static void main(String[] arg)
    {
        int fact=1;
        sc=new Scanner(System.in);
        System.out.println("Enter a Number :::");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of"+n+"is"+fact);
    }
}
