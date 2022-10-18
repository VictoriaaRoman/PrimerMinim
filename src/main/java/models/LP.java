package models;

public class LP {
    private int quantity;
    private String productId;
    public LP (int q, String prod){
        this.quantity = q;
        this.productId = prod;
    }
    public int getQuantity() {return quantity;}

    public void setQuantity(int quant) {
        this.quantity = quant;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return this.productId;
    }
}
