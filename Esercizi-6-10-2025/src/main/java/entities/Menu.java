package entities;

import java.util.List;
import java.math.BigDecimal;

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

    public String prettyPrint(BigDecimal copertoPrice) {
        StringBuilder sb = new StringBuilder();
        sb.append("===== MENU DELLA PIZZERIA =====\n\n");

        sb.append(String.format("%-70s %12s %12s%n", "Name", "Calories", "Price"));
        sb.append("-".repeat(100)).append("\n");

        sb.append("\nPIZZAS\n");
        for (Pizza p : pizzas) {
            // price is BigDecimal -> format as double for display
            sb.append(String.format("%-70s %12d %12.2f%n",
                    p.getName(), p.getCalories(), p.getPrice()));
        }

        sb.append("\nDRINKS\n");
        for (Drink d : drinks) {
            sb.append(String.format("%-70s %12d %12.2f%n",
                    d.getName(), d.getCalories(), d.getPrice()));
        }

        sb.append("\nTOPPINGS\n");
        for (Topping t : toppings) {
            sb.append(String.format("%-70s %12d %12.2f%n",
                    t.getName(), t.getCalories(), t.getPrice()));
        }

        sb.append("\n").append("-".repeat(100)).append("\n");
        sb.append(String.format("Coperto per persona: €%.2f%n", copertoPrice));
        sb.append("================================\n");

        return sb.toString();
    }
}