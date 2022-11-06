package sort;

import java.util.ArrayList;

public class sort_programmers_2 {

    public static void main(String[] args) {
        int[] numbers = {6,10,2};

        System.out.println(solution(numbers));
    }

    public static String solution(int[] numbers){
        String answer = "";
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++){

            for(int j = 0; j < numbers.length; j++){

                int q = numbers[i] + numbers[j] + numbers[j+1];
                tmp.add(q);


            }
        }

        return answer;
    }
}
