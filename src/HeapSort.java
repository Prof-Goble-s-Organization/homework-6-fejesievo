import java.util.Arrays;

public class HeapSort {
    public static void heapSort(Integer[] values) {
        // Intentionally not implemented -- see homework assignmnet
            int n = values.length;
        
            // Build a max heap
            for (int parentIndex = (n / 2) - 1; parentIndex >= 0; parentIndex--) {
                heapify(values, parentIndex, n);
            }
        
            // Extract elements from the heap one by one
            for (int endIndex = n - 1; endIndex > 0; endIndex--) {
                swap(values, 0, endIndex); 
                heapify(values, 0, endIndex); 
            }
        }
        
        private static void heapify(Integer[] array, int rootIndex, int size) {
            int largest = rootIndex;
            int leftChild = 2 * rootIndex + 1;
            int rightChild = 2 * rootIndex + 2;
        
            if (leftChild < size && array[leftChild] > array[largest]) {
                largest = leftChild;
            }
        
            if (rightChild < size && array[rightChild] > array[largest]) {
                largest = rightChild;
            }
        
            if (largest != rootIndex) {
                swap(array, rootIndex, largest);
                heapify(array, largest, size); 
            }
        }
        
        private static void swap(Integer[] array, int firstIndex, int secondIndex) {
            int temp = array[firstIndex];
            array[firstIndex] = array[secondIndex];
            array[secondIndex] = temp;
        }

    public static void main(String[] args) {
        int size = 20;
        Integer[] list = new Integer[size];

        for (int i = 0; i < list.length; i++) {
            list[i] = i;
        }

        System.out.println("Unsorted List: " + Arrays.toString(list));
        heapSort(list);
        System.out.println("  Sorted List:" + Arrays.toString(list));
    }
}
