public class maximum_element_array {
        static int arr[]={1,22,3,4,10};
        static int largest()
        {
            int i;
            int max = arr[0];
            for (i = 1; i < arr.length; i++)
                if (arr[i] > max)
                {
                    max = arr[i];
                }
            return max;
        }
        public static void main(String arg[])
        {
            System.out.println("Largest in given array is " + largest());
        }
}
