package christianbottini.Esercizi_6_10_2025;

import entities.Menu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.math.BigDecimal;

@Slf4j
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args)) {
            Menu menu = ctx.getBean(Menu.class);

            //legge la proprietà coperto.price ed eventualmente fallback
            String copertoStr = ctx.getEnvironment().getProperty("coperto.price", "2.50");
            BigDecimal copertoPrice = new BigDecimal(copertoStr);

            //stampa formattata con il coperto
            System.out.println(menu.prettyPrint(copertoPrice));
        }
    }
}