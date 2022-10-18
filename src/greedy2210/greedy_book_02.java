package greedy2210;

import java.util.Arrays;
import java.util.Collections;

public class greedy_book_02 {
    public static void main(String[] args) {

        int n = 5;
        int m = 8;
        int k = 3;

        int result = 0;
        Integer[] array = {2,4,5,4,6};
        Arrays.sort(array, Collections.reverseOrder());

        for (int i = 0; i < m; i ++){

            for(int j = 0; j < k; j++){

                result += array[0];
                i++;
            }
            result += array[1];

        }

        //// 책 답

        Arrays.sort(array);
        int first = array[n-1]; // 첫번째로 큰 수
        int second = array[n-2]; // 두번째로 큰 수

        // 가장 큰 수가 더해지는 횟수 계산
        int cnt = (m / (k+1)) * k;
        cnt += m % (k+1);

        int answer = 0;
        answer += cnt * first; // 가장 큰 수 더하기
        answer += (m-cnt) + second; //두번째로 큰 수 더하기

    }
}
