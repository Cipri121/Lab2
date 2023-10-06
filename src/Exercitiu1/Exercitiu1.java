package Exercitiu1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
public class Exercitiu1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/Exercitiu1/judete_in.txt"));
        int i = 0;
        String judete[] = new String[100];

        while(scanner.hasNext()){
            judete[i] = scanner.next();
            i++;
        }

        System.out.println("Judete inainte de sortare:");
        for(int j = 0 ; j < i ; j++)
            System.out.println(judete[j]);

        Arrays.sort(judete, 0, i);

        System.out.println("Judete dupa sortare:");
        for(int j = 0 ; j < i ; j++)
            System.out.println(judete[j]);
    }
}
