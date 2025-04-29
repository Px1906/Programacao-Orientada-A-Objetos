package av1.beecrowd.questao2;
public class Lanche {
    public void preco(int comida, int quantidade) {
        if(comida == 1) {
            System.out.printf("Total: R$%.2f\n" , (quantidade * 4.00));
        } else if(comida == 2) {
            System.out.printf("Total: R$%.2f\n" , (quantidade * 4.50));
        } else if(comida == 3) {
            System.out.printf("Total: R$%.2f\n" , (quantidade * 5.00));
        } else if(comida == 4) {
            System.out.printf("Total: R$%.2f\n" , (quantidade * 2.00));
        } else if (comida == 5) {
            System.out.printf("Total: R$%.2f\n" , (quantidade * 1.50));
        }
    }
}