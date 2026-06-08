import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // asList() create a list in only just one line
        List<Integer> list = Arrays.asList(10, 20, 30);

        // sort() used to sort an array
        int[] arr = new int[] {10, 5, 4, 3, 12, 8};
        Arrays.sort(arr);
             // sort(arr, fromIndex, toIndex) used to sort a specific part of an array
             Arrays.sort(arr, 0, 3);
        System.out.println(Arrays.toString(arr));

        // binarySearch() used to search for an element
        int[] arr1 = {50, 40, 10, 90, 3, 89};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int key = 10;
             // O(logN)
        int index = Arrays.binarySearch(arr1, 10);
             // binarySearch(arr, fromIndex, toIndex, key) used to search for an element in a specific part of an array
        int key1 = 90;
        int index1 = Arrays.binarySearch(arr1, 3, 6, key1);
        System.out.println(key + " found at index " + index);
        System.out.println(key1 + " found at index " + index1);

        // fill() used to fill an array with a specific value
        int[] arr2 = new int[10];
        Arrays.fill(arr2, 5);
        System.out.println(Arrays.toString(arr2));
    }
}
