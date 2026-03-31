class Solution {
    public int totalNQueens(int n) {
        List<List<String>> list = new ArrayList<>();
        char[][] ans = new char[n][n];

        for(char[] row : ans){
            Arrays.fill(row, '.');
        }

        Solution(list, ans, 0); 
        return list.size();
    }

    private void Solution(List<List<String>> list, char[][] ans, int col){
        if(col == ans.length){
            List<String> tempList = new ArrayList<>();
            for(char[] r : ans){
                tempList.add(new String(r));
            }
            list.add(new ArrayList<>(tempList));
            return;
        }

        for(int row = 0 ; row < ans.length ; row++){
            if(isSafe(ans, row, col)){
                ans[row][col] = 'Q'; // CHOOSE
                Solution(list, ans, col + 1); // EXPLORE (move to next column)
                ans[row][col] = '.'; // REMOVE
            }
        }
    }

    private boolean isSafe(char[][] ans, int row, int col){
        // same row
        for (int j = 0; j < col; j++) {
            if (ans[row][j] == 'Q') return false;
        }

        // left-up diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (ans[i][j] == 'Q') return false;
        }

        // left-down diagonal
        for (int i = row + 1, j = col - 1; i < ans.length && j >= 0; i++, j--) {
            if (ans[i][j] == 'Q') return false;
        }

        return true;
    }
}