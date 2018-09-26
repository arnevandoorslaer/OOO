package domain;

public class CD extends Product {
    public CD(String title, int id){
        super(title,id);
    }

    @Override
    public double getPrice(int days){
        return days*1.5;
    }

    @Override
    public String toString() {
        return "The CD " + super.toString();
    }
}
