class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> map = new HashMap();
        
        // magazine 문자 map에 초기화
        for(char c : magazine.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);
        
        // ransomNote 문자 존재 및 개수 확인
        for(char c : ransomNote.toCharArray()){
            if(map.containsKey(c) && map.get(c) > 0)
                map.put(c, map.get(c) - 1);
            else
                return false;
        }
        
        return true;
        
    }
}