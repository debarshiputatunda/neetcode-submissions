class Solution {
    public int minEatingSpeed(int[] piles, int h) {       
        int k = 0, l = 1;

        for (int pile : piles)
            k = Math.max(k, pile);
        int res = k;

        while (l <= k) {
            int m = (l + k) / 2;
            int x = 0;
            for (int p : piles){
                x += Math.ceil((double) p / m);
            }
            if (x <= h){
                res = m;
                k = m - 1;
            } else {
                l = m + 1;
            }
        }
        return res;

    }
}