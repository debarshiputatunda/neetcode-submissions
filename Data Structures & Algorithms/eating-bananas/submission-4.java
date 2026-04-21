class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        Arrays.sort(piles);

        if (h == n) return piles[n -1];
        
        int k = piles[n - 1], l = 1;

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