import models.Order;
import models.Product;
import models.User;

import java.util.*;

public class ProductManagerImpl implements ProductManager{

    List<Product> listProducts;
    HashMap<String, User> listUsers;
    Queue<Order> listOrders;
    public ProductManagerImpl (){
        this.listProducts = new ArrayList<>();
        this.listUsers = new HashMap<>();
        this.listOrders = new LinkedList<>();
    }

    @Override
    public List<Product> productsByPrice() {
        List<Product> list = listProducts;
        //Ordenar per preus
        return list;
    }

    @Override
    public List<Product> productsBySales() {
        List<Product> list = listProducts;
        //Ordenar per ventes
        return list;
    }

    @Override
    public void addOrder(Order order) {
        this.listOrders.add(order);

    }

    @Override
    public Order processOrder() {

        Order order = listOrders.get(0);
        String userId = order.getUserId();



        return null;
    }

    @Override
    public List<Order> ordersByUser(String userId) {
        return null;
    }

    @Override
    public void addUser(String id, String name, String surname) {
        User user = new User(id, name, surname);
        listUsers.add(user);
    }

    @Override
    public void addProduct(String productId, String name, double price) {
        Product product = new Product(productId,name,price);
        listProducts.add(product);

    }

    @Override
    public Product getProduct(String productId) {
        return null;
    }

    @Override
    public int numUsers() {
        return listUsers.size();
    }

    @Override
    public int numProducts() {
        return listProducts.size();
    }

    @Override
    public int numOrders() {
        return listOrders.size();
    }

    @Override
    public int numSales(String b001) {
        int numSales = 0;
        boolean encontrado = false;
        int i = 0;
        while ((!encontrado) && (i<listProducts.size())){
            if(listProducts.get(i).getProductId) == b001){
                encontrado = true;
            } else{
                i++;
            }
        }
        if (encontrado){
            numSales = listProducts.get(i).getNumSales();
        }
        return numSales;
    }
}

