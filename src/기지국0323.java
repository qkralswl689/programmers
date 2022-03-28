import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기지국0323 {
    public static void main(String[] args) {

        // 강사 풀이

        // 아파트의 개수
        int n = 11;

        // 기지국이 설치된 아파트의 번호
        int[] stations = {4, 11};

        // 전파의 도달거리
        int w = 1;

        int answer = 0;

        int si = 0; // 스테이션의 인덱스를 사용한다

     /*   // Queue 사용시 효율성 떨어짐
        Queue<Integer> sq = new LinkedList<>();
        for(int s : stations) sq.offer(s);*/

        int position = 1; //

        while (position <=n){ //아파트 전체 돌때까찌

            // 인덱스가 끝까지 가지 않아있을때
            if( si < stations.length && stations[si] - w <= position){

                position = stations[si] + w + 1; //인덱스 번째의 값을 꺼내오고
                si ++; // 인덱스 증가
            }else {// 그렇지 않다면

                answer += 1; // 기지국 설치
                position += w + 1 + w; // 최대 전파범위(왼) + 현재위치 + 최대 전파범위(오)
                // -> 전체 전파범위 == w * 2 + 1

            }

        }

        // queue 사용시
      /*  while (position <=n){ //아파트 전체 돌때까찌

            // Queue 가 비어있지 않은것 체크
           if( !sq.isEmpty() && sq.peek() - w <= position){ // 현재 있는곳이 기지국이 있는곳의 왼쪽끝 전파범위  보다 현재위치가 오른쪽이라면 기지국의 전파범위 안에 있는것이면

               position = sq.poll() + w + 1; // 위치는 기지국의 전파범위 오른쪽 끝의 다음위치로 간다

           }else {// 그렇지 않다면

               answer += 1; // 기지국 설치
               position += w + 1 + w; // 최대 전파범위(왼) + 현재위치 + 최대 전파범위(오)
               // -> 전체 전파범위 == w * 2 + 1

           }

        }
*/


/*
        // 내풀이
        // 아파트의 개수
        int n = 11;

        // 기지국이 설치된 아파트의 번호
        int[] stations = {4, 11};

        // 전파의 도달거리
        int w = 1;

        // 답
        int answer = 0;
*/

    /*    for (int i = 1; i <= n; i++) {

            for (int j = 0; i < stations.length; j++) {



            }

        }
        */
        for (int i = 0; i < stations.length; i++) {
            int tmp = stations[i] - w;
            int tmp2 = stations[i] + w;
            for (int j = 1; j <= n; j++) {

            }
        }

        System.out.println(answer);

      /* for (int i = 0; i < stations.length; i++){

           for (int j = 0; j < n; j++){
               if(j < stations[i]-1){
                   int tmp = stations[i]-1;
                   while (j < tmp){
                       j++;
                       answer++;
                       continue;
                   }

               }
           }
       }*/



/*
        // 나랑 비슷하게 푼 사람 코드
        int answer = 0;

        boolean[] apts = new boolean[n+1];
        ArrayList<Integer> noSgn = new ArrayList<>();
        apts[0] = true;
        // 전파 터지는 아파트 표시
        for (int i = 0; i < stations.length; i++) {
            for (int j = stations[i] - w; j <= stations[i] + w; j++) {
                try {
                    apts[j] = true;
                }
                catch (Exception e) {
                    continue;
                }
            }
        }

        // 안 터지는 아파트 구역별 구분
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (!apts[i]) {
                sum += 1;
                // System.out.println(i);
            }
            else if (apts[i] && sum != 0) {
                noSgn.add(sum);
                sum = 0;
            }
            if (i == n && sum != 0) noSgn.add(sum);
        }

        // 답 도출
        for (int i = 0; i < noSgn.size(); i++) {
            answer += (noSgn.get(i) / (w * 2 + 1));
            answer += noSgn.get(i) % (w * 2 + 1) == 0 ? 0 : 1;
        }
        // System.out.println(noSgn.get(i));


        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println("Hello Java");

        return answer;

*/

    /*

        int location = 1; // 기지국을 설치할 현재 위치

        int idx = 0; // 설치된 기지국 인덱스

        while (location <= n){ // 위치가 현재 갯수보다 작거나 같을 때까지

            // 설치된 기지국 범위 안에 있고, 현재 위치가 설치된 기지국의 범위보다 클 때
            if(idx < stations.length && location >= stations[idx] - w){

                location = stations[idx] + w + 1; // 설치된 기지국의 범위보다 +1 큰 위치로 이동
                idx++; // 다음 인덱스로 이동
            }else { // 설치된 기지국 범위 밖일 때
                location += 2 * w + 1; // 양쪽으로 범위를 가질 최댓값 +1을 해준다
                answer++; // 기지국을 설치했으므로 결과값 추가
            }
        }

        System.out.println(answer);*/

  /*      int[] tmp = new int[n];

        for(int i = 0; i < tmp.length; i++){
            tmp[i] = i+1;
        }

        // 전파가능한곳 0 으로 표시
        for(int i = 0; i < stations.length; i++){
            for(int j = 0; j < tmp.length; j++){
                if(stations[i] == tmp[j]){

                    if(tmp[j] == 1 ){
                        tmp[j+w] = 0;
                        break;
                    }else if(tmp[j] == n) {
                        tmp[j-w] = 0;
                        tmp[j] = 0;
                        break;
                    }else {
                        tmp[j+w] = 0;
                        tmp[j-w] = 0;
                    }
                    tmp[j] = 0;
                }
            }
        }

        // 전파하지 않은곳 담기
        ArrayList<Integer> tmp2 = new ArrayList<>();

        for(int i = 0; i < tmp.length; i++){
            if(tmp[i] != 0){
                tmp2.add(tmp[i]);
            }
        }

        for(int i = 0; i < tmp2.size(); i++){
            int k = (tmp2.size() / 2)-1;
            int q = tmp2.get(k);

            if(tmp2.get(k) == q-1){
                answer++;
                break;
            }else if(tmp2.get(k-1) != tmp2.get(k-1) -1){
                int p = tmp2.get(k-1);
                if(tmp2.get(0) == p-1){
                    answer++;
                    break;
                }
            }

            break;

        }

        System.out.println( "answer : " + answer);

        for(int num : tmp2){
            System.out.println(num);
        }*/


    }
}
