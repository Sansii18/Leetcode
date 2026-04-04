class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == divisor) return 1;
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        if(divisor == 1) return dividend;
        if(dividend == -1) return -dividend;
        int sign = 1;
        if(dividend>0 && divisor<0) sign = -1;
        if(dividend<0 && divisor>0) sign = -1;
        long n = Math.abs((long)dividend);
        long d = Math.abs((long)divisor);
        int ans = 0;
        while(n >= d){
            int cnt = 0;
            while(n >= (d << (cnt+1))){
                cnt++;
            }
            ans += (1 << cnt);
            n = n - (d<<cnt);
        }
        if(ans >= Math.pow(2,31) && sign == 1) {
            return Integer.MAX_VALUE;
        }
        if(ans >= Math.pow(2,31) && sign == -1) {
            return Integer.MIN_VALUE;
        }
        return sign * ans;
    }
}