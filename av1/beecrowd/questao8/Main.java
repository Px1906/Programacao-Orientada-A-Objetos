package av1.beecrowd.questao8;
import java.util.Scanner;

public class Main {
    public static void main(String[] agrs) {
        
        robo teste = new robo();
        Scanner input = new Scanner(System.in);
        
        int j, num;
        num = input.nextInt();
        for(j = 0; j < num; j++) {
            teste.p = 0;
            int n = input.nextInt(), i;
            String[] instrucoes = new String[n];
            input.nextLine();
            
            for(i=0;i<n;i++) {
                instrucoes[i] = input.nextLine();
            }

            //System.out.println(instrucoes.length);

            //for(i=0;i<instrucoes.length;i++) {
            //    System.out.println(instrucoes[i]);
            //}
            
            System.out.println(teste.leitor(instrucoes));
            input.close();
        }

    }
}