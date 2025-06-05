package com.example;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "D:\\Unifor\\POO\\trabalho_av3\\src\\main\\java\\com\\example\\Memória.txt";
        
        File arquivo = new File(filePath);
        if(arquivo.exists()) {
            System.out.println("Esse arquivo já existe");
        } else {
            try (FileWriter criador = new FileWriter(filePath)) {
                criador.write("");
            } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
            }
        }

        Empregado teste1 = new Empregado("Joao Silva", "Analista", "12345", 3500.00);
        teste1.arquivarEmpregado(filePath);
    }
}