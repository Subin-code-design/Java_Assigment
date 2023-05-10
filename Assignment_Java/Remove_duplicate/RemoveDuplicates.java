import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 1};
        int[] changeArr = remove(arr);

        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Action performed Array: " + Arrays.toString(changeArr));
    }

    public static int[] remove(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = arr[length - 1];
                    length--;
                    j--;
                }
            }
        }

        int[] changeArr = Arrays.copyOf(arr, length);
        return changeArr;
    }
}
