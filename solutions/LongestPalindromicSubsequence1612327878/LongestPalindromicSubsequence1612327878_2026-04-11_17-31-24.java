class Solution {
    public int longestPalinSubseq(String s) {
        int n = s.length();
        Integer[][] dp = new Integer[n][n];
        return solve(s, 0, n-1, dp);
    }
    
    private int solve(String s, int i, int j, Integer[][] dp) {
        
        if(i == j) return 1;
        if(dp[i][j] != null) return dp[i][j];
        
        if(s.charAt(i) == s.charAt(j)) {
            return dp[i][j] = 2 + solve(s, i+1, j-1, dp);
        } else {
            return dp[i][j] = Math.max(solve(s, i+1, j, dp), solve(s, i, j-1, dp));
        }
    }
}