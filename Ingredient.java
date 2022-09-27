class Ingredient {
    int quantity;
    String unit;
    String name;
    
    Ingredient(int quantity, String unit, String name) {
        this.quantity = quantity;
        this.unit = unit;
        this.name = name;
    }
    
    void display() {
        System.out.println(quantity + " " + unit + " " + name);
    }
}