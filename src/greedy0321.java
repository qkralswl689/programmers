import java.util.Arrays;

public class greedy0321 {

    public static void main(String[] args) {

        int n = 5;
        int[] lost = {2, 4};
        int[] reserve = {1, 3, 5};

        Arrays.sort(lost);
        Arrays.sort(reserve);

/*        int answer = solution(n, lost, reserve);

        System.out.println(answer);*/

        // 학생수 만큼 의 배열생성
        int[] tmp = new int[n];

        // 학생번호 삽입
        for (int i = 0; i < n; i++) {
            tmp[i] = i + 1;
        }
        // 여분의체육복을 가지고있는 학생확인
        for(int i = 0; i < tmp.length; i++){
            for(int j = 0; j < reserve.length; j++){
                if(tmp[i] == reserve[j]){
                    tmp[i] = 1;
                }
            }
        }

        // 체육복이 없는 학생을 확인한다
        for(int i = 0; i < tmp.length; i++){
            for(int j = 0; j < lost.length; j++){
                if(tmp[i] == lost[j]){
                    tmp[i] = -1;
                }
            }
        }

        for (int num : tmp) {
            System.out.println(num);
        }


        for(int i = 0; i < tmp.length; i++){
            
        }




    }


    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        int[] tmp = new int[n];

        for(int i = 0; i < n; i++){
            tmp[0] = i+1;
        }
        return answer;
    }

}
