class Solution {
    public int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        int result = 0;

        while(left<right){
            int area = Math.min(nums[left], nums[right])*(right-left);

            result = Math.max(result,area);

            if(nums[left]<=nums[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return result;
    }
}
