package Exercitiu2;

public class Vers {
    public String vers;

    public Vers(String vers) {
        this.vers = vers;
    }

    public String getVers() {
        return vers;
    }

    int numarCuv(){
        int nr = 0;
        int i = vers.length();
        for(int j = 0 ; j < i ; j++){
            if(vers.charAt(j) ==  ' '){
                nr++;
            }
        }
        return nr+1;
    }
}
