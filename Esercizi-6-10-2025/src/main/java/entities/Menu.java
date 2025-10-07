package entities;

import java.util.List;

public class Menu {
    private final List<Pizza> pizzas;
    private final List<Drink> drinks;
    private final List<Topping> toppings;

    public Menu(List<Pizza> pizzas, List<Drink> drinks, List<Topping> toppings) {
        this.pizzas = pizzas;
        this.drinks = drinks;
        this.toppings = toppings;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public String prettyPrint() {
        StringBuilder sb = new StringBuilder();

        sb.append(" MENU DELLA PIZZERIA \n\n");
        sb.append(String.format("%-78s %-12s %-12s%n", "Nome", "Calorie", "Prezzo (€)"));
        sb.append("=".repeat(102)).append("\n");

        // --- Pizze ---
        sb.append("\n PIZZE\n");
        for (Pizza p : pizzas) {
            sb.append(String.format("%-79s %-12d %-12.2f%n", p.getName(), p.getCalories(), p.getPrice()));
        }

        sb.append("=".repeat(102)).append("\n");

        // --- Bevande ---
        sb.append("\n DRINKS\n");
        for (Drink d : drinks) {
            sb.append(String.format("%-79s %-12d %-12.2f%n", d.getName(), d.getCalories(), d.getPrice()));
        }

        sb.append("=".repeat(102)).append("\n");

        // --- Toppings ---
        sb.append("\n TOPPINGS\n");
        for (Topping t : toppings) {
            sb.append(String.format("%-79s %-12d %-12.2f%n", t.getName(), t.getCalories(), t.getPrice()));
        }

        sb.append("\n=============================\n");
        sb.append("Coperto per persona : 2.50 ");
        sb.append("\n=============================\n");

        return sb.toString();
    }

}