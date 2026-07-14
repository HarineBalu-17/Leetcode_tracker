// Last updated: 7/14/2026, 2:14:23 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        if (mat.length == 1) {
            return mat[0][0];
        }
        int j=0;
        for (int i=0; i<mat.length ; i++){
            for (; j<mat.length;){
                sum = sum + mat[i][j] + mat[i][mat.length-1-i];
                break;
            }
            ++j;
        }
        if (mat.length %2 != 0){
            sum = sum - (mat[mat.length / 2][mat.length /2]);
        }
        return sum;
    }
}