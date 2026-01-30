import java.util.Scanner;

public class BinarySearchArray {

    // Binary Search Method
    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;   // avoids overflow

            if (arr[mid] == key)
                return mid;          // element found
            else if (arr[mid] < key)
                low = mid + 1;       // search right half
            else
                high = mid - 1;      // search left half
        }
        return -1;  // element not found
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50, 60, 70};  // must be sorted
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, key);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");

        sc.close();
    }
}
