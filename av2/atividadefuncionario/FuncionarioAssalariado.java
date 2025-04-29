package av2.atividadefuncionario;

public class FuncionarioAssalariado extends Funcionario {

    private double salarioSemanal;

    public FuncionarioAssalariado(String nome, String sobrenome, String PIN, double salarioSemanal) {

        super(nome,sobrenome, PIN);

        if (salarioSemanal < 0) {
            throw new IllegalArgumentException("O salario tem que ser maior que 0");
        }

        this.salarioSemanal = salarioSemanal;
    }

    public void setSalarioSemanal(double novoSalario) {
 
        if (novoSalario < 0) {
            throw new IllegalArgumentException("O salario tem que ser maior que 0");
        }
 
        this.salarioSemanal = novoSalario;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    @Override
    public String toString() {
        return String.format("Funcionario Assalariado: %s\nSalário Semanal: %.2f reais\n", super.toString(), getSalarioSemanal());
    }

   @Override
   public double ganhos() {
       return getSalarioSemanal();
   }
}
