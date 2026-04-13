class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        // if(strs.length == 0){
        //     list.add(new ArrayList<>(ans));
        // }

        HashMap <String, List<String>> map = new HashMap<>();
        for(String val : strs){
            String s = sort(val);
            map.computeIfAbsent(s, k-> new ArrayList<>()).add(val);
        }

        list.addAll(map.values());
        return list;
    }

    private String sort(String str){
        char[] chars = str.toCharArray();
        Arrays.sort(chars);          
        return new String(chars);
    }
}