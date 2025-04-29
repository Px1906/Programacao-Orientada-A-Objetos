package av1.beecrowd.questao10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, valorBonus, nPartidas = input.nextInt();

        interacoes jogo = new interacoes();
        Treinador A = new Treinador ("Dabriel", 0);
        Treinador B = new Treinador ("Guarte", 0);

        for (i = 0; i < nPartidas; i++) {
            
            valorBonus = input.nextInt();

            A.pokemon = new Pokemon(input.nextInt(), input.nextInt());
            A.nível = input.nextInt();
            
            B.pokemon = new Pokemon(input.nextInt(), input.nextInt());
            B.nível = input.nextInt();
            
            A.bonus = valorBonus;
            B.bonus = valorBonus;
            
            jogo.batalha(A,B);
        }
    }
}