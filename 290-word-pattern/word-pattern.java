class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> st = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(words[i])) {
                    return false;
                }
            } else {
                if (st.contains(words[i])) {
                    return false;
                }
                map.put(ch, words[i]);
                st.add(words[i]);
            }
        }
        return true;
    }
}