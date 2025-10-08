package christianbottini.Esercizi_6_10_2025;

import entities.Pizza;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Test #1 - verifica nome della pizza base

public class TestPizzaNameTest {

    @Test
    void testPizzaName() {
        Pizza margherita = new Pizza("Pizza Margherita", 1000, new BigDecimal("4.99"));
        assertEquals("Pizza Margherita", margherita.getName());
    }
}





