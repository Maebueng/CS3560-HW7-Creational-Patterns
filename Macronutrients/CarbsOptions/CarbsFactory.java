package CarbsOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarbsFactory {
    public static Carbs getName(String dietPlan) {
        List<String> options = new ArrayList<>();
        
        switch(dietPlan.toLowerCase()) {
            case "paleo":
                options.add("Pistachio");
                break;
            case "vegan":
                options.add("Bread");
                options.add("Lentils");
                options.add("Pistachio");
                break;
            case "nut allergy":
                options.add("Bread");
                options.add("Lentils");
                options.add("Cheese");
            default: // "no restriction"
                options.add("Bread");
                options.add("Lentils");
                options.add("Pistachio");
                options.add("Cheese");
                break;
        } // end switch

        String foodCorrespondingToDiet = options.get(random.nextInt(options.size()));

        // Takes String version option and returns matching conrete object
        switch (foodCorrespondingToDiet) {
            case "Cheese": return new Cheese();
            case "Bread": return new Bread();
            case "Lentils": return new Lentils();
            case "Pistachio": return new Pistachio();
            default: return null;
        }
    }
}