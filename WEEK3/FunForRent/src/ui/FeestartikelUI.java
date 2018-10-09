package ui;

import domain.Feestartikel;
import javax.swing.*;

public class FeestartikelUI {
    public FeestartikelUI() {
        String keuze = JOptionPane.showInputDialog("1. Add party item\n" +
                        "2. Remove party item\n" +
                        "3. Rent party item\n" +
                        "4. Return party item\n" +
                        "5. Repair party item\n" +
                        "6. Show available party items\n\n" +
                        "0. Stop");
        switch(keuze){
            case "1": break;
            case "2": break;
            case "3": break;
            case "4": break;
            case "5": break;
            case "6": break;
            case "0": break;
            default:
                System.out.println("Invalide keuze.");break;
        }
    }
}
