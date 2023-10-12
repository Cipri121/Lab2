package Ex4;

import java.time.LocalDate;

public class Persoana {
    private String nume;
    private String cnp;

    public Persoana(String nume, String cnp){
        this.cnp = cnp;
        this.nume = nume;
    }

    public String getNume(){
        return nume;
    }
    public String getCnp(){
        return cnp;
    }
    public int getVarsta(){

        int varsta;
        String an, zi, luna;
        an = cnp.substring(1, 3);
        luna = cnp.substring(3, 5);
        zi = cnp.substring(5, 7);

        int a, l = Integer.parseInt(luna), z = Integer.parseInt(zi);
        if(cnp.charAt(0) == '1' || cnp.charAt(0) == '2'){
            an = "19" + an;
        }else{
            an = "20" + an;
        }
        a = Integer.parseInt(an);

        LocalDate data = LocalDate.now();
        LocalDate data_nas = LocalDate.of(a, l, z);

        varsta = data.getYear() - data_nas.getYear();

        return varsta;
    }
}
