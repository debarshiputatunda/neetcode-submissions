class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        
        int k = 0, l = 1;

        for (int pile : piles)
            k = Math.max(k, pile);

        while (l < k) {
            int m = l + (k - l) / 2;
            int x = 0;
            for (int i = 0; i < n; i ++){
                x += (piles[i] + m - 1) / m;
            }
            if (x > h)
                l = m + 1;
            else 
                k = m;
        }

        return l;

    }
}