class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int numsLen = nums.length;
        int[] result = new int[numsLen*2];

        int j = 0;
        for(int i = 0; i< numsLen*2;i++){
            if(j == nums.length)
                j = 0;
            result[i] = nums[j++];
        }
        return result;
    }
}