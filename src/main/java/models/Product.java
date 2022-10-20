package models;
import java.util.ArrayList;

public class Product {
    private String productId;
    private String name;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private double price;
    private int numSales;

    public Product (String id, String name, double price){
        this.productId = id;
        this.name = name;
        this.price = price;
    }
    public String getProductId (){
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setNumSales(int numSales) {
        this.numSales = numSales;
    }

    public int getNumSales (){
        return this.numSales;
    }
}
