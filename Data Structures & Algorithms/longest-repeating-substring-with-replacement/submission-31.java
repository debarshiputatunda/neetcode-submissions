class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, maxf = 0, res = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < s.length(); r ++){
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            maxf = Math.max(maxf, map.get(ch));

            while((r - l + 1) - maxf > k){
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l ++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;

        /*int max = 0, t = 0, copy = k;
        char prev = s.charAt(0), curr;

        for(int i = 0; i < s.length(); i ++){
            curr = s.charAt(i);
            if (prev == curr){
                t++;
            }
            else if (copy != 0){
                copy --;
                t ++;
            }
            else{
                max = Math.max (t, max);
                t = 1;
                copy = k;
                prev = s.charAt(i);
            }
        }
        if (max + k >= s.length())
            max = s.length();
        return Math.max (t, max);*/
    }
}
