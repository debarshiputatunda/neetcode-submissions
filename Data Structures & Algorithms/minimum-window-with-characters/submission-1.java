class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> countT = new HashMap<>();
        int c = 0;
        for(char ch : t.toCharArray()){
            countT.put(ch, countT.getOrDefault(ch, 0) + 1);
            c++;
        }

        int n = countT.size(); 
        int min = s.length();
        String out = "";
        for(int i = 0; i < s.length(); i++){
            Map<Character, Integer> countS = new HashMap<>();
            int t1 = 0, t2 = 0;
            String p = "";
            for(int j = i; j < s.length(); j++){
                char ch = s.charAt(j);
                countS.put(ch, countS.getOrDefault(ch, 0) + 1);
                p += Character.toString(ch);
                t2++;
                if(countT.getOrDefault(ch, 0) == countS.get(ch)){
                    t1++;
                }
                if(t1 == n && p.length() <= min){
                    min = p.length();
                    out = p;
                }
            }
        }
        return out;
    }
}
