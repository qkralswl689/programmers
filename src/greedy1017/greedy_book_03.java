package greedy1017;

import java.util.Arrays;
import java.util.Scanner;

public class greedy_book_03 {
    public static void main(String[] args) {
//        int n = 3;
//        int m = 3;
//        int[][] number = {
//                            {3,1,2},
//                            {4,1,4},
//                            {2,2,2}
//        } ;

//        int n = 2;
//        int m = 4;
//        int[][] number = {
//                {7,3,1,8},
//                {3,3,3,4}
//        } ;
//        int result = 0;
//        for(int i = 0; i < n; i++){
//            int[] tmp = new int[m];
//            for(int j = 0; j < m; j++){
//                tmp[j] = number[i][j];
//            }
//            Arrays.sort(tmp);
//            if(i > 1){
//                if(result < tmp[0]){
//                    result = tmp[0];
//                }
//            }else{
//                result = tmp[0];
//            }
//
//        }
//        System.out.println(result);

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        for(int i = 0; i < n; i ++){
            int[] tmp = new int[m];
            for(int j = 0; j < m; j ++){
                tmp[j] = sc.nextInt();
            }
            Arrays.sort(tmp);
            if(result < tmp[0]){
                result = tmp[0];
            }
        }

        System.out.println(result);

    }
}
