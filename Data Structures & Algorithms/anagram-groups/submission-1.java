class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int n[] = new int[26];
            for(char c: s.toCharArray()){
                n[c - 'a'] ++;
            }

            String sh = Arrays.toString(n);
            map.putIfAbsent(sh, new ArrayList<>());
            map.get(sh).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
