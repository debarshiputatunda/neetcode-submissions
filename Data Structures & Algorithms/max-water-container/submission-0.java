class Solution {
    public int maxArea(int[] nums) {
        int max = 0;
        int i = 0, k = nums.length - 1;
        while(i < k){
            int prod = nums[i] > nums[k] ? nums[k] * (k - i) : nums [i] * (k - i);
            max = Math.max(prod, max);
            if (nums[i] > nums[k]) k--;
            else i++;
        }
        return max;
    }
}