import java.util.*;

class Order {
    private String name;
    private List<Product> products;
    
    Order(String name) {
        this.name = name;
        products = new ArrayList<Product>();
    }
    
    void addProduct(Product product) {
        products.add(product);
    }
    
    int totalPrice() {
        int total = 0;
        for (int i = 0; i < products.size(); i++) {
            total += products.get(i).getPrice();
        }
        return total;
    }
    
    void print() {
        System.out.println("Order: " + name);
       for (int i = 0; i < products.size(); i++) {
            products.get(i).display();
        } 
        System.out.println("Total price: " + totalPrice() + " kr");
    }
}