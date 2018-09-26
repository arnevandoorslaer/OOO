package domain;

public class Game extends Product {
    public Game(String title, int id){
        super(title,id);
    }

    @Override
    public double getPrice(int days) {
        return days * 3;
    }
}
