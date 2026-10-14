class Solution {
    public int climbStairs(int n) {
        //step 1
        int[] dp= new int[n+1];
        java.util.Arrays.fill(dp,-1);
    
        int ans = solve(n,0,dp);
        return ans;

        
    }
    private int solve(int n,int idx,int[] dp){
        //base case
        if(idx == n){
            return 1;
        }
        if(idx > n)return 0;
        if(dp[idx] != -1)return dp[idx];

        dp[idx] = (solve(n,idx+1,dp)+solve(n,idx+2,dp));
        return dp[idx];

    }
}
