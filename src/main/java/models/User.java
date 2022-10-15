package models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String name;
    private String surname;
    private List<Order> userOrders;

    public User (String id, String name, String surname){
        this.userId = id;
        this.name = name;
        this.surname = surname;
        this.userOrders = new ArrayList<Order>();
    }
}
