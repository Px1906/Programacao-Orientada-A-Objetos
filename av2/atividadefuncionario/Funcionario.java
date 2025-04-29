package av2.atividadefuncionario;

public abstract class Funcionario {

    private final String nome;
    private final String sobrenome;
    private final String pin;
 
    public Funcionario(String nome, String sobrenome, String PIN) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.pin = PIN;
    }
 
    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getPin() {
        return pin;
    }
  
    @Override
    public String toString() {
        return String.format("%s %s\nPIN: %s", nome, sobrenome, pin);
    }
 
    public abstract double ganhos();
} 