package models;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private String userId;
    List<LP> listProducts;
    public Order(String id){
        listProducts = new ArrayList<LP>();
        this.userId = id;
    }
    public void addLP(int q, String product) {
        listProducts.add(new LP(q, product));
    };

    public LP getLP(int i) {
        return listProducts.get(i);
    };

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<LP> getListProducts() {
        return listProducts;
    }

    public void setListProducts(List<LP> listProducts) {
        this.listProducts = listProducts;
    }

    public String getUserId (){
        return userId;
    }
}
