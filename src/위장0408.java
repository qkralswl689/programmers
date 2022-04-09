import java.util.HashMap;
import java.util.Map;

public class 위장0408 {
    public static void main(String[] args) {

        String[][] clothes = {{"yellowhat","headgear"},{"bulesunglass","eyewear"},{"green_turban","geadgear"}};

        Map<String, Integer> hm = new HashMap<>();
        for (int i=0; i<clothes.length; i++) {
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 1) + 1);
        }

        int ans = 1;
        for (Integer value : hm.values()) {
            ans *= value;
        }

        System.out.println(ans-1);
/*

        HashMap<Integer,String> tmp = new HashMap<>();


        for(int i = 0; i < clothes.length; i++){
          tmp.put(i,clothes[i].toString());
        }

        for(int i = 0; i < tmp.size(); i++){
            System.out.println(tmp.get(i));
        }

        for(int i = 0; i < clothes.length; i++){
            for(int j = 0; j <= 1; j++){
                System.out.println(clothes[i][j]);
            }
        }
*/

    }
}
