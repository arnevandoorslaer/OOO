package domain;

public class Spiegeling implements CodeerGedrag {
    private Geheim context;

    public Spiegeling(Geheim c){
        this.context = c;
    }

    public String Codeer(){
        String res ="";
        String in = context.getZin();

        return res;
    }
    public String Decodeer(){
        String res = "";
        String in = context.getZin();

        return res;
    }
}
