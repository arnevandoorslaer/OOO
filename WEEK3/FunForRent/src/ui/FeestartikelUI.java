package ui;

import domain.Feestartikel;

public class FeestartikelUI {
    public FeestartikelUI() {
        try {
            Feestartikel feestartikel = new Feestartikel();
            feestartikel.brengTerug();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
