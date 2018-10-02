package domain;

public class Geheim {
    private CodeerGedrag gedrag;
    private String zin;


    public Geheim(String zin, String code){
        setZin(zin);
        switch(code){
            case "Caesar":
                setGedrag(new CaesarCijfer(this));
                break;
            case "Spiegel":
                setGedrag(new Spiegeling(this));
                break;
            default: break;
        }
    }

    public CodeerGedrag getGedrag() {
        return gedrag;
    }

    private void setGedrag(CodeerGedrag gedrag) {
        this.gedrag = gedrag;
    }

    public String getZin() {
        return zin;
    }

    private void setZin(String zin) {
        this.zin = zin;
    }
}
