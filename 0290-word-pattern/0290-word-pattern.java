class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        Map<String, String> map = new HashMap<>();
        String[] p = pattern.split("");
        String[] str = s.split(" ");
        
        if(p.length != str.length)
            return false;
        
        for(int i = 0; i < p.length; i++){
            if(map.containsKey(p[i])){
                if(!map.get(p[i]).equals(str[i]))
                    return false;
            }
            else{
                if(!map.containsValue(str[i]))
                    map.put(p[i], str[i]);
                else
                    return false;
                
            }
        } 
        return true;
    }
}