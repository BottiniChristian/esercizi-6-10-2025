package christianbottini.Esercizi_6_10_2025;

import entities.Pizza;
import entities.Topping;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Test #5 - parametrico: verifica prezzo pizza con topping moltiplicato

public class TestMultipleToppingsParamTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void testMultipleToppingsPrice(int count) {
        Pizza base = new Pizza("Pizza Base", 900, new BigDecimal("4.00"));
        Topping prosciutto = new Topping("Prosciutto", 35, new BigDecimal("0.99"));

        for (int i = 0; i < count; i++) {
            base.addTopping(prosciutto);
        }

        BigDecimal expected = new BigDecimal("4.00")
                .add(new BigDecimal("0.99").multiply(BigDecimal.valueOf(count)));

        assertEquals(0, base.getPrice().compareTo(expected));
    }
}
