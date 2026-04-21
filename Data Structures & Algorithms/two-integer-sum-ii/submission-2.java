class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int res[]=new int[2];
        int t1=0, t2=0;

        for(int i = 0; i < numbers.length; i++){
            t1 = numbers[i];
            if(t1 != t2){
                for(int j = 0; j < numbers.length; j++){
                    if(t1 + numbers[j] == target && i<j) return new int[]{i + 1, j + 1};
                }
            }
            t2 = numbers[i];
        }

        return new int[]{};
    }
}