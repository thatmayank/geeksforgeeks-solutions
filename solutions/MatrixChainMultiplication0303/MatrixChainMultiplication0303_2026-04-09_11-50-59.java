class Solution {
    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        Integer[][] dp = new Integer[n+1][n+1];
        return solve(arr, 1, n-1, dp);
    }
    
    private static int solve(int arr[], int i, int j, Integer[][] dp) {
        
        if(i == j) return 0;
        if(dp[i][j] != null) return dp[i][j];
        
        int min = Integer.MAX_VALUE;
        
        for(int k = i; k < j; k++) {
            
            int curr = solve(arr, i, k, dp)
                     + solve(arr, k+1, j, dp)
                     + arr[i-1] * arr[k] * arr[j];
                     
            min = Math.min(min, curr);
        }
        return dp[i][j] = min;
    }
}