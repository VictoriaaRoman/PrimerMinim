package models;
import java.util.ArrayList;

public class Product {
    private String productId;
    private String name;
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
    public int getNumSales (){
        return this.numSales;
    }
}
