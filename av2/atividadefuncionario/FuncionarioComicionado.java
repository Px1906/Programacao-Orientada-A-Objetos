package av2.atividadefuncionario;

public class FuncionarioComicionado extends Funcionario {

    private double taxaDeComissao;
    private double valorDasVendas;
 
    public FuncionarioComicionado(String nome, String sobrenome, String PIN, double taxaDeComissao, double valorDasVendas) {
        super(nome, sobrenome, PIN);

        if(taxaDeComissao < 0 || taxaDeComissao > 1) {
            throw new IllegalArgumentException("insira uma taxa válida pufavo");
        } else if(valorDasVendas < 0) {
            throw new IllegalArgumentException("Insira o valor valido na moral");
        }
 
        this.taxaDeComissao = taxaDeComissao;
        this.valorDasVendas = valorDasVendas;
    }
 
    public void setTaxaDeComissao(double taxaDeComissao) {
        this.taxaDeComissao = taxaDeComissao;
    }
 
    public void setValorDasVendas(double valorDasVendas) {
        this.valorDasVendas = valorDasVendas;
    }
 
    public double getTaxaDeComissao() {
        return taxaDeComissao;
    }
 
    public double getValorDasVendas() {
        return valorDasVendas;
    }
 
    @Override
    public String toString() {
        return String.format("Nome: %s %s\nPIN: %s\nGanhos: %.2f", getNome(), getSobrenome(), getPin(), ganhos());
    }

    @Override
    public double ganhos() {
        return getTaxaDeComissao() * getValorDasVendas();
    }
 } 