package bai09;

public class Publication {
    private String title;
    private double price;
    public Publication() {}
    public Publication(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void output(){
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}
