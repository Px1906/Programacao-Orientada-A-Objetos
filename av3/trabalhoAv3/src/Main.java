import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Empregado teste = new Empregado("Silva", "Fodao", "2314", 3500.0);
        Empregado teste2 = new Empregado("Silva", "Fodinha", "1234", 3500.0);

        teste.criarArquivo();
        teste2.criarArquivo();

        teste.deletarArquivo();
        teste2.deletarArquivo();

        System.out.println(teste.Arquivo());
    }
}