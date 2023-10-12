package Ex3;

import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceți șirul sursă:");
        String sirSursa = scanner.nextLine();

        System.out.println("Introduceți șirul de inserat:");
        String sirDeInserat = scanner.nextLine();

        System.out.println("Introduceți poziția la care doriți să inserați șirul:");
        int ins = scanner.nextInt();

        StringBuilder stringBuilder = new StringBuilder(sirSursa);
        stringBuilder.insert(ins, sirDeInserat);

        System.out.println("Șirul rezultat după inserare: " + stringBuilder.toString());

        System.out.println("Introduceți poziția de la care să înceapă ștergerea:");
        int poz = scanner.nextInt();

        System.out.println("Introduceți numărul de caractere de șters:");
        int nr = scanner.nextInt();


        stringBuilder.delete(poz, poz + nr);

        System.out.println("Șirul rezultat după ștergere: " + stringBuilder.toString());
    }
}
