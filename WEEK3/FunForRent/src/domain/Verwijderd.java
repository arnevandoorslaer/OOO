package domain;

public class Verwijderd implements FeestartikelState {
    Feestartikel feestartikel;

    public Verwijderd(Feestartikel feestartikel) {
        this.feestartikel = feestartikel;
    }

    @Override
    public void herstel() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is al verwijderd.");
    }

    @Override
    public void verwijder() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is al verwijderd.");
    }

    @Override
    public void brengTerug() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is al verwijderd.");
    }

    @Override
    public void leenUit() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is al verwijderd.");
    }

    @Override
    public void beschadig() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is al verwijderd.");
    }

    public String toString() {
        return "verwijderd.";
    }
}
