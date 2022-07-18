import java.util.Arrays;

class SelectionSort {
    static void selectionSort(int arr[]) {

        int smallest;
        // loop through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // set smallest as i
            smallest = i;
            
            //loop through the array again from i + 1
            for (int j = i + 1; j < arr.length; j++) {
                
                //check if value in smallest index is greater than arr[j]
                if (arr[j] < arr[smallest]) {
                    
                    smallest = j;
                }
            }
            
            // swap current value and smallest
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 2, 11, 1, 1, 4, 5, 6, 234, 0 };
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}