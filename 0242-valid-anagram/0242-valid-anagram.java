class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(int i = 0; i < t.length(); i++){
            if( map.containsKey(t.charAt(i))){
                if (map.get(t.charAt(i)) > 0)
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                else
                    return false;
            }
            else
                return false;
        }
        
        return  s.length() ==  t.length() ? true : false;
        
    }
}