class Solution {
    public int missingNumber(int[] nums) {
        ///xor approach
        int xor = nums.length;
        for(int i = 0;i<nums.length;i++){
            xor ^=i^nums[i];
        }
        return xor;
        
    }
}
