public class SortArray {

    public static void main(String[] arg)
    {
        int [] arr=new int[] {6,3,2,7};
        int temp=0;
        int i,j;
        System.out.println("Elements of Array");
        for (i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]);
        }

        for (i=0;i< arr.length;i++)
        {
            for (j=0;j< arr.length;j++)
            {
                if (arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Ascending order");
        for (i=0;i< arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
