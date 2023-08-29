class Solution {
    public boolean canJump(int[] nums) {
        
        int len = nums.length;
        boolean[] dp = new boolean[len];
        
        dp[0] = true; // 시작점은 항상 점프 가능
        
        for(int i = 0; i < len; i++)
            if(dp[i])
                for(int j = 1; j <= nums[i]; j++){
                    if(i + j < len)
                        dp[i + j] = true;   
                }
        
        
        return dp[len - 1];
    }
}