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
        Queue<Pair> qu = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               if((i==0 || j==0 || i==n-1||j==m-1)&& (board[i][j]=='O')){
                  qu.add(new Pair(i,j));
                  board[i][j]='V';
               }
            }
        }
        while(!qu.isEmpty()){
           Pair p = qu.remove();
           int[] dr = {-1,0,1,0};
           int[] dc = {0,1,0,-1};
           for(int i=0;i<4;i++){
              int nr = p.row+dr[i];
              int nc = p.col+dc[i];
              if((nr>=0 && nr<n) && (nc>=0 && nc<m) && board[nr][nc]=='O'){
                 board[nr][nc]='V';
                 qu.add(new Pair(nr,nc));
               }
           }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O'){
                   board[i][j]='X';
                }
                if(board[i][j]=='V'){
                   board[i][j]='O';
                }
            }
        }
    }
}