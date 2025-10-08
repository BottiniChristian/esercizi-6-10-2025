package christianbottini.Esercizi_6_10_2025;

import entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class MenuConfig {

    //Toppings
    @Bean public Topping formaggio() { return new Topping("Formaggio",   92,  new BigDecimal("0.69")); }
    @Bean public Topping prosciutto()      { return new Topping("Prosciutto",      35,  new BigDecimal("0.99")); }
    @Bean public Topping cipolla() { return new Topping("Cipolla",   22,  new BigDecimal("0.69")); }
    @Bean public Topping ananas(){ return new Topping("Ananas",24,  new BigDecimal("0.79")); }
    @Bean public Topping salame()   { return new Topping("Salame",   86,  new BigDecimal("0.99")); }
    @Bean public Topping basilico()   { return new Topping("Basilico",   6,  new BigDecimal("0.19")); }


    //Bevande
    @Bean public Drink cocacola() { return new Drink("CocaCola (0.33l)", 128, new BigDecimal("1.99")); }
    @Bean public Drink water()    { return new Drink("Acqua (0.5l)",       0, new BigDecimal("1.29")); }
    @Bean public Drink wine()     { return new Drink("Vino (0.75l, 13%)", 607, new BigDecimal("7.49")); }
    @Bean public Drink sprite()    { return new Drink("Sprite (0.33l)",       120, new BigDecimal("1.99")); }
    @Bean public Drink caffe()     { return new Drink("Caffe ", 100, new BigDecimal("1.00")); }

    //Pizze
    @Bean
    public Pizza margherita() {
        return new Pizza("Pizza Margherita (pomodoro, formaggio, basilico)", 1000, new BigDecimal("4.99"));
    }

    @Bean
    public Pizza hawaiian(Topping prosciutto, Topping ananas) {
        return new Pizza("Pizza Margherita (pomodoro, formaggio, basilico)", 1000, new BigDecimal("4.99"))
                .addTopping(prosciutto).addTopping(ananas)
                .named("Pizza Hawaiian (pomodoro, formaggio, basilico, prosciutto, ananas)");
    }

    @Bean
    public Pizza salamePizza(Topping salame) {
        return new Pizza("Pizza Margherita (pomodoro, formaggio, basilico)", 1000, new BigDecimal("4.99"))
                .addTopping(salame)
                .named("Pizza al Salame (pomodoro, cheese, basilico, salame)");
    }

    @Bean
    public Pizza quattroFormaggi(Topping formaggio) {
        return new Pizza("Pizza Margherita (pomodoro, formaggio, basilico)", 1104, new BigDecimal("4.99"))
                .addTopping(formaggio)
                .addTopping(formaggio)
                .named("Pizza 4 Formaggi (pomodoro, mix di formaggi, basilico)");
    }

    @Bean
    public Pizza prosciuttoFunghi(Topping prosciutto, Topping cipolla) {
        return new Pizza("Pizza Margherita (pomodoro, formaggio, basilico)", 1104, new BigDecimal("4.99"))
                .addTopping(prosciutto)
                .addTopping(cipolla)
                .named("Pizza Prosciutto e Funghi (pomodoro, formaggio, basilico, proscitto, cipolla)");
    }

    @Bean
    public Pizza vegetariana(Topping cipolla, Topping ananas) {
        return new Pizza("Pizza Margherita (pomodoro, formaggio, basilico)", 1104, new BigDecimal("4.99"))
                .addTopping(cipolla)
                .addTopping(ananas)
                .named("Pizza Vegetariana (pomodoro, formaggio, basilico, cipolla, ananas)");
    }

    //Menu
    @Bean
    public Menu menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        return new Menu(pizzas, drinks, toppings);
    }
}