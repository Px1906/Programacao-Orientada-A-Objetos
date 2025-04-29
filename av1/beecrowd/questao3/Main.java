package av1.beecrowd.questao3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int n = prompt.nextInt();
        while(n != 0){
            for(int j = 0;j < n; j++) {
                int questao[] = new int[5];
                for(int i = 0;i < questao.length;i++) {
                    questao[i] = prompt.nextInt();
                }
                gabarito sergio = new gabarito();
                sergio.item(questao);
            }
            n = prompt.nextInt();
        }
        prompt.close();  
    }
}
