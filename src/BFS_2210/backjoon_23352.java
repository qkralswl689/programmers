package BFS_2210;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class backjoon_23352 {

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

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                int k = sc.nextInt();
                maps[i][j] = k;
            }
        }

        bfs(maps,visit);


    }

    public static void bfs(int[][] maps , int visit[][]){

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

                int cx = nx + dx[i];
                int cy = ny + dy[i];

                if(cx < 0  || cx > n || cy < 0 || cy > m){
                    continue;
                }
                    if(visit[cx][cy] == 0 && maps[cx][cy] > 0 )
                    visit[cx][cy] = visit[nx][ny] + 1;
                    q.add(new int[]{cx,cy});


            }

        }
    }
}
