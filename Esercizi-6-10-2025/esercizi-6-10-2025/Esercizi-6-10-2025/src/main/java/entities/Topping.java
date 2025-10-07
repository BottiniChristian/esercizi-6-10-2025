package entities;

import java.math.BigDecimal;

public class Topping {
    private final String name;
    private final int calories;
    private final BigDecimal price;

    public Topping(String name, int calories, BigDecimal price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public String getName() { return name; }
    public int getCalories() { return calories; }
    public BigDecimal getPrice() { return price; }

    @Override public String toString() { return name; }
}