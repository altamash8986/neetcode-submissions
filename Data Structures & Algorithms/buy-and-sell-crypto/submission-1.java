class Solution {
    public int maxProfit(int[] nums) {

    int min = Integer.MAX_VALUE;
    int profit = 0;

    for(int i=0;i<nums.length;i++){
        min = Math.min(min,nums[i]);
        profit = Math.max(profit,nums[i]- min);
    }
return profit;
    }
}
