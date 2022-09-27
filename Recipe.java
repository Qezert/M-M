import java.util.*;

class Recipe {
    String title;
    List<Ingredient> ingredients;
    
    Recipe(String title) {
        this.title = title;
        ingredients = new ArrayList<Ingredient>();
    }
    
    void addIngredient(Ingredient ingredient) {
        ingredients.add(ingredient);
    }
    
    void show() {
        System.out.println("Opskrift på: " + title);
        System.out.println("Ingredienser: ");
        for (int i = 0; i < ingredients.size(); i++) {
            ingredients.get(i).display();
        }
    }
}