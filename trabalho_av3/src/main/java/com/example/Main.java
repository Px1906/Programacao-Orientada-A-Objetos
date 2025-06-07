package com.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String filePath = "D:\\Unifor\\POO\\trabalho_av3\\src\\main\\java\\com\\example\\Memória.txt";
        Scanner input = new Scanner(System.in);
        
        File arquivo = new File(filePath);
        if(arquivo.exists()) {
            System.out.printf("Esse arquivo já existe\nReescrever arquivo? S/N: ");
            try {
                String resp = input.nextLine();
                if (resp.equalsIgnoreCase("S")) {
                    try (FileWriter criador = new FileWriter(filePath)) {
                        criador.write("");
                    } catch (IOException e) {
                        System.out.println("Erro ao criar o arquivo: " + e.getMessage());
                    }
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida.");
                input.nextLine();
            }
        }
    }
}
