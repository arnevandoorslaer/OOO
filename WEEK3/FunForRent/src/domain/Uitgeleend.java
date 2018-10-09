package domain;

public class Uitgeleend implements FeestartikelState {
    Feestartikel feestartikel;

    public Uitgeleend(Feestartikel feestartikel) {
        this.feestartikel = feestartikel;
    }

    @Override
    public void herstel() {
        throw new IllegalArgumentException("");
    }

    @Override
    public void verwijder() {
        throw new IllegalArgumentException("");
    }

    @Override
    public void brengTerug() {
        feestartikel.setState(feestartikel.getUitleenbaar());
    }

    @Override
    public void leenUit() {
        throw new IllegalArgumentException("");
    }

    public String toString(){
        return "uitgeleend.";
    }
}
