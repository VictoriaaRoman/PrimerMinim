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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Order> getUserOrders() {
        return userOrders;
    }

    public void setUserOrders(List<Order> userOrders) {
        this.userOrders = userOrders;
    }
}
