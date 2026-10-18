package CarbsOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarbsFactory {
    // Sinlgeton instance
    private static CarbsFactory instance = null;

    // prevents instantiation outside this class
    private CarbsFactory(){}

    // retrive single instance
    public static CarbsFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
        }
        return instance; // test
    }
    
    public static Carbs createCarb(String dietPlan) {
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
                break;
            default: // "no restriction"
                options.add("Bread");
                options.add("Lentils");
                options.add("Pistachio");
                options.add("Cheese");
                break;
        } // end switch

        Random random = new Random();
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