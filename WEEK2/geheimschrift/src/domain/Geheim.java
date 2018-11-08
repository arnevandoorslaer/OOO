package domain;

public class Geheim {
    private CodeerGedrag gedrag;
    private String zin;


    public Geheim(String zin){
        setZin(zin);
    }

    public String codeer(){
        return this.getGedrag().Codeer(zin);
    }

    public String decodeer(){
        return this.getGedrag().Decodeer(zin);
    }

    public CodeerGedrag getGedrag() {
        return gedrag;
    }

    public void setGedrag(String code) {
        GeheimFactory fac = new GeheimFactory();
        gedrag = fac.create(code);
    }

    private void setZin(String zin) {
        this.zin = zin;
    }
}
