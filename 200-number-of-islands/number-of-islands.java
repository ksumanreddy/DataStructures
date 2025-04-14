class Solution {
    public class Pair{
        int row;
        int col;
        public Pair(int row, int col){
            this.row = row;
            this.col = col;
        }
    }
    int n;
    int m;
    char[][] grid;
    public int numIslands(char[][] grid) {
       int n = grid.length;
       int m = grid[0].length;
       this.n =n;
       this.m=m;
       this.grid = grid;
       int islands=0;
       for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
            if(this.grid[i][j]=='1'){
               bfs(i,j);
               islands++;
            }
          }
       }
       return islands;
    }
    public void bfs(int row, int col){
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(row,col));
        int[] dr = {-1,0,1,0};
        int[] dc = {0,1,0,-1};
        while(!qu.isEmpty()){
            Pair p = qu.remove();
            for(int i=0;i<4;i++){
                int nr = dr[i]+p.row;
                int nc = dc[i]+p.col;
                if((nr>=0 && nr<n)&& (nc>=0 && nc<m) && grid[nr][nc]=='1'){
                    grid[nr][nc]='2';
                    qu.add(new Pair(nr,nc));
                }
            }
        }
    }
}