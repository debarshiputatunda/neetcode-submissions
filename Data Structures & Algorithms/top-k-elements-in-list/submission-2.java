class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Step 1: Count frequency
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        // Step 2: Create buckets
        List<Integer>[] bucket = new List[nums.length + 1];

        for(int key: map.keySet()){
            int freq = map.get(key);

            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }

            bucket[freq].add(key);
        }

        // Step 3: Collect top k elements
        int result[] = new int[k];
        int index = 0;
        for(int i = bucket.length - 1; i >= 0 && index < k; i--){
            if(bucket[i] != null){
                for(int j: bucket[i]){
                    result[index] = j;
                    index++;
                    if(index == k) break;
                }
            }
        }

        return result;
    }
}