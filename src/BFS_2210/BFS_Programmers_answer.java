package BFS_2210;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Programmers_answer {
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};
    public static int n,m;
    public static int answer = 0;
    public static int[][] visit ;
    public static int[][] maps;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        visit = new int[n][m];
        maps = new int[n][m];

        for(int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                int k = sc.nextInt();
                maps[i][j] = k;
            }
        }

        bfs(maps, visit);
        answer = visit[maps.length-1][maps[0].length-1];

        if(answer == 0){
            answer = -1;
        }

        System.out.println(answer);
    }
    public static void bfs(int[][] maps, int[][] visited) {
        int x = 0;
        int y = 0;
        visited[x][y] = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});

        while (!queue.isEmpty()) {
            int[] current = queue.remove();
            int cX = current[0];
            int cY = current[1];

            for (int i = 0; i < 4; i++) {
                int nX = cX + dx[i];
                int nY = cY + dy[i];

                if (nX < 0 || nX > maps.length - 1 || nY < 0 || nY > maps[0].length - 1)
                    continue;

                if (visited[nX][nY] == 0 && maps[nX][nY] == 1) {
                    visited[nX][nY] = visited[cX][cY] + 1;
                    queue.add(new int[]{nX, nY});
                }
            }

        }
    }
}
