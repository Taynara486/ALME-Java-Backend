package model;

public class Product {

    private String name;
    private double price;
    private int sales;
    private int viralScore;

    public Product(String name, double price, int sales, int viralScore) {
        this.name = name;
        this.price = price;
        this.sales = sales;
        this.viralScore = viralScore;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getSales(){
        return sales;
    }

    public int getViralScore(){
        return viralScore;
    }

}
