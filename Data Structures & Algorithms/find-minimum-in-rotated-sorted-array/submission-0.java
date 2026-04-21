class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        int min = nums[0];

        while (l <= r) {
            if (nums[l] < nums [r]){
                min = Math.min(nums[l], min);
                break;
            }
            int m = (l + r) / 2;
            min = Math.min(nums[m], min);
            if (nums[l] <= nums[m]){
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return min;
    }
}
