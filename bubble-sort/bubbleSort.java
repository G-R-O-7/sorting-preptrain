import java.util.Arrays; // Arrays utility for output

public class BubbleSort { // This is 3rd line - BRANCH1
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) { // Modified loop logic in branch1
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // Reversed comparison in branch1
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array (BRANCH1): " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
