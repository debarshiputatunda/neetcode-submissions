class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int l = 0, maxf = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {
            int idx = s.charAt(r) - 'A';
            count[idx]++;
            
            maxf = Math.max(maxf, count[idx]);

            while ((r - l + 1) - maxf > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}