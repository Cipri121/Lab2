package Ex2;

import java.util.Random;

public class Vers {
    private String vers;

    public Vers(String vers){
        this.vers = vers;
    }
    public String getVers(){
        return vers;
    }

    public int nr_c(){
        int count = 0;
        for(int i = 0;i < vers.length();i++){
            if(vers.charAt(i) == ' '){
                count++;
            }
        }
        return count + 1;
    }
    public int nr_v(){
        int count = 0;
        for(int i = 0;i < vers.length();i++){
            if(vers.charAt(i) == 'a' || vers.charAt(i) == 'u' || vers.charAt(i) == 'e' || vers.charAt(i) == 'i' || vers.charAt(i) == 'o' || vers.charAt(i) == 'A' ||vers.charAt(i) == 'E' ||vers.charAt(i) == 'I' ||vers.charAt(i) == 'O' ||vers.charAt(i) == 'U'){
                count++;
            }
        }
        return count;
    }

    public boolean steluta(String grup){

        if(grup.equals(vers.subSequence(vers.length() - grup.length(), vers.length()))){
            return true;
        }
        return false;
    }

    public void majuscule(){
        Random random = new Random();
        float r = random.nextFloat(1);
        if(r < 0.1){
            vers = vers.toUpperCase();
        }
    }
}
