import java.util.*;

public class HW5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String text = sc.nextLine();
        collectStats(text);

    }

    static void collectStats(String text) {
         Map<Integer, List<String>> stats = new HashMap<>();
         String[] arr = text.split(" ");
         for(String str: arr){
             if(!stats.containsKey(str.length())){
                 stats.put(str.length(),new ArrayList<>(List.of(str)));
             }
             else {
                 stats.get(str.length()).add(str);
             }
         }
        for(var str:stats.entrySet()){
            List<String> print = str.getValue();
            for(String s: print){
                System.out.print(s + " ");
                System.out.println();
            }
        }
    }
}
