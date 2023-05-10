public class minimum_element {

    static int arr[]={2,5,7,1,4};
    static int minimum()
    {
        int i;
        int min=arr[0];
        for (i=0;i<arr.length;i++)
        {
            if (arr[i] < min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String arg[])
    {
        System.out.println("Minimum in given array is " + minimum());
    }
}
