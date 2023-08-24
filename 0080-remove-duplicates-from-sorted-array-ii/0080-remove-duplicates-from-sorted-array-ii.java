class Solution {
    public int removeDuplicates(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        
        int k = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[k-1] != nums[i]){
                nums[k++] = nums[i];
                count = 1;    
            }
            else if(count < 2){
                nums[k++] = nums[i];
                count++;
            }
        }
        return k;
    }
}