import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int index = 0;
        for(int i = m; i < nums1.length; i++){
            if(index == n)
                break;
            nums1[i] = nums2[index++];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}