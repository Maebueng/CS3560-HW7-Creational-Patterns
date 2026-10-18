import CarbsOptions.*;
import ProteinsOptions.*;
import FatsOptions.*;

public class Meal {
    private Carbs carbs;
    private Proteins proteins;
    private Fats fats;

    public Meal (Carbs carbs, Proteins proteins, Fats fats) {
        this.carbs = carbs;
        this.proteins = proteins;
        this.fats = fats;
    }

    public void printMealDetails() {
        System.out.println("Meal:");
        System.out.println("Carbs: " + carbs.getName());
        System.out.println("Proteins: " + proteins.getName());
        System.out.println("Fats: " + fats.getName());
    }
}