class Item {
    int val;
    int currMin;

    public Item (int val, int currMin){
        this.val = val;
        this.currMin = currMin;
    }
}

class MinStack {
    private Stack<Item> stack;

    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int val) {
        int newMin = stack.isEmpty() ? val : Math.min(val, stack.peek().currMin);
        stack.add(new Item(val, newMin));
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
