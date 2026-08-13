class Solution {
    public int[] dailyTemperatures(int[] nums) {
        
        int[] res = new int[nums.length];
        Stack<int[]> stack = new Stack<>();

        //pair [temp, index]

        for(int i=0;i<nums.length;i++){
            int num = nums[i];

            while(!stack.isEmpty() && num> stack.peek()[0]){
                int[] pair = stack.pop();
                res[pair[1]] = i- pair[1];
            }

            stack.push(new int[]{num,i});
        } 
        return res;
    }
}
