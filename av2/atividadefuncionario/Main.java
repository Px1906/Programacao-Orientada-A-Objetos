package av2.atividadefuncionario;

public class Main {
    public static void main(String[] args) {

        System.out.println("Funcionarios processados individualmente:\n\n");

        FuncionarioAssalariado Sergio = new FuncionarioAssalariado("Sergio", "de Paiva Ximenes Filho", "19062006", 5000);
            System.out.println(String.format("%s\nGanhos: %.2f reais\n", Sergio, Sergio.ganhos()));
        FuncionarioComissionado Joao = new FuncionarioComissionado("Joao", "Gabriel Melo Landim", "15081990", 0.1, 2000);
            System.out.println(String.format("%s\nGanhos: %.2f reais\n", Joao, Joao.ganhos()));
        FuncionarioPorHora Arthur = new FuncionarioPorHora("Arthur", "Paiva", "01011995", 50, 160);
            System.out.println(String.format("%s\nGanhos: %.2f reais\n", Arthur, Arthur.ganhos()));
        FuncionarioAssalariadoComComissao Jose = new FuncionarioAssalariadoComComissao("Jose", "Samuel Guerra", "25051985", 3000, 0.05, 10000);
            System.out.println(String.format("%s\nGanhos: %.2f reais\n", Jose, Jose.ganhos()));

        System.out.println("Funcionarios processados de forma polimórfica:\n\n");

        Funcionario[] FUNCIONARIOS = new Funcionario[4];
        
        FUNCIONARIOS[0] = Sergio;
        FUNCIONARIOS[1] = Joao;
        FUNCIONARIOS[2] = Arthur;
        FUNCIONARIOS[3] = Jose;

        for(Funcionario amigos : FUNCIONARIOS) {
            
            System.out.println(amigos);

            if(amigos instanceof FuncionarioAssalariadoComComissao) {
                FuncionarioAssalariadoComComissao amigo = (FuncionarioAssalariadoComComissao) amigos;
                amigo.setSalarioBase(1.1 * amigo.getSalarioBase());
                System.out.println(String.format("Novo salário base depois do aumento de 10%%: %.2f", amigo.getSalarioBase()));
            }

            System.out.println(String.format("Ganhou: %.2f$\n", amigos.ganhos()));
        }

        for(int j = 0; j < FUNCIONARIOS.length; j++) {
            System.out.println(String.format("Funcionario %d é um %s", j, FUNCIONARIOS[j].getClass().getName()));
        }
 	}   
}