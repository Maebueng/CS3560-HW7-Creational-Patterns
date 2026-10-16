package ProteinsOptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProteinsFactory {

    private static ProteinsFactory instance = null;

    private ProteinsFactory(){}

    public static ProteinsFactory getInstance() {
        if (instance == null) {
            instance = new ProteinsFactory();
        }
        return instance;
    }

    public static Proteins createProtein(String dietPlan) {
        List<String> options = new ArrayList<>();

        switch(dietPlan.toLowerCase()) {
            case "paleo":
                options.add("Beef");
                options.add("Chicken");
                options.add("Fish");
                break;
            case "vegan":
                options.add("Tofu");
                break;
            case "nut allergy":
                options.add("Beef");
                options.add("Chicken");
                options.add("Fish");
                options.add("Tofu");
                break;
            default:
                options.add("Beef");
                options.add("Chicken");
                options.add("Fish");
                options.add("Tofu");
                break;
        } // end switch

        Random random = new Random();
        String foodCorrespondingToDiet = options.get(random.nextInt(options.size()));

        switch (foodCorrespondingToDiet) {
            case "Beef": return new Beef();
            case "Chicken": return new Chicken();
            case "Fish": return new Fish();
            case "Tofu": return new Tofu();
            default: return null;
        }
    }


}