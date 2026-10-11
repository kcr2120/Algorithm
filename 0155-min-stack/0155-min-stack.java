class MinStack {

    private static final int MAX_SIZE = 30000;
    private int[][] stack = new int[MAX_SIZE + 1][2];
    private int top = -1;


    public MinStack() {
    }
    
    public void push(int val) {
        int min = top == -1 ? val : Math.min(stack[top][1], val);
        stack[++top][0] = val;
        stack[top][1] = min;
    }
    
    public void pop() {
        top--;
    }
    
    public int top() {
        return stack[top][0];
    }
    
    public int getMin() {
        return stack[top][1];
    }
}