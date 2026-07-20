class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Pass 1: Calculate the Prefix product for every element
        // There is nothing to the left of the first element, so its prefix is 1
        result[0] = 1; 
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        // Pass 2: Calculate Suffix products on the fly and multiply into result
        // There is nothing to the right of the last element, so its suffix is 1
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * suffix; // Prefix * Suffix
            suffix = suffix * nums[i];      // Update suffix for the next element leftwards
        }
        
        return result;
    }
}
