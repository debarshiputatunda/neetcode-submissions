class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder n = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLetter(c) || Character.isDigit(c))
                n.append(c);
        }

        String copy  = n.toString();
        int i = 0, j = copy.length() - 1;
        copy = copy.toLowerCase();

        while (i <= j){
            if(copy.charAt(i) == copy.charAt(j)){
                i++;
                j--; 
            } else return false;
        } 
        return true;
    }
}
