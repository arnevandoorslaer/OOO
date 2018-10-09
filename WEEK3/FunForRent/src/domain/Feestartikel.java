package domain;

public class Feestartikel {
    FeestartikelState uitgeleend;
    FeestartikelState verwijderd;
    FeestartikelState beschadigd;
    FeestartikelState uitleenbaar;

    FeestartikelState state = uitleenbaar;

    public Feestartikel() {
        uitgeleend = new Uitgeleend(this);
        verwijderd = new Verwijderd(this);
        uitleenbaar = new Uitleenbaar(this);
        beschadigd = new Beschadigd(this);
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
}
