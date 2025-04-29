package av1.beecrowd.questao2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner prompt = new Scanner(System.in);
        Lanche cliente = new Lanche();

        int comida = prompt.nextInt();
        int quantidade = prompt.nextInt();
        prompt.close();

        cliente.preco(comida , quantidade);
    }
}