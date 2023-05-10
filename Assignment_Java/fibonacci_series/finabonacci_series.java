public class finabonacci_series {
    public static void main(String arg[])
    {
        int a=0;
        int b=1;
        int i;
        int temp;
        int count=10;
        System.out.print(a+" "+b);
        for (i=2;i<count;i++)
        {
            temp=a+b;
            System.out.print(" "+temp);
            a=b;
            b=temp;
        }
    }
}
