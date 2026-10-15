public class Driver {
	public static void main(String[] args) {
		
		// Builder
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
}
