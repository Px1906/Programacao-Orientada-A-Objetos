package av1.beecrowd.questao10;

public class Treinador {
    
    private String nome;
    public int nível;
    public int bonus;
    public Pokemon pokemon;

    Treinador(String nome, int nível) {
        this.nome = nome;
        this.nível = nível;
    }

    String getNome() {
        return nome;
    }

    int poderTotal() {
        if (nível % 2 == 0) {
            return pokemon.poder() + bonus;
        } else {
            return pokemon.poder();
        }
    }
}