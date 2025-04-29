package av1.avf1.questão1;
public class Pessoa {
    
    private String nome;
    private String naturalidade;
    private int anoNacimento;
    
    void Construtor(String nome, String naturalidade, int idade) {
        this.nome = nome;
        this.naturalidade = naturalidade;
        this.anoNacimento = idade;
    }

    int idademeses(int anoNascimento, int anoAtual) {
        return (anoAtual - anoNascimento) * 12;
    }

    int idade2050(int anoNascimento) {
        return 2050 - anoNascimento;
    }

    void exibir() {
        System.out.println(nome);
        System.out.println(anoNacimento);
        System.out.println(naturalidade);
        System.out.println(idademeses(anoNacimento, 2025));
        System.out.println(idade2050(anoNacimento));
    }
}