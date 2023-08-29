class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int start = 0;
        int end = numbers.length - 1;
        int[] re = new int[2];
        while(start < end){
            int hap = numbers[start] + numbers[end]; 
            if(hap == target){
                re[0] = start +1;
                re[1] = end +1;
                break;
            }
                
            else if (hap > target)
                end--;
            else
                start++;
        }
        return re;
    }
}