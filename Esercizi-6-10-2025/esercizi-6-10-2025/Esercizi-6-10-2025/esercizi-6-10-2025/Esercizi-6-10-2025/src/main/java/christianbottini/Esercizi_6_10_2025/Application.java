package christianbottini.Esercizi_6_10_2025;

import entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        try (ConfigurableApplicationContext ctx =
                     SpringApplication.run(Application.class, args)) {
            Menu menu = ctx.getBean(Menu.class);
            System.out.println(menu.prettyPrint());
        }
    }
}
