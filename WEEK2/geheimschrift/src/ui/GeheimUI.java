package ui;
import domain.*;

import javax.swing.*;

public class GeheimUI {
    private Geheim g;
    private int x = 0;
    public GeheimUI(){
        while(x != 1){
            String zin = JOptionPane.showInputDialog("Welke zin wil je coderen of decoderen?");
            String code = JOptionPane.showInputDialog("Caesar = \"C\" of Spiegel = \"S\"");
            g = new Geheim(zin);
            g.setGedrag(code);

            String keuze = JOptionPane.showInputDialog("Wil je coderen = \"C\" of decoderen = \"D\"");
            switch(keuze) {
                case "C":
                    JOptionPane.showMessageDialog(null, g.codeer());
                    break;
                case "D":
                    JOptionPane.showMessageDialog(null, g.decodeer());
                    break;
                default:
                    break;
            }
            String opn = JOptionPane.showInputDialog("Wil je stoppen?     1\nWil je opnieuw?      0");
            if(Integer.parseInt(opn) == 1){
                x = 1;
                break;
            }
        }
    }
}
