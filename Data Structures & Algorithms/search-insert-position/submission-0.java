class Solution {
    public int searchInsert(int[] nums, int target) {

    int result = nums.length;
     int left = 0;
     int right = nums.length-1;

     while(left <= right){
        int mid = left + (right - left)/2;

        if(nums[mid]== target){
            return mid;
        }
        else if(nums[mid] > target){
            result = mid;
            right = mid-1;
        }
        else{
            left = mid+1;
        }
     }  
return result;
    }
}