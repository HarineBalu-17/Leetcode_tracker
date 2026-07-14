// Last updated: 7/14/2026, 2:14:26 PM
class Solution {
    public int fib(int n) {
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<=n;i++){
            a=b;
            b=c;
            c=a+b;
        }
        return c;
        
    }
}