package entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pizza implements Item {
    private final String baseName;
    private final BigDecimal basePrice;
    private final int baseCalories;
    private final List<Topping> toppings = new ArrayList<>();
    private String aliasName;

    public Pizza(String baseName, int baseCalories, BigDecimal basePrice) {
        this.baseName = baseName;
        this.baseCalories = baseCalories;
        this.basePrice = basePrice;
    }

    public Pizza addTopping(Topping topping) {
        toppings.add(topping);
        return this;
    }

    public Pizza named(String alias) {
        this.aliasName = alias;
        return this;
    }

    public List<Topping> getToppings() {
        return List.copyOf(toppings);
    }

    @Override
    public String getName() {
        if (aliasName != null && !aliasName.isBlank()) return aliasName;
        if (toppings.isEmpty()) return baseName;
        return baseName + " (" + toppings.stream().map(Topping::getName).reduce((a,b)->a+", "+b).orElse("") + ")";
    }

    public int getCalories() {
        return baseCalories + toppings.stream().mapToInt(Topping::getCalories).sum();
    }

    @Override
    public BigDecimal getPrice() {
        return basePrice.add(toppings.stream()
                .map(Topping::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add));
    }
}