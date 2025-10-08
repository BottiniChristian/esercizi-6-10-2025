package entities;

import java.math.BigDecimal;

public interface MenuItem {
    String getName();
    int getCalories();
    BigDecimal getPrice();
}