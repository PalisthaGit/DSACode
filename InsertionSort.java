import java.util.Arrays;

class InsertionSort {

    static void insertionSort(int array[]) {

        for (int unsorted = 1; unsorted < array.length; unsorted++) {

            int value = array[unsorted];

            int i;

            for (i = unsorted; i > 0 && array[i - 1] > value; i--) {
                array[i] = array[i - 1];
            }
            array[i] = value;
        }
    }

    public static void main(String args[]) {

        int array[] = { 22, 36, -18, 6, 62 };

        insertionSort(array);

        System.out.println(Arrays.toString(array));
    }
}