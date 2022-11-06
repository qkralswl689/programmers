package sort;

import java.util.Arrays;

public class sort_programmers {
    public static void main(String[] args) {
        int[]array = {1,5,2,6,3,7,4};
        int[][]commands = {{2,5,3},{4,4,1},{1,7,3}};

        int[] ss = solution(array,commands);

        for(int i = 0; i < ss.length ; i++){
            System.out.println(ss[i]);
        }
    }
    static public int[] solution( int[] array, int[][] commands){
        int[] answer = {};
        answer = new int[commands.length];

        for(int i = 0; i < commands.length; i++){

            for(int j = 0; j < array.length; j++){

                int k = commands[i][0];
                int q = commands[i][1];
                int o = commands[i][2];
                int[] ar = new int[q-k+1];
                int x = 0;
                for(int p = k; p <= q; p++){

                    ar[x] = array[p-1];
                    x++;

                }
                Arrays.sort(ar);
                answer[i] = ar[o-1];
                break;

            }
        }


        return answer;
    }
}
