class Solution {
    public int[] productExceptSelf(int[] nums) {
        ///prefix and suffix product 
        int n =nums.length;
        int[] result = new int[n];
        int[] ans = new int[n];
        result[0] = 1;
        for(int i  = 1; i < n;i++ ){
            result[i] = result[i-1]*nums[i-1];
        }
        int[] suffix = new int[n+1];
        suffix[n] =1;
        for(int i = n-1; i >= 0;i--){
            suffix[i] = suffix[i+1]*nums[i];
        }
        for(int i = 0; i <n;i++){
            ans[i] = result[i]*suffix[i+1];
        }
        return ans;
        
    }
}  
