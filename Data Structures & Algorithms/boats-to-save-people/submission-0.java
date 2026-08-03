class Solution {
    public int numRescueBoats(int[] nums, int limit) {
        Arrays.sort(nums);

        int count = 0;
        int left = 0;
        int right = nums.length-1;

        while(left<=right){
            int remain = limit - nums[right--];
            count++;

            if(left<=right && remain>=nums[left]){
                left++;
            }
        }
        return count;
    }
}