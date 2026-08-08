class MyQueue {

private Stack<Integer> firststack;
private Stack<Integer> secondstack;

    public MyQueue() {
        firststack = new Stack<>();
        secondstack = new Stack<>();
    }
    
    public void push(int x) {
        firststack.push(x);
    }
    
    public int pop() {
        while(!firststack.isEmpty()){
            secondstack.push(firststack.pop());
        }
        int removed = secondstack.pop();

        while(!secondstack.isEmpty()){
            firststack.push(secondstack.pop());
        }
        return removed;
    }
    
    public int peek() {
          while(!firststack.isEmpty()){
            secondstack.push(firststack.pop());
        }
        int peek = secondstack.peek();

        while(!secondstack.isEmpty()){
            firststack.push(secondstack.pop());
        }
        return peek;
    }
    
    public boolean empty() {
        return firststack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */