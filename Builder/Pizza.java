import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String pizzaChain;
    private String pizzaSize;
    private List<String> toppings = new ArrayList<>();

    public Pizza(String pizzaChain, String pizzaSize, List<String> toppings) {
        this.pizzaChain = pizzaChain;
        this.pizzaSize = pizzaSize;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println("Pizza Chain: " + pizzaChain);
        System.out.println("Size: " + pizzaSize);
        System.out.println("Toppings: " + String.join(", ", toppings));
        System.out.println();
    }

}