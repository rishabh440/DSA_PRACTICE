class MyQueue {
Stack<Integer> in = new Stack<>();
    Stack<Integer> out = new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        in.add(x);
    }
    
    public int pop() {
        if(out.size()!=0){
            return out.pop();
        }
        while(in.size()!=0){
            out.push(in.pop());
        }
     int x = out.peek();
        out.pop();
        return x;
    }
    
    public int peek() {
        if(out.size()!=0){
            return out.peek();
        }
        while(in.size()!=0){
            out.push(in.pop());
        }
         return out.peek();
    }
    
    public boolean empty() {
        if((in.size()+ out.size())==0)return true;
        return false;
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