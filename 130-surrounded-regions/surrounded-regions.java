class Solution {
    public class Pair{
        int row;
        int col;
        public Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        char[][] tempBoard = new char[n+2][m+2];
        int tn =  tempBoard.length;
        int tm = tempBoard[0].length;
        for(int i=0;i<tn;i++){
            for(int j=0;j<tm;j++){
                if(i==0 || j==0 || i== tn-1|| j== tm-1){
                    tempBoard[i][j]='O';
                }else{
                    tempBoard[i][j]=board[i-1][j-1];
                } 
            }
        }
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(0,0));
        while(!qu.isEmpty()){
           Pair p = qu.remove();
           int[] dr = {-1,0,1,0};
           int[] dc = {0,1,0,-1};
           for(int i=0;i<4;i++){
              int nr = p.row+dr[i];
              int nc = p.col+dc[i];
              if((nr>=0 && nr<tn) && (nc>=0 && nc<tm) && tempBoard[nr][nc]=='O'){
                 tempBoard[nr][nc]='V';
                 qu.add(new Pair(nr,nc));
               }
           }
        }
        for(int i=1;i<tn-2;i++){
            for(int j=1;j<tm-2;j++){
                if(tempBoard[i][j]=='O'){
                   board[i-1][j-1]='X';
                }
            }
        }
    }
}