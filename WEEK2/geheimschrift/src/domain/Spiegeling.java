package domain;

public class Spiegeling implements CodeerGedrag {
    private Geheim context;

    public Spiegeling(Geheim c){
        this.context = c;
    }

    public String Codeer(){
        String res ="";
        String in = context.getZin();
        for(int i = 0; i<in.length(); i++){
            res = in.charAt(i) + res ;
        }
        return res;
    }
    public String Decodeer(){
        return Codeer();
    }
}
