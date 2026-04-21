class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            map1.put(s.charAt(i), map1.get(s.charAt(i)) != null ? map1.get(s.charAt(i)) + 1 : 1);
            map2.put(t.charAt(i), map2.get(t.charAt(i)) != null ? map2.get(t.charAt(i)) + 1 : 1);
        }

        for(int i = 0; i < t.length(); i++){
            if (!Objects.equals(map1.get(s.charAt(i)), map2.get(s.charAt(i)))) return false;
            if (!Objects.equals(map1.get(t.charAt(i)), map2.get(t.charAt(i)))) return false;
        }

        return true;
    }
}
