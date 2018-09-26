package domain;

public abstract class Product {
    private String title;
    private int id;
    private boolean uitgeleend;

    public Product(String title, int id) {
        setTitle(title);
        setId(id);
        uitgeleend = false;
    }

    public abstract double getPrice(int days);

    public String getTitle() {
        return this.title;
    }

    private void setTitle(String title) {
        if(title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.title = title;

    }

    public int getId() {
        return this.id;
    }

    private void setId(int id) {
        if(id < 0){
            throw new IllegalArgumentException();
        }
        this.id = id;
    }

    public boolean isUitgeleend() {
        return uitgeleend;
    }

    public void setUitgeleend(boolean uitgeleend) {
        this.uitgeleend = uitgeleend;
    }
}
