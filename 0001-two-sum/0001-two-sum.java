

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int len = nums.length; // nums의 길이
        int[] re = new int[2]; // 결과값으로 반환할 배열
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        Loop1 :
        for(int i = 0; i < len; i++){
            int n = target - nums[i];
            if(map.containsKey(n)){
                re[0] = i;
                re[1] = map.get(n);
                break Loop1;
            }
            map.put(nums[i], i);
        
        }

        return re;
    }
}