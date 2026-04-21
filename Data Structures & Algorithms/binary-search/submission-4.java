class Solution {
    public int search(int[] nums, int target) {
        //Arrays.sort(nums);
        
        int start = 0, end = nums.length - 1;

        while (start <= end){
            int middle = start + (end - start) / 2;

            if (target == nums[middle]){
                return middle ;
            }

            if (target > nums[middle]){
                start = middle + 1;
                
            } else {
                end = middle - 1;
            }
        }

        return -1;
    }
}
