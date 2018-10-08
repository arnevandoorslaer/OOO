package domain;

public class Geheim {
    private CodeerGedrag gedrag;
    private String zin;


    public Geheim(String zin){
        setZin(zin);
    }

    public String codeer(){
        return this.getGedrag().Codeer();
    }

    public String decodeer(){
        return this.getGedrag().Decodeer();
    }

    public CodeerGedrag getGedrag() {
        return gedrag;
    }

    public void setGedrag(String code) {
        switch(code){
            case "C":
                gedrag = new CaesarCijfer(this);
                break;
            case "S":
                gedrag = new Spiegeling(this);
                break;
            default: break;
        }
    }

    public String getZin() {
        return zin;
    }

    private void setZin(String zin) {
        this.zin = zin;
    }
}
