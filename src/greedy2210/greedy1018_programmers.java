package greedy2210;

import java.util.Arrays;

public class greedy1018_programmers {
    public static void main(String[] args) {

        int n = 5; // 학생수
        int[] lost = {2, 4}; //
        int[] reserve = {1, 3, 5};
        int result = 0;

//        int n = 5; // 학생수
//        int[] lost = {2, 4}; //
//        int[] reserve = {3};
//
//        int n = 3; // 학생수
//        int[] lost = {3}; //
//        int[] reserve = {1};

        Arrays.sort(lost);
        Arrays.sort(reserve);
        int[] tmp = new int[n];

        for(int i = 0; i < n; i++){
            tmp[i] += 1;
        }

        for (int j = 0; j < reserve.length; j++) {
            tmp[reserve[j] - 1] += 1;
        }
        for (int i = 0; i < lost.length; i++) {
            tmp[lost[i] - 1] -= 1;
        }
/////// 정확성 60프로
//        for (int i = 0; i < n; i++) {
//
//            if(tmp[i] >= 0){
//                result++;
//                tmp[i] -= 1;
//            }else if(tmp[i] < 0){
//                if(i-1 >= 0 && tmp[i-1] == 1){
//                    result++;
//                    tmp[i-1] -= 1;
//                }else if(i+1 <= n-1 && tmp[i+1] == 1){
//                    result++;
//                    tmp[i+1] -= 1;
//                }
//            }
//
//        }
//        System.out.println(result);
        /////// 정답
        for (int i = 0; i < n; i++) {

           if(tmp[i] >= 1){
               result++;
           }else if(tmp[i] == 0){
               if(i-1 >= 0 && tmp[i-1] == 2){
                   result++;
                   tmp[i-1] -= 1;
               }else if(i+1 <= n-1 && tmp[i+1] == 2){
                   result++;
                   tmp[i+1] -= 1;
               }
           }

        }
        System.out.println(result);


        // 정답 -> 다른사람 풀이
//        int[] people = new int[n];
//        int answer = n;
//
//        for (int l : lost)
//            people[l-1]--;
//        for (int r : reserve)
//            people[r-1]++;
//
//        for (int i = 0; i < people.length; i++) {
//            if(people[i] == -1) {
//                if(i-1>=0 && people[i-1] == 1) {
//                    people[i]++;
//                    people[i-1]--;
//                }else if(i+1< people.length && people[i+1] == 1) {
//                    people[i]++;
//                    people[i+1]--;
//                }else
//                    answer--;
//            }
//        }
//        System.out.println(answer);
    }
}