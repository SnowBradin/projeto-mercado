import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SupermarketSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo Sistema do Mercado");
        System.out.println("Por favor, insira detalhes do item. Escreva 'sair' para sair.");

        try (FileWriter writer = new FileWriter("itens.txt", true)) {
            while (true) {
                System.out.print("Enter item name: ");
                String itemName = scanner.nextLine();
                if (itemName.equalsIgnoreCase("sair")) break;

                System.out.print("Preço do item: ");
                String itemPrice = scanner.nextLine();
                if (itemPrice.equalsIgnoreCase("sair")) break;

                writer.write("Item: " + itemName + ", Preço: " + itemPrice + "\n");
                System.out.println("Item adicionado com sucesso!\n");
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro na operação.");
            e.printStackTrace();
        }

        scanner.close();
        System.out.println("Até mais!");
    }
}
