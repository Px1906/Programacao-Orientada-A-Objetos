package av1.beecrowd.questao9;
import java.util.Scanner;

public class Jogo {
    
    int Njogos, Num1, Num2, Numero;
    String Jogador1, Jogador2, escolha1, escolha2;
    Scanner input = new Scanner(System.in);
    
    void iniciarJogo() {
        int i;
        Njogos = input.nextInt();
        input.nextLine(); // Consumir linha
        
        for(i = 0; i < Njogos+1; i++) {
            Jogador1 = input.next();
            escolha1 = input.next();
            Jogador2 = input.next();
            escolha2 = input.next();
            Num1 = input.nextInt();
            Num2 = input.nextInt();
            Numero = Num1 + Num2;
            jogar();
        }
    }

    void jogar() {
        if(Numero % 2 == 0){
            if (escolha1.equals("PAR")) {
                System.out.println("*" + Jogador1);
            } else {
                System.out.println("*"+ Jogador2);
            }
        } else {
            if (escolha1.equals("IMPAR")) {
                System.out.println("*" + Jogador1);
            } else {
                System.out.println("*" + Jogador2);
            }
            
        }
    }
}
