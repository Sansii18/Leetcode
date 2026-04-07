class Solution {
    public String intToRoman(int num) {   
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            if(num - 1000 >= 0){
                sb.append('M');
                num = num - 1000;
            }else if(num - 900 >= 0){
                sb.append('C');
                sb.append('M');
                num = num - 900;
            }

            else if(num - 500 >= 0){
                sb.append('D');
                num = num - 500;
            }else if(num - 400 >= 0){
                sb.append('C');
                sb.append('D');
                num = num - 400;
            }
            
            else if(num - 100 >= 0){
                sb.append('C');
                num = num - 100;
            }else if(num - 90 >= 0){
                sb.append('X');
                sb.append('C');
                num = num - 90;
            }
            
            else if(num - 50 >= 0){
                sb.append('L');
                num = num - 50;
            }else if(num - 40 >= 0){
                sb.append('X');
                sb.append('L');
                num = num - 40;
            }
            
            else if(num - 10 >= 0){
                sb.append('X');
                num = num - 10;
            }else if(num - 9 >= 0){
                sb.append('I');
                sb.append('X');
                num = num - 9;
            }
            
            else if(num - 5 >= 0){
                sb.append('V');
                num = num - 5;
            }else if(num - 4 >= 0){
                sb.append('I');
                sb.append('V');
                num = num - 4;
            }
            
            else if(num - 1 >= 0){
                sb.append('I');
                num = num - 1;
            }
        }
        return sb.toString();                                                  
    }
}