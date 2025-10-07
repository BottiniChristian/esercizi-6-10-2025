package entities;

import java.math.BigDecimal;

public class Drink implements Item {
    private final String name;
    private final int calories;
    private final BigDecimal price;

    public Drink(String name, int calories, BigDecimal price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override public String getName() {
        return name;
    }

    public int getCalories() { return calories; }

    @Override public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%-40s %10d %10.2f€", name, calories, price);
    }
}