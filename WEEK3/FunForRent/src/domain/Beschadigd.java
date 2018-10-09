package domain;

public class Beschadigd implements FeestartikelState {
    Feestartikel feestartikel;

    public Beschadigd(Feestartikel feestartikel) {
        this.feestartikel = feestartikel;
    }

    @Override
    public void herstel() {
        feestartikel.setState(feestartikel.getUitgeleend());
    }

    @Override
    public void verwijder() {
        feestartikel.setState(feestartikel.getVerwijderd());
    }

    @Override
    public void brengTerug() {
        throw new IllegalArgumentException("Product is beschadigd en kan niet terug gebracht worden.");
    }

    @Override
    public void leenUit() {
        throw new IllegalArgumentException("Product is beschadigd en kan niet uitgeleend worden.");
    }

    public String toString(){
        return "Product is beschadigd.";
    }
}
