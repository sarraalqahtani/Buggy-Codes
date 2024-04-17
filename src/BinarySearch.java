
public class BinarySearch {


    //this method does binary search in a sorted array
    public static int binarySearch(int[] arr, int key, int low, int high) {

        if (low == high) {
            return -1;  // Indicates not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return binarySearch(arr, key, mid + 1, high);
        } else {
            return binarySearch(arr, key, low, mid);
        }
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 3, 5, 7, 9, 11};
        int keyToFind = 7;

        int resultIndex = binarySearch(sortedArray, keyToFind, 0, sortedArray.length - 1);
        if (resultIndex == -1) {
            System.out.println("Key not found in the array.");
        } else {
            System.out.println("Key found at index: " + resultIndex);
        }
    }
}
