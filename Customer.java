public class Customer {
    private String name;
    private String dietPlan;

    public Customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public void displayMeal() {
        Meal meal = MacronutrientsFactory.getInstance().createMeal(dietPlan);

        System.out.println("Customer: " + name);
        System.out.println("Diet Plan: " + dietPlan);
        meal.printMealDetails();
        System.out.println();
    }
}