class Solution {
    public boolean isToeplitz(int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(i+1 < r && j+1 < c && mat[i][j] != mat[i+1][j+1]) return false;
            }
        }
         
        return true;
    }
}