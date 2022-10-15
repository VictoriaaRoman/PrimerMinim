package models;

import java.util.List;
import java.util.ArrayList;

public class Order {
    private String userId;
    private List<LP> listProducts;
    public Order(String id){
        listProducts = new ArrayList<LP>();
        this.userId = id;
    }
    public void addLP(int q, String product) {
        listProducts.add(new LP(q, product));
    };

    public Object getLP(int i) {
        return listProducts.get(i);
    };
    public String getUserId (){
        return userId;
    }
}
