import models.LP;
import models.Order;
import models.Product;
import models.User;

import java.util.*;

public class ProductManagerImpl implements ProductManager {

    List<Product> listProducts;
    HashMap<String, User> listUsers;
    Queue<Order> listOrders;

    public ProductManagerImpl() {
        this.listProducts = new ArrayList<>();
        this.listUsers = new HashMap<>();
        this.listOrders = new LinkedList<>();
    }
    public Product getProduct(String productId) {
        boolean encontrado = false;
        int i = 0;
        Product product = null;
        while ((!encontrado) && (i < listProducts.size())) {
            product = listProducts.get(i);

            if (product.getProductId().equals(productId)) {
                encontrado = true;
            }
            i++;
        }
        return (encontrado ? product : null);
    }
    @Override
    public List<Product> productsByPrice() {
        List<Product> list = listProducts;
        list.sort((p1,p2)-> Double.compare(p1.getPrice(), p2.getPrice()));
        return list;
    }

    @Override
    public List<Product> productsBySales() {
        List<Product> list = listProducts;
        list.sort((p1,p2)-> Double.compare(p1.getNumSales(), p2.getNumSales()));
        return list;
    }

    @Override
    public void addOrder(Order order) {
        this.listOrders.add(order);

    }
    @Override
    public Order processOrder() {

        Order order = listOrders.peek();
        String userId = order.getUserId();
        User user = listUsers.get(userId);
        //cojemos lista que tenia el usuario, añadimos la nueva orden y actualizamos
        List<Order> listOrdersActual = user.getUserOrders();
        listOrdersActual.add(order);
        user.setUserOrders(listOrdersActual);

        //extraemos de orden LP
        List<LP> lista = order.getListProducts();
        for (int i=0;i < lista.size(); i++){
            String id = lista.get(i).getProductId();
            int quantity = lista.get(i).getQuantity();
            Product product = getProduct(id);
            if (product != null) {
                int numSaleActual = product.getNumSales();
                product.setNumSales(numSaleActual+quantity);
            }
        }
        return listOrders.remove();
    }

    @Override
    public List<Order> ordersByUser(String userId) {
        User user = listUsers.get(userId);
        return user.getUserOrders();
    }

    @Override
    public void addUser(String id, String name, String surname) {
        User user = new User(id, name, surname);
        listUsers.put(id,user);
    }

    @Override
    public void addProduct(String productId, String name, double price) {
        Product product = new Product(productId, name, price);
        listProducts.add(product);

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
    public int numSales(String productId) {
        int numSales = 0;
        Product product = getProduct(productId);
        if (product != null) {
            numSales = product.getNumSales();
        }
        return numSales;
    }
}