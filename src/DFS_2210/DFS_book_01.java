package DFS_2210;

import java.util.ArrayList;

public class DFS_book_01 {

    public static boolean[] visited = new boolean[9];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {


//        int[][] graph = {{2,3,8},
//                        {1,7},
//                        {1,4,5},
//                        {3,5,},
//                        {3,4},
//                        {7},
//                        {2,6,8},
//                        {1,7}};

        for(int i = 0; i < 9; i++){
            graph.add(new ArrayList<Integer>());
        }

        // 노드 1에 연결된 노드 정보 저장
        graph.get(1).add(2);
        graph.get(1).add(3);
        graph.get(1).add(8);

        // 노드 2에 연결된 노드 정보 저장
        graph.get(2).add(1);
        graph.get(2).add(7);

        graph.get(3).add(1);
        graph.get(3).add(4);
        graph.get(3).add(5);

        graph.get(4).add(3);
        graph.get(4).add(5);

        graph.get(5).add(3);
        graph.get(5).add(4);

        graph.get(6).add(7);

        graph.get(7).add(2);
        graph.get(7).add(6);
        graph.get(7).add(8);

        graph.get(8).add(1);
        graph.get(8).add(7);

        dfs(1);

    }
    public static void dfs(int i){
        visited[i] = true;
        System.out.print(i + " ");
        for(int k = 0; k < graph.get(i).size(); k++){
            int y = graph.get(i).get(k);
            if(!visited[y]){
                dfs(y);
            }
        }
    }
}
