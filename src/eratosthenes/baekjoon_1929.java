package eratosthenes;

import java.util.Scanner;

public class baekjoon_1929 {
    public static int n, m;
    public static boolean[] num ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        num = new boolean[m + 1];

        num[0] = true;
        num[1] = true;
        //Math.sqrt() 제곱근 구하는 함수
        // 제곱근 : 어떤수 X를 제곱하여 X가 되는 수
        for(int i = n; i <=m; i++){
            int result = 0;
            int x = (int)Math.sqrt(i);

            if( i == 1){
                result++;
            }

            for(int j = 2; j <= x; j++){
                if(i % j == 0){
                    result++;
                    break;
                }
            }

            if(result == 0){
                System.out.println(i);
            }
        }

    }
        // 시간초과 (동빈나)
//        for(int i = 0; i <= m ; i++ ){
//            num[i] = i ;
//        }
//
//
//        for(int i = n; i <= m; i++){
//            era(i);
//            if(num[i] != 0){
//                System.out.println(num[i]);
//            }
//        }
//    }
//
//    public static void era(int number){
//
//        for(int i = 2; i < number; i++){
//            if(num[i-1] == 0){
//                continue;
//            }else{
//                for(int j = i + i ; j <= number; j+= i){
//                    num[j] = 0;
//                }
//            }
//        }
//
//    }
    // 시간초과
//    public static int n, m;
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        n = sc.nextInt();
//        m = sc.nextInt();
//
//        for (int i = n; i < m; i++) {
//
//            if (era(i) == true) {
//                System.out.println(i);
//            }
//
//        }
//
//    }
//
//    public static boolean era(int number){
//
//        if(number < 2){
//            return false;
//        }
//
//        for(int i = 2; i < number; i++){
//            if(number % i == 0){
//                return false;
//            }
//        }
//        return true;
//    }



}
