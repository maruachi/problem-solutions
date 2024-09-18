package org.example._20240917_builder_pattern;

public class PizzaMain {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION)
                .build();

        System.out.println("nyPizza = " + nyPizza);
    }
}
