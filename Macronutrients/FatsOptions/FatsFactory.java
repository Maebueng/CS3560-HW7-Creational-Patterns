package FatsOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FatsFactory {

    private static FatsFactory instance = null;

    private FatsFactory(){}

    public static FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }
        return instance;
    }

    public static Fats createFats(String dietPlan) {
        List<String> options = new ArrayList<>();

        switch(dietPlan.toLowerCase()) {
            case "paleo":
                options.add("Avocado");
                options.add("Tuna");
                options.add("Peanuts");
                break;
            case "vegan":
                options.add("Avocado");
                options.add("Tuna");
                options.add("Peanuts");
                break;
            case "nut allergy":
                options.add("Avocado");
                options.add("Sour Cream");
                options.add("Tuna");
                break;
            default:
                options.add("Avocado");
                options.add("Sour Cream");
                options.add("Tuna");
                options.add("Peanuts");
                break;
        }

        Random random = new Random();
        String foodCorrespondingToDiet = options.get(random.nextInt(options.size()));

        switch (foodCorrespondingToDiet) {
            case "Avocado": return new Avocado();
            case "Sour Cream": return new SourCream();
            case "Tuna": return new Tuna();
            case "Peanuts": return new Peanuts();
            default: return null;
        }
    }
}