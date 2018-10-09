package domain;

public class Verwijderd implements FeestartikelState {
    Feestartikel feestartikel;

    public Verwijderd(Feestartikel feestartikel) {
        this.feestartikel = feestartikel;
    }

    @Override
    public void herstel() {
        throw new IllegalArgumentException("Product is verwijderd.");
    }

    @Override
    public void verwijder() {
        throw new IllegalArgumentException("Product is verwijderd.");
    }

    @Override
    public void brengTerug() {
        throw new IllegalArgumentException("Product is verwijderd.");
    }

    @Override
    public void leenUit() {
        throw new IllegalArgumentException("Product is verwijderd.");
    }

    public String toString(){
        return "Product is verwijderd.";
    }
}
