// User function Template for Java

class Solution {
    static int palPartition(String s) {
        //1D DP solution where we anticipate i to k is already a palindrome
        int n = s.length();
        Integer[] dp = new Integer[n];
        Boolean[][] palDp = new Boolean[n][n];
        return solve(s, 0, palDp, dp);
    }
    
    private static int solve(String s, int i, Boolean[][] palDp, Integer[] dp) {
        
        if(i == s.length()) return -1; // 2. string = "a" : here k == i = 1 so we need to return -1. else if returned 0, min will return 1
        if(dp[i] != null) return dp[i];
        
        int min = Integer.MAX_VALUE;
        
        for(int k = i; k < s.length(); k++) {
            if(isPal(s, i, k, palDp)) { //means i to k is palindrome i.e. left side 0. string "a" -> isPal = true i==k = 0
                int curr = 1 + solve(s, k+1, palDp, dp); // 1. string = "a" -> then solve will send k as 1
                min = Math.min(min, curr);
            }
        }
        return dp[i] = min;
    }
    
    private static boolean isPal(String s, int i , int k, Boolean[][] palDp) {
        if(palDp[i][k] != null) return palDp[i][k];
        int start = i, end = k;
        while(i < k) {
            if(s.charAt(i) != s.charAt(k)) return palDp[start][end] = false;
            i++;
            k--;
        }
        return palDp[start][end] = true;
    } 
}