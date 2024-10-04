import Builders.PizzaBuilder;
import Entidades.Pizza;
import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        String massa = "";
        String tamanho = "";
        String ingredientes = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tipo da massa: ");
        massa = sc.nextLine();

        System.out.println("Informe o tamanho: ");
        tamanho = sc.nextLine();

        System.out.println("Informe os ingredientes: ");
        ingredientes = sc.nextLine();

        montarPizza(massa, tamanho, ingredientes);
    }

    private static void montarPizza(String massa, String tamanho, String ingredientes){
        Pizza calabresa = new PizzaBuilder()
                .setMassa(massa)
                .setTamaho(tamanho)
                .addIngredientes(ingredientes)
                .build();

        System.out.println(calabresa.toString());
    }
}
