// Last updated: 7/14/2026, 2:14:29 PM
class Solution {
    public int[][] transpose(int[][] A) {
        int T[][]=new int[A[0].length][A.length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                T[j][i]=A[i][j];
            }
        }
        return T;
    }
}