import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class HW3 {
    public static void main(String[] args) {
        ArrayList<Integer> randomList = randomArraylist();
        System.out.println( "ArrayList before removal : " + randomList );
        randomList.removeIf( s -> s % 2 == 0 );
        System.out.println( "ArrayList after removal : " + randomList + "\n" );

        ArrayList<String> list = new ArrayList<>( List.of( "string", "s", "5", "10", "-12", "my_value" ) );
        System.out.println( "ArrayList before removal : " + list );
        removeNum( list );
        System.out.println( "ArrayList after removal : " + list );
    }

    private static void removeNum(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            try {
                Integer.parseInt(list.get(i));
                list.remove(i--);
            }
            catch (Exception e){}
        }
    }

    static ArrayList<Integer> randomArraylist() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(10));
        }
        return list;
    }


}
