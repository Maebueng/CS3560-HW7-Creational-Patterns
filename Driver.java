import CarbsOptions.CarbsFactory;
import CarbsOptions.Carbs;

public class Driver {
	public static void main(String[] args) {
		
		// runPizzaTests();
		runMacroNutrientsTests();

	} // end main

	private static void runPizzaTests() {
		Pizza pizzaHut1 = new PizzaBuilder()
		.setPizzaChain("Pizza Hut")
		.setPizzaSize("Large")
		.addToppings("Mushrooms")
		.addToppings("Olives")
		.addToppings("Spinach")
		.createPizza();
		pizzaHut1.eat();

		Pizza pizzaHut2 = new PizzaBuilder()
		.setPizzaChain("Pizza Hut")
		.setPizzaSize("Small")
		.addToppings("Pepperoni")
		.addToppings("Extra Cheese")
		.createPizza();
		pizzaHut2.eat();

		Pizza littleCaesars1 = new PizzaBuilder()
		.setPizzaChain("Little Caesars")
		.setPizzaSize("Medium")
		.addToppings("Pepperoni").addToppings("Sausage")
		.addToppings("Mushrooms").addToppings("Bacon")
		.addToppings("Onions").addToppings("Extra Cheese")
		.addToppings("Peppers").addToppings("Chicken")
		.createPizza();
		littleCaesars1.eat();

		Pizza littleCaesars2 = new PizzaBuilder()
		.setPizzaChain("Little Caesars")
		.setPizzaSize("Small")
		.addToppings("Ham and Pineapple").addToppings("Spicy Pork")
		.addToppings("Pesto").addToppings("Ham")
		.addToppings("Beef").addToppings("Tomato and Basil")
		.createPizza();
		littleCaesars2.eat();

		// Dominos
		Pizza dominos1 = new PizzaBuilder()
		.setPizzaChain("Dominos")
		.setPizzaSize("Small")
		.addToppings("Olives")
		.createPizza();
		dominos1.eat();

		Pizza dominos2 = new PizzaBuilder()
		.setPizzaChain("Dominos")
		.setPizzaSize("Large")
		.addToppings("Olives")
		.addToppings("Mushrooms")
		.addToppings("Spinach")
		.createPizza();
		dominos2.eat();

	}

	private static void runMacroNutrientsTests() {
		CarbsFactory carbsFactory = CarbsFactory.getInstance();

		String[] dietPlans = {"Paleo", "Vegan", "Nut allergy", "NO RESTRICTION"};

		System.out.println("Testing Carbs Factory");
		for (String diet : dietPlans) {
			System.out.println("\nDiet plan: " + diet);

			for (int i = 1; i <= 3; i++) {
				Carbs carb = carbsFactory.createCarb(diet);
				System.out.println("	Sample " + i + ": " + carb.getName());
			}
		}
	}
} // end Driver
