package domain;

public class Uitleenbaar implements FeestartikelState {
    Feestartikel feestartikel;

    public Uitleenbaar(Feestartikel feestartikel) {
        this.feestartikel = feestartikel;
    }

    @Override
    public void herstel() {
        throw new IllegalArgumentException("Product is niet kapot dus kan niet hersteld worden.");
    }

    @Override
    public void verwijder() {
        feestartikel.setState(feestartikel.getVerwijderd());
    }

    @Override
    public void brengTerug() {
        throw new IllegalArgumentException("Product is niet uitgeleend dus kan niet terug gebracht worden.");
    }

    @Override
    public void leenUit() {
        feestartikel.setState(feestartikel.getUitgeleend());
    }

    public String toString(){
        return "uitleenbaar.";
    }
}
