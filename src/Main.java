import Builders.PizzaBuilder;
import Entidades.Pizza;

public class Main {
    public static void main(String[] args) {
     montarPizza();
    }

    private static void montarPizza(){
        Pizza calabresa = new PizzaBuilder()
                .setMassa("Fina")
                .setTamaho("G")
                .addIngredientes("Calabresa")
                .build();

        System.out.println(calabresa.toString());
    }
}
