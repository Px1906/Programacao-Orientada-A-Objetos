package av2.atividadefuncionario;

public class FuncionarioAssalariadoComComissao extends FuncionarioComicionado {

    private double salarioBase;
 
    public FuncionarioAssalariadoComComissao(String nome, String sobrenome, String PIN, double salarioBase, double taxaDeComsisao, double valorDasVendas) {
        super(nome, sobrenome, PIN, taxaDeComsisao, valorDasVendas);

        if(salarioBase < 0) {
            throw new IllegalArgumentException("O cara nao vai pagar o patrão nao");
        }
 
        this.salarioBase = salarioBase;
    }
  
    public void setSalarioBase(double salarioBase) {
        if(salarioBase < 0) {
            throw new IllegalArgumentException("O cara nao vai pagar o patrão nao");
        }
 
        this.salarioBase = salarioBase;
    }
 
    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s %s\nPIN: %s\nGanhos: %.2f",getNome(), getSobrenome(), getPin());
    }

    @Override
    public double ganhos() {
        return getSalarioBase() + super.ganhos();
    }
 } 