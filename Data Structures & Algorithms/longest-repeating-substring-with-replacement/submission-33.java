class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        char[] arr = s.toCharArray();

        int l = 0, maxf = 0, res = 0;

        for (int r = 0; r < arr.length; r++) {
            int idx = arr[r] - 'A';
            int newCount = ++count[idx];

            if (newCount > maxf) {
                maxf = newCount;
            }

            if (r - l + 1 - maxf > k) {
                count[arr[l] - 'A']--;
                l++;
            }

            int window = r - l + 1;
            if (window > res) {
                res = window;
            }
        }

        return res;
    }
}