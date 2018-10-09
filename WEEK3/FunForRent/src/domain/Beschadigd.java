package domain;

public class Beschadigd implements FeestartikelState {
    Feestartikel feestartikel;

    public Beschadigd(Feestartikel feestartikel) {
        this.feestartikel = feestartikel;
    }

    @Override
    public void herstel() {
        feestartikel.setPrijs(feestartikel.getPrijs()*2/3);
        feestartikel.setState(feestartikel.getUitleenbaar());
    }

    @Override
    public void verwijder() {
        feestartikel.setState(feestartikel.getVerwijderd());
    }

    @Override
    public void brengTerug() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is beschadigd en kan niet terug gebracht worden.");
    }

    @Override
    public void leenUit() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is beschadigd en kan niet uitgeleend worden.");
    }

    @Override
    public void beschadig() {
        throw new IllegalArgumentException(feestartikel.getNaam() + " is al beschadigd.");
    }

    public String toString(){
        return "beschadigd.";
    }
}
