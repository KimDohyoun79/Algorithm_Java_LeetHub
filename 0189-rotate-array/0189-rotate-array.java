class Solution {
    public void rotate(int[] nums, int k) {
            
        int len = nums.length;
        if( k > len )
            k =  k % len; 

        // 이동해야 하는 앞부분 숫자 복사
        int[] tmp = Arrays.copyOf(nums, len - k);

        // 이동해야 하는 뒷부분 숫자 앞으로 옮기기 
        for(int i = 0; i < k; i++){
            nums[i] = nums[len - k + i];
        }

        // 복사한 앞부분 숫자를 붙여주기
        for(int i = k; i < len; i++){
            nums[i] = tmp[i-k];
        }
    }
}