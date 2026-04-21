class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new ArrayDeque<>();
        int warm[] = new int[temperatures.length];
        int right = 0, left = 0;

        for(int i = 0; i < temperatures.length; i++){
            while (!stack.isEmpty() && temperatures[stack.peek()] < temperatures [i]){
                warm [stack.peek()] = i - stack.pop();
            }
            if (stack.isEmpty() || temperatures[i] <= temperatures [stack.peek()]){
                stack.push(i);
            }
        }

        return warm;
    }
}
