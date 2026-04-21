class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int twosum[] = new int[2];
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                twosum[0] = map.get(diff);
                twosum[1] = i;
                break;
            }
            map.put (nums[i], i);
        }
        return twosum;
    }
}
