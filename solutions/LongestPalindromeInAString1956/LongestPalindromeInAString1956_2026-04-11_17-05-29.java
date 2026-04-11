class Solution {
    public String getLongestPal(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int max = 0;
        String maxStr = new String();
        
        for(int gap = 0; gap < n; gap++) {
            for(int i = 0, j = gap; j < n; i++, j++) {
                
                if(gap == 0) {
                    dp[i][j] = true;
                    if(dp[i][j]) {
                        int len = j - i;
                        if(max <= len) {
                            max = len;
                            maxStr = s.substring(i, j+1);
                        }
                    }
                }
                    else if(gap == 1) {
                        dp[i][j] = s.charAt(i) == s.charAt(j);
                        if(dp[i][j]) {
                            int len = j - i;
                            if(max < len) {
                                max = len;
                                maxStr = s.substring(i, j+1);
                            }
                        }
                    }
                    else {
                        dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i+1][j-1];
                        if(dp[i][j]) {
                            int len = j - i;
                            if(max < len) {
                                max = len;
                                maxStr = s.substring(i, j+1);
                            }
                        }
                    }
            }
        }
        return maxStr;
    }
}