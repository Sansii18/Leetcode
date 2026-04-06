class Solution {
    public boolean isHappy(int n) {
        if(n == 1) return true;
        // 4 → 16 → 37 → 58 → 89 → 145 → 42 → 20 → 4 => Not happy => USE HASHSET
        Set <Integer> st = new HashSet<>();
        while(!(st.contains(n))){
            int sum = 0;
            st.add(n);
            while(n != 0){
                int digit = n % 10;
                sum = sum + (digit * digit);
                n = n/10;
            }
            if(sum == 1) return true;
            n = sum;
        }
        return false;
    }
}