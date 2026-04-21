class Solution {

    public String encode(List<String> strs) {
        StringBuilder enc = new StringBuilder();
        for(String s : strs){
            enc.append(String.valueOf(s.length()) + "#");
            enc.append(s);
        }
        return enc.toString();
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        String t = "";
        int index = 0;

        while(index < str.length()){
            char c = str.charAt(index);
            
            if(c == '#'){
                int wl = Integer.parseInt(t);
                strs.add(str.substring(index + 1, index + wl + 1));
                index += wl + 1;
                t = "";
            } else{
                index ++;
                t += String.valueOf(c);
            }
        }
        return strs;
    }
}
