package christianbottini.Esercizi_6_10_2025;

import entities.Pizza;
import entities.Topping;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Test #3 - verifica calorie totali pizza con topping

public class TestPizzaCaloriesTest {

    @Test
    void testPizzaWithToppingsCalories() {
        Pizza margherita = new Pizza("Pizza Margherita", 1000, new BigDecimal("4.99"));
        Topping prosciutto = new Topping("Prosciutto", 35, new BigDecimal("0.99"));
        Topping ananas = new Topping("Ananas", 24, new BigDecimal("0.79"));

        Pizza hawaiian = margherita.addTopping(prosciutto).addTopping(ananas);

        assertEquals(1059, hawaiian.getCalories());
    }
}
