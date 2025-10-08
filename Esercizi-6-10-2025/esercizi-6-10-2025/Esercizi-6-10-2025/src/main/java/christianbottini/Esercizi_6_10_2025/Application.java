package christianbottini.Esercizi_6_10_2025;

import entities.Menu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx =
                     SpringApplication.run(Application.class, args)) {
            Menu menu = ctx.getBean(Menu.class);
            log.info(menu.prettyPrint());
        }
    }
}
