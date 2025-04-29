package av1.beecrowd.questao8;

public class robo {

    int p;

    public void interpretar(String instrucao, String[] memoria) {
        //System.out.println("*" + instrucao);
        switch(instrucao) {
            case "LEFT":  
                p = p - 1;
                //System.out.println(p);
                break;
            case "RIGHT":
                p = p + 1;
                //System.out.println(p);
                break;
            default:
                instrucao = instrucao.substring(8);
                int index = Integer.parseInt(instrucao);
                interpretar(memoria[index - 1], memoria);
                break;
        }
    }
    
    public int leitor(String[] instrucoes) {
        int i;
        for(i=0;i<instrucoes.length;i++) {
            interpretar(instrucoes[i], instrucoes);
        }
        return p;
    }
}