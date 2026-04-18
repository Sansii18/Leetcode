class Solution {
    public String convert(String s, int numRows) {
        int index = 0, col = 0;
        if(numRows == 1) return s;
        if(numRows > s.length()) return s;
        StringBuilder sb = new StringBuilder();
        char[][] arr = new char[numRows][s.length()];
        while(index < s.length()){
            int row = 0;
            while (row < numRows && index < s.length()){
                arr[row][col] = s.charAt(index);
                row++;
                index++;
            }
            col++;
            if(row == numRows){
                row = numRows - 2;
                while(row > 0 && index < s.length()){
                    arr[row][col] = s.charAt(index);
                    row--;
                    index++;
                    col++;
                }
            }
        }

        for(int i = 0; i < numRows; i++){
            for(int j = 0; j <= col; j++){
                if(arr[i][j] != '\0'){
                    sb.append(arr[i][j]);
                }
            }
        }
        return sb.toString();
        // StringBuilder sb = new StrinBuilder();
        
    }
}