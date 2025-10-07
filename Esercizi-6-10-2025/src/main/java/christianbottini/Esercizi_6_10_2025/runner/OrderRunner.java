package christianbottini.Esercizi_6_10_2025.runner;

import entities.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.Arrays;

@Component
public class OrderRunner {

    private static final Logger logger = LoggerFactory.getLogger(OrderRunner.class);

    @Bean
    CommandLineRunner createOrder(Menu menu, @Value("${coperto.price}") BigDecimal prezzoCoperto) {
        return args -> {
            // Tavolo 3 persone
            Table tavolo = new Table(3, 4, TableStatus.OCCUPATO);

            // Elementi dell’ordine
            var elementi = Arrays.asList(
                    menu.getPizzas().get(0),
                    menu.getPizzas().get(1),
                    menu.getDrinks().get(0)
            );

            // Crea ordine
            Order ordine = new Order(1, OrderStatus.IN_CORSO, 3, tavolo, elementi, prezzoCoperto);

            logger.info("=== NUOVO ORDINE CREATO ===\n" + ordine);
        };
    }
}
