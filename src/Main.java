public class Main {

    public static void main(String[] args) {

        int[] arr = {5, 1, 4, 2, 8};

        System.out.println("Dãy số trước khi sắp xếp:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nDãy số sau khi sắp xếp:");
        printArray(arr);
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // hoán đổi 2 phần tử
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}