package av1.beecrowd.questao3;

public class gabarito {
    public char alternativa(int i) {
        switch(i) {
            case 0:
                return 'A';
            case 1:
                return 'B';
            case 2:
                return 'C';
            case 3:
                return 'D';
            case 4:
                return 'E';
            default:
                return 'X';
        }
    }

    public void item(int[] questao) {
        int contagem = 0;
        char marcou = 'X';
        for(int i = 0;i < questao.length;i++) {
            if(questao[i] <= 127) {
                marcou = alternativa(i);
                contagem++;
            }
        }
        if(contagem == 1) {
            System.out.println(marcou);
        } else {
            System.out.println("*");
        }
    }
}
