package domain;

public class Uitleenbaar implements FeestartikelState {
    Feestartikel feestartikel;

    public Uitleenbaar(Feestartikel feestartikel) {
        this.feestartikel = feestartikel;
    }

    @Override
    public void herstel() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is niet kapot dus kan niet hersteld worden.");
    }

    @Override
    public void verwijder() {
        feestartikel.setState(feestartikel.getVerwijderd());
    }

    @Override
    public void brengTerug() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is niet uitgeleend dus kan niet terug gebracht worden.");
    }

    @Override
    public void leenUit() {
        feestartikel.setState(feestartikel.getUitgeleend());
    }

    @Override
    public void beschadig() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is niet uitgeleend dus kan niet beschadigd worden.");    }

    public String toString(){
        return "uitleenbaar.";
    }
}
