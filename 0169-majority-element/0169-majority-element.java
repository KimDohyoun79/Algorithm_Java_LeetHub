class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int halfLen = nums.length/2;
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > halfLen)
                return num;
        }
        
        return 0;
    }
}