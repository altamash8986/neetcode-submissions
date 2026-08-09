class Solution {
    public int calPoints(String[] nums) {
        int res = 0;

        Stack<Integer> stack = new Stack<>();

        for(String op:nums){
            if(op.equals("+")){
                int top = stack.pop();
                int newtop = top+ stack.peek();

                stack.push(top);
                stack.push(newtop);
                
                res+=newtop;
            }
            else if(op.equals("D")){
                stack.push(2*stack.peek());
                res+=stack.peek();
            }

            else if(op.equals("C")){
                res-=stack.pop();
            }
            else{
                stack.push(Integer.parseInt(op));
                res+=stack.peek();
            }
        }
        return res;
    }
}