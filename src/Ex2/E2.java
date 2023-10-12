package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(System.in);
        Scanner scanner = new Scanner(new File("src/Ex2/cantec_in.txt"));
        PrintStream out = new PrintStream("src/Ex2/cantec_out.txt");

        int i = 0;
        String ve;
        System.out.println("Da-ti gruparea: ");
        String grup = reader.next();

        while(scanner.hasNext()) {
            ve = scanner.nextLine();
            Vers vers = new Vers(ve);
            i++;
            vers.majuscule();
            out.print(vers.getVers());
            out.print(" " + vers.nr_c());
            out.print(" " + vers.nr_v());
            if(vers.steluta(grup)){
                out.print(" " + '*');
            }
            out.println();
        }
    }
}
