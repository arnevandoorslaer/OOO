package domain;

public class Uitgeleend implements FeestartikelState {
    Feestartikel feestartikel;

    public Uitgeleend(Feestartikel feestartikel) {
        this.feestartikel = feestartikel;
    }

    @Override
    public void herstel() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is niet beschadigd.");
    }

    @Override
    public void verwijder() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is momenteel uitgeleend.");
    }

    @Override
    public void brengTerug() {
        feestartikel.setState(feestartikel.getUitleenbaar());
    }

    @Override
    public void leenUit() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is al uitgeleend.");
    }

    @Override
    public void beschadig() {
        feestartikel.setState(feestartikel.getBeschadigd());
    }

    public String toString(){
        return "uitgeleend.";
    }
}
