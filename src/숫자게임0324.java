import java.util.Arrays;
import java.util.Collections;

public class 숫자게임0324 {
    public static void main(String[] args) {


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

        System.out.println(answer);
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
