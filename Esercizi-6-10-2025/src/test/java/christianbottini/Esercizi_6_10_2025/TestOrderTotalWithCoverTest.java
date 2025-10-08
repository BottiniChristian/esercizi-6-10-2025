package christianbottini.Esercizi_6_10_2025;

import entities.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

//Test #4 - verifica calcolo prezzo totale ordine con coperto
public class TestOrderTotalWithCoverTest {

    @Test
    void testTotaleOrdineConCoperto() {
        Pizza margherita = new Pizza("Pizza Margherita", 1000, new BigDecimal("4.99"));
        Drink cocaCola = new Drink("CocaCola", 128, new BigDecimal("1.29"));

        Table tavolo1 = new Table(1, 4, TableStatus.OCCUPATO);

        List<Item> elementi = new ArrayList<>();
        elementi.add(margherita);
        elementi.add(cocaCola);

        Order ordine = new Order(1, OrderStatus.IN_CORSO, 2, tavolo1, elementi, new BigDecimal("2.00"));

        //prezzo totale: 4.99 + 1.29 + (2 * 2.00) = 10.28
        BigDecimal expectedTotal = new BigDecimal("10.28");

        assertEquals(0, ordine.getTotale().compareTo(expectedTotal));
    }
}

