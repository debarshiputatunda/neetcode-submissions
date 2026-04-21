class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String sh = Arrays.toString(ch);
            map.putIfAbsent(sh, new ArrayList<>());
            map.get(sh).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
