class Solution {
    public int[] asteroidCollision(int[] nums) {

     Stack<Integer> stack = new Stack<>();

     for(int num: nums ){
        while(!stack.isEmpty() && num< 0 && stack.peek()> 0){
            int diff = num + stack.peek();

            if(diff< 0){
                stack.pop();
            }
            else if(diff > 0){
                num = 0;
            }
            else{
                num = 0;
                stack.pop();
            }
        }
        if(num!=0){
            stack.add(num);
        }
     }   
     return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}