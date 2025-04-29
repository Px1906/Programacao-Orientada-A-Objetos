package av1.beecrowd.questao10;

public class interacoes {
    
    public int poderA, poderB;
    public Treinador A,  B;


    public void batalha(Treinador A, Treinador B) {
        if (A.poderTotal() > B.poderTotal()) {
            System.out.println(A.getNome());
        } else if (A.poderTotal() < B.poderTotal()) {
            System.out.println(B.getNome());
        } else {
            System.out.println("Empate");
        }
    }
}
