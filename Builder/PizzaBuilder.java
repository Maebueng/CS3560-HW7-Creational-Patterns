import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private String pizzaChain;
    private String pizzaSize;
    private List<String> toppings = new ArrayList<>();

    public PizzaBuilder setPizzaChain(String pizzaChain) {
        this.pizzaChain = pizzaChain;
        return this;
    }

    public PizzaBuilder setPizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
        return this;
    }

    public PizzaBuilder addToppings(String toppings) {
        this.toppings.add(toppings);
        return this;
    }

    public Pizza createPizza() {
        if (this.pizzaSize == null) {
            throw new IllegalStateException("Please enter a pizza size.");
        }
        return new Pizza(pizzaChain, pizzaSize, new ArrayList<>(toppings));
    }
}