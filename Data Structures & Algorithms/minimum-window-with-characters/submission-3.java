class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) return "";

        int countT[] = new int[128];

        for(char c : t.toCharArray()){
            countT[c] ++;
        }

        int required = t.length();
        int left = 0, right = 0;
        int min = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()){
            char c = s.charAt(right);

            if (countT[c] > 0){
                required --;
            }
            countT[c]--;

            while (required == 0){
                if (right - left + 1 < min){
                    min = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                countT[leftChar] ++;
                if (countT[leftChar] > 0){
                    required++;
                }
                left ++;
            }
            right ++;
        }

        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}
