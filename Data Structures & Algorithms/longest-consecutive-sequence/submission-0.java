class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = 0;

        for (int a : nums){
            set.add(a);
        }

        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i] - 1)){
                int length = 1, curr = nums[i];
                while(set.contains(curr + 1)){
                    curr++;
                    length++;
                }
                max = Math.max(length, max);
            }
        }
        return max;
    }
}
