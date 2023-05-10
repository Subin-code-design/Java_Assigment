public class minimum_maximum_element_array {

    static int arr[] = {8, 5, 8, 9, 3};

    static int largest() {
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
            }
        return max;
    }
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
    public static void main(String arg[]) {
        System.out.println("Largest in given array is " + largest());
        System.out.println("Minimum in given array is " + minimum());
    }
}
