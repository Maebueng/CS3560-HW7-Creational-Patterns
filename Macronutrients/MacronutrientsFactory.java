import CarbsOptions.*;
import FatsOptions.*;
import ProteinsOptions.*;

public class MacronutrientsFactory {
    private static MacronutrientsFactory instance = null;

    private MacronutrientsFactory(){}

    public static MacronutrientsFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientsFactory();
        }
        return instance;
    }

    public Meal createMeal(String dietPlan) {
        Carbs carb = CarbsFactory.getInstance().createCarb(dietPlan);
        Proteins protein = ProteinsFactory.getInstance().createProtein(dietPlan);
        Fats fat = FatsFactory.getInstance().createFats(dietPlan); 

        return new Meal(carb, protein, fat);
    }
}
