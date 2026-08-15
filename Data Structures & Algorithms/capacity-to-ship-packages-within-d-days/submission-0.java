class Solution {
    public int shipWithinDays(int[] nums, int days) {
        int result = 0;
        for(int num:nums){
            result = Math.max(result,num);
        }

        while(true){
            int count = 1;

            int capacity = result;

            for(int num:nums){
                if(capacity - num < 0){
                    count++;
                    capacity = result;
                }
                capacity-=num;
            }
            if(count<=days){
                return result;
            }
        
        result++;
        }
    }
}