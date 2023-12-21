package AlgorithmToCodingImplementation.Sort;

public class QuickSort {

    // look at wikipedia flowchart
        public static void main(String[] args) {
            int[] arr = {5, 3, 1, 4, 2, 6};

            quickSort(arr, 0, arr.length - 1);

            System.out.println("Sorted Array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }

        public static void quickSort(int[] arr, int low, int high) {
            if (low < high) {
                int pivotIndex = partition(arr, low, high);

                // Recursively sort the elements before and after the pivot
                quickSort(arr, low, pivotIndex - 1);
                quickSort(arr, pivotIndex + 1, high);
            }
        }

        public static int partition(int[] arr, int low, int high) {
            int pivot = arr[high];
            int i = low - 1;

            for (int j = low; j < high; j++) {
                if (arr[j] < pivot) {
                    i++;

                    // Swap arr[i] and arr[j]
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            // Swap arr[i+1] and arr[high] (the pivot)
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            return i + 1;
        }
    }

