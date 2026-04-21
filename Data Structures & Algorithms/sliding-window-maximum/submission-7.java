class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int left = 0, right = k, c = 0, max = Integer.MIN_VALUE, pos = -1;
        int out[] = new int[nums.length - k + 1];

        if (k == 1){
            return nums;
        } else if (nums.length < k){
            for (int i : nums){
                max = Math.max(nums[i], max);
            }
            return new int[]{max};
        }

        while (left + k - 1 < nums.length){
            if (pos >= left){ 
                if(nums[left + k - 1] >= max){
                    max = nums[left + k  - 1];
                    pos = left + k - 1;
                }
            } 
            else { 
                max = Integer.MIN_VALUE;
                for(int i = left; i <= left + k - 1; i++){
                    if(nums[i] >= max){
                        max = nums[i];
                        pos = i;
                    }
                }
            }
            out[c++] = max;
            left++;
        }

        return out;
    }
}