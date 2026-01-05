class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int dp[]= new int[n+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<n+1;i++){
            int A=nums[i-1] + dp[i-2];
            int B=dp[i-1];
            dp[i] = Math.max(A,B);
        }
        return dp[n];
    }
}