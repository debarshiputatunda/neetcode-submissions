class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, l = numbers.length - 1, sum = 0;

        while(i < l){
            sum = numbers[i] + numbers[l];
            if (sum == target){
                return new int[]{i + 1, l + 1};
            } else if (sum < target){
                i++;
            }else if (sum > target){
                l--;
            }
        }

        return new int[]{};
    }
}