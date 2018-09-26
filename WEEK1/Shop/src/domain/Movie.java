package domain;

public class Movie extends Product{
    public Movie(String title, int id){
        super(title, id);
    }

    @Override
    public double getPrice(int days){
        return days <= 3 ? 5 : 5+(days-3)*2;
    }
}
