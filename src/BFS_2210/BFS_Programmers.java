package BFS_2210;

public class BFS_Programmers {

    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int answer = 0;
        

        for(int i = 0; i < maps.length; i++){
            for(int j = 0; j < maps[i].length; j ++){

                if(maps[i][j] == 1){
                    answer++;

                }
            }
        }


    }
}
