import java.util.Arrays;

public class 예산0324 {
    public static void main(String[] args) {

        // 부서별 신청한 금액
        int[] d = {2,2,3,3};

        // 예산
        int budget = 10;

        // 답
        int answer = 0;

        // 오름차순 정렬
        Arrays.sort(d);

      /*  for(int num : d){
            System.out.println(num);
        }*/

        for (int i = 0; i < d.length; i++){

            // 예산이 부서의 신청금액보다 크거나 같으면
            if(budget >= d[i]){
                // 예산에서 해당부서의 신청금액을 빼고
                budget -= d[i];

                // 횟수카운트
                answer++;

            }else{ // 예산이 부서의 신청금액보다 작을땐
                // 멈춘다
                break;
            }

        }

        System.out.println(answer);
    }
}
