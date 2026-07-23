class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums){
            set.add(num);
        }

        int count =0;

        for(int n:set){
            if(!set.contains(n-1)){
                int curr = n;   
                int currcount = 1;  


                while(set.contains(curr+1)){
                    curr++;
                    currcount++;
                }

                count = Math.max(count,currcount);
            }
        }
        return count;
    }
}
