package DFS_2210;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS_book_02 {
    public static ArrayList<ArrayList<Integer>> ice = new ArrayList<ArrayList<Integer>>();
   // public static int[][] dxy = {{0,1},{1,0},{0,-1},{-1,0}};
    public static int[] dx = {0,1,0,-1};
    public static int[] dy = {1,0,-1,0};

    public static int n,m ;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         n = sc.nextInt();
         m = sc.nextInt();
        sc.nextLine(); // 버퍼 지우기

        for(int i = 0; i < n; i++){
            ice.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < n; i++){

            for (int j = 0; j < m; j++){
                int k = sc.nextInt();
                ice.get(i).add(k);
            }
        }


        int result = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if(dfs(i,j)){
                    result += 1;
                }
            }
        }
        System.out.println(result);

    }

    public static boolean dfs(int x,int y){

        if(x <= -1 || x >= n || y <= -1 || y >= m){

            return false;
        }

        if(ice.get(x).get(y) == 0){
            ice.get(x).set(y,1);
            dfs(x -1, y);
            dfs(x ,y -1);
            dfs(x  +1, y);
            dfs(x , y + 1);

            return true;

        }
        return false;
    }
}
