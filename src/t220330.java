import java.util.Arrays;

public class t220330 {
    public static void main(String[] args) {
        int[] people = { 2,3};
        int[] tshirts = {1,2,3};

        int answer = 0;

        Arrays.sort(people);
        Arrays.sort(tshirts);

        for (int i = 0; i < people.length; i++) {
            for (int j = 0; j < tshirts.length; j++) {
                if (people[i] <= tshirts[j]) {
                    answer++;
                    tshirts[j] = 0;
                    break;
                } else if (people[i] > tshirts[j]) {
                    continue;
                }
            }
        }
        System.out.println(answer);
    }
}
