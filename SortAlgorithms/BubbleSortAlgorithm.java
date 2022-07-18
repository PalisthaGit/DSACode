import java.util.Arrays;

class BubbleSort {

    static void bubbleSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j - 1]) {
                    
                    // swap arr[j] and arr[j - 1]
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 11, 1, 1, 4, 5, 6, 234, 0 };
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}