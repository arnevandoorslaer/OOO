package ui;
import domain.*;
import javax.swing.JOptionPane;

public class ShopUI {
    private Shop PrrPrr;
    public ShopUI(){
        PrrPrr = new Shop();
        start();
    }

    private void start(){
        String menu = "1. Add product\n2. Show product\n3. Show rental price\n4. Show status of product\n 5. Show list of products\n\n0. Quit";
        int choice = -1;
        while(choice != 0){
            String choiceString = choiceString = JOptionPane.showInputDialog(menu);
            if(choiceString == null) break;
            choice = Integer.parseInt(choiceString);
            switch (choice){
                case 1: addProduct(); break;
                case 2: showProduct(); break;
                case 3: showPrice(); break;
                case 4: showStatus(); break;
                case 5: showListOfProducts(); break;
                case 0: break;
                default: throw new IllegalArgumentException("Invalid coice");
            }
        }
    }
    private void showListOfProducts(){
        JOptionPane.showMessageDialog(null, PrrPrr.toString());
    }
    private void showStatus(){
        String idStr = JOptionPane.showInputDialog("Which product do you want to see?");
        int id = Integer.parseInt(idStr);
        String res = PrrPrr.getProduct(id).isUitgeleend()?"Product is lent":"Product is available";
        JOptionPane.showMessageDialog(null, res);
    }

    private void showPrice(){
        String idStr = JOptionPane.showInputDialog("Van welk id wil je de prijs berekenen?");
        int id = Integer.parseInt(idStr);
        String daysStr = JOptionPane.showInputDialog("Voor hoeveel dagen wordt het product ontleend?");
        int days = Integer.parseInt(daysStr);

        JOptionPane.showMessageDialog(null,"€ " + PrrPrr.getProduct(id).getPrice(days));
        PrrPrr.getProduct(id).getPrice(days);
    }
    private void addProduct(){
        String type = JOptionPane.showInputDialog("Van welk type is het product?\n\nG = Game\nM = Movie\nCD = CD");
        int id = PrrPrr.getHighestKey();
        String title = JOptionPane.showInputDialog("Wat is de titel?");

        switch (type){
            case "G":
                PrrPrr.addProduct(new Game(title,id));
                break;
            case "M":
                PrrPrr.addProduct(new Movie(title,id));
                break;
            case "CD":
                PrrPrr.addProduct(new CD(title,id));
                break;
            default: throw new IllegalArgumentException("Geen juiste code");

        }
    }

    private void showProduct(){
        String idStr = JOptionPane.showInputDialog("Van welk id wil je het product zien?");
        int id = Integer.parseInt(idStr);
        Product temp = PrrPrr.getProduct(id);
        JOptionPane.showMessageDialog(null,temp.toString());
    }
}
