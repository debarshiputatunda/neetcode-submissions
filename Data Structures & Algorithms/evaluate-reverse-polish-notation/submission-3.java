class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        int total = 0;

        for(String x : tokens){
            int res = 0;
            if ("+-*/".contains(x)){
                int b = stack.pop();
                int a = stack.pop();

                if (x.equals("+")) {
                    res = a + b;
                } else if (x.equals("-")) {
                    res = a - b;
                } else if (x.equals("*")) {
                    res = a * b;
                } else if (x.equals("/")) {
                    res = a / b;
                }
                stack.push (res);
                total = total + res;
            }
            else {
                stack.push(Integer.parseInt(x));
            }
        }

        return stack.pop();
    }
}