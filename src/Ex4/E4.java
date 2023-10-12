package Ex4;
import java.util.Scanner;


public class E4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("n = ");
        n = scanner.nextInt();

        Persoana[] persoane = new Persoana[n];
        String nume, cnp;

        for(int l = 0; l < n; l++){
            System.out.print("Nume: ");
            nume = scanner.next();
            do{
            System.out.print("CNP: ");
            cnp = scanner.next();

                int i, a = 0;

                if(cnp.length() == 13){
                    for(i = 0; i < 13; i++){
                        if(!Character.isDigit(cnp.charAt(i))){
                            break;
                        }
                    }
                    if(i == 13){
                        if(cnp.charAt(0) == '1' || cnp.charAt(0) == '2' || cnp.charAt(0) == '5' || cnp.charAt(0) == '6'){
                            int k[] = {2,7,9,1,4,6,3,5,8,2,7,9};
                            for(int j = 0; j < 12; j++){
                                a += (cnp.charAt(j) - 48) * k[j];
                            }
                            if(cnp.charAt(12) - 48 == a % 11){
                                break;
                            }
                        }
                    }
                }


            }while(true);
            persoane[l] = new Persoana(nume, cnp);
        }

        for(int l = 0; l < n; l++){
            System.out.println(persoane[l].getNume() + ',' + persoane[l].getCnp() + ',' + persoane[l].getVarsta());
        }
    }

}
