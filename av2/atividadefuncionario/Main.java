package av2.atividadefuncionario;

public class Main {
    public static void main(String[] args) {

        FuncionarioAssalariado Sergio = new FuncionarioAssalariado("Sergio", "de Paiva Ximenes Filho", "19062006", 5000);
        System.out.println(Sergio);

        FuncionarioComissionado Joao = new FuncionarioComissionado("Joao", "Gabriel Melo Landim", "15081990", 0.1, 2000);
        System.out.println(Joao + "\n");

        FuncionarioPorHora Arthur = new FuncionarioPorHora("Arthur", "Paiva", "01011995", 50, 160);
        System.out.println(Arthur);

        FuncionarioAssalariadoComComissao Jose = new FuncionarioAssalariadoComComissao("Jose", "Samuel Guerra", "25051985", 3000, 0.05, 10000);
        System.out.println(Jose);
 	}
}