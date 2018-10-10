package domain;

public class Feestartikel {
    private FeestartikelState uitleenbaar = new Uitleenbaar(this);
    private FeestartikelState uitgeleend;
    private FeestartikelState verwijderd;
    private FeestartikelState beschadigd;


    private double prijs;
    private String naam;
    private int id;

    private FeestartikelState state = uitleenbaar;

    public Feestartikel(int id,String naam, double prijs) {
        setNaam(naam);
        setPrijs(prijs);
        setId(id);
        uitleenbaar = new Uitleenbaar(this);
        uitgeleend = new Uitgeleend(this);
        verwijderd = new Verwijderd(this);
        beschadigd = new Beschadigd(this);
    }

    public String getNaam() {
        return this.naam;
    }

    private void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public FeestartikelState getState() {
        return state;
    }

    void setState(FeestartikelState state) {
        this.state = state;
    }

    public FeestartikelState getUitgeleend() {
        return uitgeleend;
    }

    public FeestartikelState getVerwijderd() {
        return verwijderd;
    }

    public FeestartikelState getBeschadigd() {
        return beschadigd;
    }

    public FeestartikelState getUitleenbaar() {
        return uitleenbaar;
    }


    public void herstel() {
        state.herstel();
    }

    public void verwijder() {
        state.verwijder();
    }

    public void brengTerug() {
        state.brengTerug();
    }

    public void leenUit() {
        state.leenUit();
    }

    public void beschadig() {
        state.beschadig();
    }

    public String toString() {
        return "Het product " + naam + " met id " + id + " is " + state;
    }
}
