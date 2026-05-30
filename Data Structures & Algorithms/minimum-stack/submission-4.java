class MinStack {
    private Stack<Integer> main;
    private Stack<Integer> sub;
    public MinStack() {
        main = new Stack<>();
        sub = new Stack<>();
    }
    
    public void push(int val) {
        if(sub.isEmpty() || val<=sub.peek()){
            sub.push(val);
        }
        main.push(val);
    }
    
    public void pop() {
        int temp = main.pop();
        if(sub.peek()==temp){
            sub.pop();
        }
    }
    
    public int top() {
        return main.peek();
    }
    
    public int getMin() {
        return sub.peek();
    }
}
