class Solution {
    public class Pair{
        int row,col;
        public Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
       for(int i=0;i<grid1.length;i++){
        for(int j=0;j<grid1[0].length;j++){
           if(grid1[i][j]==0 && grid2[i][j]==1){
             bfs(i,j,grid2);
           }
        }
       }
       int count=0;
       for(int i=0;i<grid1.length;i++){
        for(int j=0;j<grid1[0].length;j++){
           if(grid2[i][j]==1){
             bfs(i,j,grid2);
             count++;
           }
        }
       }
       return count;
    }
    public void bfs(int row,int col, int[][] grid){
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> p = new LinkedList<>();
        p.offer(new Pair(row,col));
        grid[row][col]=0;
        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};
        while(!p.isEmpty()){
            Pair nP=p.poll();
            for(int i=0;i<4;i++){
              int nr = nP.row + dr[i];
              int nc = nP.col + dc[i];
              if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]==1){
                  grid[nr][nc]=0;
                  p.offer(new Pair(nr,nc));
              }
            }

        }
    }
}