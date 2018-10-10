package domain;

import java.util.ArrayList;

public class Feestmateriaal {
    private ArrayList<Feestartikel> artikels;

    public Feestmateriaal() {
        artikels = new ArrayList<>();
    }

    public void addArtikel(String naam, double prijs) {
        int id;
        if (artikels.size() == 0) {
            id = 0;
        } else {
            id = artikels.get(artikels.size() - 1).getId() + 1;
        }
        artikels.add(new Feestartikel(id, naam, prijs));
    }

    public Feestartikel getArtikel(int id) {
        for (Feestartikel artikel : artikels) {
            if (artikel.getId() == id) return artikel;
        }
        return null;
    }

    public void removeArtikel(int id) {
        getArtikel(id).verwijder();
    }

    public String getBeschikbareArtikels() {
        String res = "";
        for (Feestartikel artikel : artikels) {
            if (artikel.getState().toString().equals("uitleenbaar.")) {
                res += artikel + "\n";
            }
        }
        return res;
    }

    public String toString() {
        String res = "";
        for (Feestartikel artikel : artikels) {
            res += artikel + "\n";
        }
        return res;
    }
}
