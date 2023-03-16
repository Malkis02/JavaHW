import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите число и символы");
        int n = sc.nextInt();
        String c1 = sc1.next();
        String c2 = sc2.next();
        System.out.println(compress(n,c1,c2));
        createFile();
    }

    private static String compress(int n, String c1,String c2){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            sb.append(c1);
            sb.append(c2);
        }
        return sb.substring(0,n);
    }

    private static void createFile() throws IOException {
        File file = new File("E://dev//HW//src//main//resources","file.txt");
        if(!file.exists()){
            FileWriter fw = new FileWriter(file);
            file.createNewFile();
            for (int i = 0; i <=100 ; i++) {
                fw.append("TEXT\n");
            }
            fw.close();
        }

    }
}
