package DFS_2210;

import java.util.Scanner;

public class DFS_book_02_2 {

    public static int[][] ice;
    public static int n , m;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        ice = new int[n][m];

        for(int i = 0; i < n; i ++){
             for(int j = 0; j < m; j++){
                 int x = sc.nextInt();
                 ice[i][j] = x;
             }
        }

        int result = 0;

        for(int i = 0; i < n; i ++){
            for(int j = 0; j < m; j++){
                if(def(i,j)){
                    result++;
                }
            }
        }

        System.out.println(result);
    }

    public static boolean def(int x , int y){


        if(x <= -1 || x >= n || y <= -1 || y >= m){
            return false;
        }

        if(ice[x][y] == 0){
            ice[x][y] = 1;

            // 상하 좌우
            def(x-1,y);
            def(x,y+1);
            def(x+1,y);
            def(x,y-1);


            return true;
        }

        return false;
    }
}
