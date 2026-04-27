class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int l = 0;
        int r = 0;
        HashMap <Character , Integer> map = new HashMap<>();
        while(r < s.length()){
            char ch = s.charAt(r);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while (map.get(ch) > 1) {
                char leftChar = s.charAt(l);
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }
        return maxLength;
    }
}