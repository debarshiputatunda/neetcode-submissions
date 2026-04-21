class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        
        int count1[] = new int[26];
        int count2[] = new int[26];
        int n = s1.length();
        int m = s2.length();

        for(int i = 0; i < n; i++){
            char ch1 = s1.charAt(i);
            int index1 = ch1 - 'a';
            count1[index1] += 1;

            char ch2 = s2.charAt(i);
            int index2 = ch2 - 'a';
            count2[index2] += 1;
        }

        int matches = 0;
        for(int i = 0; i < 26; i++){
            if (count1[i] == count2[i]){
                matches++;
            }
        }

        int l = 0;
        for(int r = s1.length(); r < s2.length(); r++){
            if(matches == 26){
                return true;
            }

            int index = s2.charAt(r) - 'a';
            count2[index] ++;
            if (count1[index] == count2[index]){
                matches++;
            } else if(count1[index] + 1 == count2[index]){
                matches--;
            }

            index = s2.charAt(l) - 'a';
            count2[index] --;
            if (count1[index] == count2[index]){
                matches++;
            } else if(count1[index] - 1 == count2[index]){
                matches--;
            }
            l++;
        }
        return matches == 26;
    }
}