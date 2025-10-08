package christianbottini.Esercizi_6_10_2025;

import entities.Pizza;
import entities.Topping;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Test #2 - verifica prezzo totale pizza con topping

public class TestPizzaToppingsPriceTest {

    @Test
    void testPizzaWithToppingsPrice() {
        Pizza margherita = new Pizza("Pizza Margherita", 1000, new BigDecimal("4.99"));
        Topping prosciutto = new Topping("Prosciutto", 35, new BigDecimal("0.99"));
        Topping ananas = new Topping("Ananas", 24, new BigDecimal("0.79"));

        Pizza hawaiian = margherita.addTopping(prosciutto).addTopping(ananas);

        BigDecimal expected = new BigDecimal("4.99")
                .add(new BigDecimal("0.99"))
                .add(new BigDecimal("0.79"));

        assertEquals(0, hawaiian.getPrice().compareTo(expected));
    }
}

