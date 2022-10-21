package BFS_2210;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Node {

    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
public class BFS_book_02 {

    public static int n,m,result;
    public static int[][] miro;
    public static int[][] di = {{-1,0},{0,-1},{1,0},{0,1}};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        miro = new int[n][m];

        for(int i = 0; i < n;i++){

            for(int j = 0; j < m; j++){
                int x = sc.nextInt();
                miro[i][j] = x;
            }
        }
        // BFS를 수행한 결과 출력
        System.out.println(bfs(0, 0));
    }

    public static int bfs(int x,int y){

        Queue<Node>  q = new LinkedList<>();

        q.add(new Node(x,y));

        while (!q.isEmpty()){

             Node node = q.poll();

             x = node.getX();
             y = node.getY();

             // 현재 위치에서 4가지 방향으로의 위치 확인
             for(int i = 0; i < di.length; i++){
                  int  nx = x + di[i][0];
                  int  ny = y + di[i][1];

                 // 미로 찾기 공간을 벗어난 경우 무시
                 if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;

                 // 벽인 경우 무시
                 if(miro[nx][ny] == 0) continue;

                 // 해당 노드를 처음 방문하는 경우에만 최단 거리 기록
                 if(miro[nx][ny] == 1){
                     miro[nx][ny] = miro[x][y] + 1;
                     q.add(new Node(nx,ny));
                 }

             }


        }

        // 가장 오른쪽 아래까지의 최단 거리 반환
        return miro[n -1][m -1];
    }

}
