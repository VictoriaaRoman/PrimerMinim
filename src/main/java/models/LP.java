package models;

public class LP {
    private int quant;
    private String productId;
    public LP (int q, String prod){
        this.quant = q;
        this.productId = prod;
    }
    public int getQuantity() {
        return this.quant;
    }
    public String getProductId() {
        return this.productId;
    }
}
