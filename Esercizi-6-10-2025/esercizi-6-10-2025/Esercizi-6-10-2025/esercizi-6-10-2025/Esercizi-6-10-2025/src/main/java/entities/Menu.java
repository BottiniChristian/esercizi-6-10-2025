package entities;

import java.util.List;

public class Menu {
    private final List<Pizza> pizzas;
    private final List<Topping> toppings;
    private final List<Drink> drinks;

    public Menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public String prettyPrint() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Pizzeria Menu ===\n\n");

        // --- Pizze ---
        sb.append("Pizze\n");
        sb.append(String.format("%-79s %12s %12s%n", "Nome", "Calorie", "Prezzo"));
        sb.append("-".repeat(105)).append("\n");
        for (Pizza p : pizzas) {
            sb.append(String.format("%-79s %12d %12.2f%n",
                    p.getName(), p.getCalories(), p.getPrice()));
        }

        sb.append("\nToppings\n");
        sb.append(String.format("%-40s %12s %12s%n", "Nome", "Calorie", "Prezzo"));
        sb.append("-".repeat(66)).append("\n");
        for (Topping t : toppings) {
            sb.append(String.format("%-40s %12d %12.2f%n",
                    t.getName(), t.getCalories(), t.getPrice()));
        }

        sb.append("\nDrinks\n");
        sb.append(String.format("%-40s %12s %12s%n", "Nome", "Calorie", "Prezzo"));
        sb.append("-".repeat(66)).append("\n");
        for (Drink d : drinks) {
            sb.append(String.format("%-40s %12d %12.2f%n",
                    d.getName(), d.getCalories(), d.getPrice()));
        }

        return sb.toString();
    }
}