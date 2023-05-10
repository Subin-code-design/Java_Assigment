import java.util.*;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        int[] union = findUnion(arr1, arr2);

        System.out.println("Union of the arrays: " + Arrays.toString(union));
    }
    public static int[] findUnion(int[] arr1, int[] arr2) {
        Set<Integer> unionSet = new HashSet<>();
        for (int num : arr1) {
            unionSet.add(num);
        }
        for (int num : arr2) {
            unionSet.add(num);
        }
        int[] union = new int[unionSet.size()];
        int index = 0;
        for (int num : unionSet) {
            union[index] = num;
            index++;
        }
        return union;
    }
}
