import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        float saldo;
        List<Item> listaDeItens=new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Digite o limite de credito: ");
        saldo=scanner.nextFloat();
        scanner.nextLine();
        while (true){
            String nome;
            float valor;
            System.out.println("Nome do produto: ");
            nome=scanner.nextLine();
            System.out.println("Valor da compra: ");
            valor=scanner.nextFloat();
            if(saldo<valor){
                System.out.println("Saldo insuficiente ;-; ");
                break;
            }
            saldo-=valor;
            var item=new Item(nome,valor);
            listaDeItens.add(item);
            System.out.println("Deseja comprar outro produto? [S/N]");
            if(scanner.nextLine().equals("S")){
                continue;
            } else if (scanner.nextLine().equals("N")) {
                break;
            }
            System.out.println("Comando Invalido");
        }
        ExibirCompras(listaDeItens);
        System.out.println("Saldo restante: "+saldo);
    }
    public static void ExibirCompras(List<Item> lista){
        Collections.sort(lista);
        System.out.println("*************************\n"+
                "Compras realizadas\n\n");
        for (Item item:lista) {
            System.out.printf(item.getNome() + " - " + item.getValor() + "%n", "%.2f");
        }
        System.out.println("*************************");
    }
}