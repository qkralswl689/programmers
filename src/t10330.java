public class t10330 {
    public static void main(String[] args) {


        String[][] booked = {{"09:10", "lee"}};
        String[][] unbooked = {{"09:00", "kim"}, {"09:05", "bae"}};

        int tmp = booked.length + unbooked.length;
        String[] answer = new String[tmp];
        String[][] result = new String[tmp][tmp - 1];

        for (int i = 0; i < booked.length; i++) {
            for (int j = 0; j <= booked.length; j++) {
                result[i][j] = booked[i][j];
            }
        }

        for(int i = booked.length; i <= unbooked.length;i++){
            for(int j = 0; j< unbooked.length; j++){
                result[i][j] = unbooked[i- booked.length][j];
            }
        }


        for(int i = 0; i < result.length; i++){
            for(int j = 0; j <= 1; j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }



    }
}
