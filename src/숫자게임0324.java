import java.util.Arrays;
import java.util.Collections;

public class 숫자게임0324 {
    public static void main(String[] args) {

        int[] A = {5,1,3,7};

        int[] B = {2,2,6,8};

        int answer = 0;

        // 강사 풀이

        // B정렬
        Arrays.sort(B);

        //A 장랼
        Arrays.sort(A);

       /* // B팀의 숫자가 작은순서로 시작한다 -> 효율성 통과못함(2중루프)
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                if(A[i] < B[j]){ // B가 A보다 큰경우
                    answer++; // 승점을 올려주고
                    B[j] = 0; // B의 값은 더이상 사용하지 않도록 0을 대입해준다
                    break;
                }
            }
        }*/

        int index = B.length -1 ;

        for(int i = A.length -1; i >= 0; i--){
            if(A[i] < B[index]){ // 서로 큰값을 비교하고, A가 이기는 경우를 체크
                index--;
                answer++;
            }
        }

        System.out.println(answer);



/*
       // 정확성 76.2/ 효율성 14.3
        int[] A = {5,1,3,7};

        int[] B = {2,2,6,8};

        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);
        for(int i = 0; i < A.length; i++){
            if(B[i] >= A[answer]){
                answer++;
            }else {
                continue;
            }
        }

        System.out.println(answer);*/
       /* // 정확성 23.8/ 효율성 0 -> 시간초과
        int[] A = {5,1,3,7};

        int[] B = {2,2,6,8};

        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = A.length -1; i >= 0; i--){
            if(A[i] < B[i]){
                answer++;

            }
        }


        System.out.println(answer);*/





        // 정확성 23.8/ 효율성 0 -> 시간초과
       /* int[] A = {5,1,3,7};

        int[] B = {2,2,6,8};

        int answer = 0;

        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                if(A[i] < B[j] && B[j] != 0){
                    B[j] = 0;
                    answer++;
                    break;
                }
            }
        }

        System.out.println(answer);*/
    }
}
