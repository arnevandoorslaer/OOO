package domain;

public class CaesarCijfer implements CodeerGedrag {
    private Geheim context;

    public CaesarCijfer(Geheim c){
        this.context = c;
    }
    public String Codeer(){
        String res = "";
        String in = context.getZin();

        return res;
    }
    public String Decodeer(){
        String res = "";
        String in = context.getZin();

        return res;
    }
}
