package av2.atividadefuncionario;

public class FuncionarioComissionado extends Funcionario {

    private double taxaDeComissao;
    private double valorDasVendas;
 
    public FuncionarioComissionado(String nome, String sobrenome, String PIN, double taxaDeComissao, double valorDasVendas) {
        super(nome, sobrenome, PIN);

        if(taxaDeComissao < 0.0 || taxaDeComissao > 1.0) {
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
        return String.format("Funcionário Comissionado: %s\nTaxa da Comissão: %.0f%%\nValor das Vendas: %.2f", super.toString(), getTaxaDeComissao() * 100, getValorDasVendas());
    }

    @Override
    public double ganhos() {
        return getTaxaDeComissao() * getValorDasVendas();
    }
 } 