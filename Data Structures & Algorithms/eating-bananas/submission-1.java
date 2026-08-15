public class Solution {
    public int minEatingSpeed(int[] nums, int h) {
        int left = 1;
        int right = Arrays.stream(nums).max().getAsInt();
        

        int result = right;

        while(left<=right){
            int index = left + (right - left)/2;

            long time = 0;

            for(int num:nums){
                time +=Math.ceil((double) num/index );
            }

            if(time<=h){
                result = index;

                right = index -1;
            }
            else{
                left = index+1;
            }
        }
return result;
    }
}