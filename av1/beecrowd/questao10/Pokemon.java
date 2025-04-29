package av1.beecrowd.questao10;

public class Pokemon {

    private int Ataque;
    private int Defesa;

    Pokemon(int Ataque, int Defesa) {
        this.Ataque = Ataque;
        this.Defesa = Defesa;
    }

    int poder() {
        return (Ataque + Defesa) / 2;
    }
}
