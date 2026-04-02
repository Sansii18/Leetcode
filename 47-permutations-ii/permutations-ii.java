class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        int[] flag = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            flag[i] = 0;
        }
        Solution(st, new ArrayList<>(), nums,0,flag);
        for(List <Integer> lt : st){
            list.add(lt);
        }
        return list;
    }

    private void Solution(Set<List<Integer>> st, List<Integer> answer, int[] arr, int index,int[] flag){
        if(answer.size() == arr.length){
            st.add(new ArrayList<>(answer));
            return;
        }
        if(index == arr.length) return;
        for(int i=0 ; i<arr.length ; i++){
            if(flag[i] == 0){
                answer.add(arr[i]);
                flag[i] = 1;
                Solution(st,answer,arr,index+1,flag);
                answer.remove(answer.size()-1);
                flag[i] = 0;
            }
        }
    }
}