public class Sumofarray
{
    public static void main(String arg[])
    {
        int []arr =new int[] {5,10,15,20,25};
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of the Array :::"+sum);
    }
}
