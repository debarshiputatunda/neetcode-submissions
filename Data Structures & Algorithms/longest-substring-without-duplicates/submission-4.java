class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxl = 0;
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (temp.indexOf(Character.toString(ch)) != -1){
                maxl = Math.max (temp.length(), maxl);
                temp.delete(0, temp.indexOf(Character.toString(ch)) + 1);
            }
            temp.append(ch);
        }
        return Math.max (temp.length(), maxl);
    }
}