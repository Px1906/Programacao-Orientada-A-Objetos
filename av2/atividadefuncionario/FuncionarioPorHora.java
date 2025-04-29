package av2.atividadefuncionario;

public class FuncionarioPorHora extends Funcionario {

    private int horasTrabalhadas;
    private double ganhoPorHora;
 
    public FuncionarioPorHora(String nome, String sobrenome, String PIN, int horasTrabalhadas, double ganhoPorHora) {
        super(nome, sobrenome, PIN);

        if(ganhoPorHora < 0) {
            throw new IllegalArgumentException("Ele tem que ganhar alguma coisa ne, digite novamente.");
        }
 
        if(horasTrabalhadas < 0) {
            throw new IllegalArgumentException("ELE NAO VOLTA NO TEMPO, digite um horario válido.");
        } else if (horasTrabalhadas > 168) {
            throw new IllegalArgumentException("e o caba vai endoida eh? digite um horario válido.");
        }
 
        this.ganhoPorHora = ganhoPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
 
    public void setGanhoPorHora(float ganhoPorHora) {
        this.ganhoPorHora = ganhoPorHora;
    }
 
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
 
    public double getGanhoPorHora() {
        return ganhoPorHora;
    }
 
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
 
    @Override
    public String toString() {
        return String.format("Nome: %s %s\nPIN: %s\nGanho por hora: %.2f reais\nHoras Trabalhadas: %s", getNome(), getSobrenome(), getPin(), getGanhoPorHora(), getHorasTrabalhadas());
    }

    @Override
    public double ganhos() {
        if(getHorasTrabalhadas() <= 40) {
            return getGanhoPorHora() * getHorasTrabalhadas();
        } else {
            return 40 * getGanhoPorHora() + (getHorasTrabalhadas() - 40) * getGanhoPorHora() * 1.5;
        }
    }
} 