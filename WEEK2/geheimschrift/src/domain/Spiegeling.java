package domain;

public class Spiegeling implements CodeerGedrag {
    public String Codeer(String zin){
        String res ="";
        String in = zin;
        for(int i = 0; i<in.length(); i++){
            res = in.charAt(i) + res ;
        }
        return res;
    }
    public String Decodeer(String zin){
        return Codeer(zin);
    }
}
