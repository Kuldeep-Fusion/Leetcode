class Solution {
    public int minFallingPathSum(int[][] grid) {
        int ans = Integer.MAX_VALUE;
        Integer [][] dp = new Integer[grid.length][grid[0].length];
        for(int i =0; i<grid[0].length; i++){
            ans = Math.min(ans, Falling_Path(grid, 0,i, dp));
        }

        return ans;
        
    }

    public static int Falling_Path(int[][] matrix, int cr , int cc, Integer[][] dp){
        if(cr == matrix.length-1) return matrix[cr][cc];
        if(dp[cr][cc] != null) return dp[cr][cc];

        int ans = Integer.MAX_VALUE;
        for(int col =0; col< matrix[0].length; col++){
            if(col != cc ){
                ans = Math.min(ans, Falling_Path(matrix, cr +1, col, dp));
            }
        }
        return dp[cr][cc] = ans + matrix[cr][cc];
    }
}