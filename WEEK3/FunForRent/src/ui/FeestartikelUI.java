package ui;

import domain.Feestmateriaal;

import javax.swing.*;

public class FeestartikelUI {
    Feestmateriaal fm;

    public FeestartikelUI() {
        fm = new Feestmateriaal();
        fm.addArtikel("Grote Dildo", 30.12);
        fm.addArtikel("Kleine Dildo", 20.12);
        fm.addArtikel("Water", 1.50);
        fm.addArtikel("Party Popper", 5);
        fm.addArtikel("Wiet", 10);

        String keuze = JOptionPane.showInputDialog("1. Add party item\n" +
                "2. Remove party item\n" +
                "3. Rent party item\n" +
                "4. Return party item\n" +
                "5. Repair party item\n" +
                "6. Show available party items\n\n" +
                "0. Stop");
        while (!keuze.equals("0")) {
            switch (keuze) {
                case "1":
                    addArtikel();
                    break;
                case "2":
                    removeArtikel();
                    break;
                case "3":
                    rentArtikel();
                    break;
                case "4":
                    returnArtikel();
                    break;
                case "5":
                    repairArtikel();
                    break;
                case "6":
                    showArtikels();
                    break;
                default:
                    System.out.println("Invalide keuze.");
                    break;
            }
            keuze = JOptionPane.showInputDialog("1. Add party item\n" +
                    "2. Remove party item\n" +
                    "3. Rent party item\n" +
                    "4. Return party item\n" +
                    "5. Repair party item\n" +
                    "6. Show available party items\n\n" +
                    "0. Stop");
        }
    }

    private void addArtikel() {
        String naam = JOptionPane.showInputDialog("Geef de naam van het feestartikel.");
        double prijs = Double.parseDouble(JOptionPane.showInputDialog("Geef de prijs van het feestartikel."));
        fm.addArtikel(naam, prijs);
    }

    private void removeArtikel() {
        try {
            fm.removeArtikel(Integer.parseInt(JOptionPane.showInputDialog("Geef het id van het feestartikel dat je wilt verwijderen in.")));
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void rentArtikel() {
        try {
            fm.getArtikel(Integer.parseInt(JOptionPane.showInputDialog("Geef het id van het feestartikel dat je wilt lenen in."))).leenUit();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void returnArtikel() {
        try {
            fm.getArtikel(Integer.parseInt(JOptionPane.showInputDialog("Geef het id van het feestartikel dat je wilt terug brengen in."))).brengTerug();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void repairArtikel() {
        try {
            fm.getArtikel(Integer.parseInt(JOptionPane.showInputDialog("Geef het id van het feestartikel dat je wilt herstellen in."))).herstel();
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void showArtikels() {
        JOptionPane.showMessageDialog(null, fm.getBeschikbareArtikels());
    }

}
