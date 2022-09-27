class Product {
    private String name;
    private int price;
    
    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    
    int getPrice() {
        return price;
    }
    
    void setPrice(int newPrice) {
        price = newPrice;
    }
    
    void display() {
        System.out.println(name + ": " + price + "kr");
    }
}