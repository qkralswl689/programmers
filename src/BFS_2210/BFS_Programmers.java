package BFS_2210;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Programmers {


    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};
    public static int n,m;
    public static int answer = 1;
    public static boolean[][] visit ;
    public static int[][] maps;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        visit = new boolean[n][m];
        maps = new int[n][m];
         //maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};

         for(int i = 0; i < n; i++){
             for (int j = 0; j < m; j++){
                 int k = sc.nextInt();
                 maps[i][j] = k;
             }
         }

       bfs(0,0);
        System.out.println(answer);

    }

    public static void bfs(int x, int y){
        Queue<Integer> q = new LinkedList<>();
        int nx = 0;
        int ny = 0;
        q.add(maps[x][y]);
        visit[x][y] = true;

        while (!q.isEmpty()){

            int k = q.poll();

            for(int i = 0; i < 4; i ++){
                nx = x + dx[i];
                ny = y + dy[i];

                if(nx <= -1 || nx >= n || ny <= -1 || ny >= m){
                    continue;
                }else{
                    if(maps[nx][ny] == 1 && visit[nx][ny] == false){
                        answer++;
                        visit[nx][ny] = true;
                        bfs(nx,ny);
                        break;
                    }else {

                    }

                }
            }
        }


    }
}
