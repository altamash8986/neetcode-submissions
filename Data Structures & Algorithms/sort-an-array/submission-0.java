class Solution {
    public int[] sortArray(int[] nums) {
        // Just call the helper method and return the modified array
        mergeSort(nums);
        return nums;
    }

    private void mergeSort(int[] arr) {
        int len = arr.length;

        // Base case: if the array has 1 or 0 elements, it is already sorted
        if (len <= 1) {
            return;
        }

        int mid = len / 2;

        int[] leftArr = new int[mid];
        int[] rightArr = new int[len - mid];

        int i = 0;
        int j = 0;

        // Split the array into left and right halves
        for (; i < len; i++) {
            if (i < mid) {
                leftArr[i] = arr[i];
            } else {
                rightArr[j] = arr[i];
                j++;
            }
        }

        // Recursively sort both halves, then merge them
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }

    private void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize; 
        
        int i = 0; 
        int l = 0;
        int r = 0;

        // Compare elements from left and right arrays and place the smaller one in arr
        while (l < leftSize && r < rightSize) {
            if (leftArr[l] < rightArr[r]) {
                arr[i] = leftArr[l];
                l++;
            } else {
                arr[i] = rightArr[r];
                r++;
            }
            i++;
        }

        // Copy any remaining elements from the left array
        while (l < leftSize) {
            arr[i] = leftArr[l];
            i++;
            l++;
        }
        
        // Copy any remaining elements from the right array
        while (r < rightSize) {
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }
}