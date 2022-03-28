import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 가장큰수0327 {

    public static void main(String[] args) {

        // 풀이
        // 숫자 -> 문자 -> 내림차순정렬 -> 조합
        int[] numbers = {6,10,2};

       /* // 문자로 변환
        String[] strNum = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            strNum[i] = "" + numbers[i];
        }*/

        // 문자로 변환 -> java8부터는 스트림 사용할 수 있다 -> 코드 간결하게 할 수 있따
      String answer =  IntStream.of(numbers)
                .mapToObj(String :: valueOf)
                .sorted((s1,s2) -> (s2+s1).compareTo(s1+s2))
                .collect(Collectors.joining());

       /* // 내림차순 (버블소트) -> 시간 많이 잡아먹음 시간초과 뜸
        for(int i = 0; i < strNum.length -1; i++){
            for(int j = i + 1; j < strNum.length; j++){
                String s1 = strNum[i];
                String s2 = strNum[j];

                // 비교
                if((s1+s2).compareTo(s2+s1)< 0){ // (s1+s2)의 값이 (s2+s1) 값보다 적을때
                    // 자리를 바꾼다
                    strNum[i] = strNum[j];
                    strNum[j] = s1;
                }
            }
        }*/

 /*       // 내림차순
        Arrays.sort(strNum, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });*/

/*        // 내림차순 -> java8부터 사용 가능한 람다함수 사용하여 코드를 간결하게 수정
        Arrays.sort(strNum,(s1,s2) ->
                (s2+s1).compareTo(s1+s2));

        // 조합
        String answer = "";

        for(String s : strNum){
            answer += s;
        }*/

      /*  // 첫번째 값이 0이라면
        if(answer.charAt(0) == '0'){
            answer = "0" ;
        }*/

        // 첫번째 값이 0이라면 -> 위보다 권장하는 방법
        if(answer.startsWith("0")){
            answer = "0" ;
        }
        System.out.println(answer);





            // 내풀이

    /*    String[] tmp = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++ ){
            tmp[i] = String.valueOf(numbers[i]);
        }

        String[] answertmp = new String[numbers.length * numbers.length];
        for (int i = 0; i < numbers.length; i++){

            for(int j = 1; j <= numbers.length; j++ ){


            }
        }*/
    }
}
