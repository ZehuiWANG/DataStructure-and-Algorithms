//Valid Sudoku

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        //check the row
        for(int i=0;i<9;i++){
            Set<Character> set=new HashSet<Character>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'&&set.contains(board[i][j])){
                    return false;
                }else{
                    set.add(board[i][j]);
                }
            }
        }
        //check the col
         for(int j=0;j<9;j++){
            Set<Character> set=new HashSet<Character>();
            for(int i=0;i<9;i++){
                if(board[i][j]!='.'&&set.contains(board[i][j])){
                    return false;
                }else{
                    set.add(board[i][j]);
                }
            }
        }
        //check the subbox
         for(int i=0;i<9;i=i+3){
            for(int j=0;j<9;j=j+3){
                Set<Character> set=new HashSet<Character>();
                for(int a=i;a<i+3;a++){
                    for(int b=j;b<j+3;b++){
                        
                    if(board[a][b]!='.'&&set.contains(board[a][b])){
                    return false;
                    }else{
                    set.add(board[a][b]);
                    }
                    
                    }
                }
            }
        }
        return true;
    }
}