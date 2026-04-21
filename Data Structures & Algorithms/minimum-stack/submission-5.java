class Item {
    int val;
    int currMin;

    public Item (int val, int currMin){
        this.val = val;
        this.currMin = currMin;
    }
}

class MinStack {
    private Deque<Item> stack;

    public MinStack() {
        stack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        int newMin = stack.isEmpty() ? val : Math.min(val, stack.peek().currMin);
        stack.push(new Item(val, newMin));
    }
    
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek().val;
    }
    
    public int getMin() {
        return stack.peek().currMin;
    }
}
