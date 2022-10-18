package greedy2210;

public class greedy_book_01 {
    public static void main(String[] args) {

        // 1,260 을 500/100/50/10 원으로 거슬러줄때 동전의 최소 개수

        int money = 1260;
        int count = 0;
        int[] coin = {500,100,50,10};

        for(int i = 0; i < coin.length; i ++){
            System.out.println("before" + money + "\n");
            count += money / coin[i];
            money %= coin[i];
            System.out.println("after" + money+ "\n");
//            if(money / coin[i] < 0){
//                break;
//            }

        }
        System.out.println("count : " + count);
    }
}
