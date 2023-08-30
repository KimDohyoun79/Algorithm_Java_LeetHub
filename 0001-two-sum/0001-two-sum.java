import java.util.Hashtable;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int len = nums.length;
        int[] re = new int[2];
        
        Loop1 :
        for(int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < len; j++) {
                if(nums[i] + nums[j] == target){
                    re[0] = i;
                    re[1] = j;
                    break Loop1;
                }
            }
        }

        return re;
    }
}