class Solution {
    public int minBitFlips(int start, int goal) {
        int cnt = 0;
        int ans = start ^ goal;
        // while(ans != 0){
        //     ans = ans & ans-1;
        //     cnt++;
        // }
        // return cnt;
        if(ans == 1) return 1;
        while(ans > 1){
            cnt += ans & 1;
            ans = ans >> 1;

            if(ans == 1) cnt++;
        }
        return cnt;
    }
}