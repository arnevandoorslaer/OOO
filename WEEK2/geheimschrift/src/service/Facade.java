package service;
import domain.Cyphers;
import domain.Geheim;

import java.util.ArrayList;

public class Facade {
    Geheim g;
    public void setGeheim(String zin) {
        g = new Geheim(zin);
    }

    public void setGedrag(String code) {
        g.setGedrag(code);
    }

    public String codeer() {
        return g.codeer();
    }

    public String decodeer() {
        return g.decodeer();
    }

    public ArrayList<String> getCyphers(){
        ArrayList<String> out = new ArrayList<>();
        for(Cyphers c: Cyphers.values()){
            out.add(c.toString());
        }
        return out;
    }
}
