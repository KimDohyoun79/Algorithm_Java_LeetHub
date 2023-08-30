class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        
        String str = "";
        
        int max = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            
            if(!str.contains("" + s.charAt(right)))
                str += s.charAt(right);
            else{
                max = Math.max(max, str.length());
               
                for(int l = left; l < str.length(); l++){
                    if(str.charAt(l) == s.charAt(right))
                        str = str.substring(l + 1, str.length());
                }
                str += s.charAt(right);
            }
                    
        }
        return max > str.length() ? max : str.length();
        
    }
}