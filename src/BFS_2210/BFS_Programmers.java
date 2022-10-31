package BFS_2210;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Programmers {


    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};
    public static int n,m;
    public static int[][] visit ;
    public static int[][] maps;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        visit = new  int[n][m];
        maps = new int[n][m];
         //maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};

         for(int i = 0; i < n; i++){
             for (int j = 0; j < m; j++){
                 int k = sc.nextInt();
                 maps[i][j] = k;
             }
         }

       bfs(maps,visit);

         int answer = visit[n -1][m-1];

         if(answer == 0){
             answer = -1;
         }
        System.out.println(answer);

    }

    public static void bfs(int[][]maps , int[][]visit){

        int x = 0;
        int y = 0;
        visit[x][y] = 1;

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{x,y});


        while (!q.isEmpty()){
            int[] cu = q.poll();
            int nx = cu[0];
            int ny = cu[1];

            for(int i = 0; i < 4; i ++){
                int tx = nx + dx[i];
                int ty = ny + dy[i];

                if(tx <= -1 || tx >= n || ty <= -1 || ty >= m) {
                    continue;
                }
                if (maps[tx][ty] == 1 && visit[tx][ty] == 0) {
                    visit[tx][ty] = visit[nx][ny] + 1;
                    q.add(new int[]{tx,ty});
                }
            }
        }


    }
}
