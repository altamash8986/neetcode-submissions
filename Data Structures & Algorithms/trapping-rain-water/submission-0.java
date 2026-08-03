class Solution {
    public int trap(int[] nums) {
        if(nums==null || nums.length==0){
            return  0;
        }

        int left = 0;
        int right = nums.length-1;

        int leftmax = nums[left];
        int rightmax = nums[right];

        int count = 0;

        while(left<right){
            if(leftmax<rightmax){
                left++;
                leftmax = Math.max(leftmax,nums[left]);

                count+=leftmax - nums[left];
            }
            else{
                right--;
                rightmax = Math.max(rightmax,nums[right]);

                count+=rightmax - nums[right];
            }
        }
        return count;
    }
}
