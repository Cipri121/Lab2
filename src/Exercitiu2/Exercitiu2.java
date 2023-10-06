package Exercitiu2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercitiu2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("src/Exercitiu2/cantec_in.txt"));
        PrintStream flux_out = new PrintStream("cantec_out.txt");

        while(scanner.hasNextLine()) {
            String V = scanner.nextLine();
            Vers versuri = new Vers(V);
            flux_out.print(versuri.getVers());
            flux_out.println(versuri.numarCuv());
        }
    }
}
