package com.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Empregado {

    private String nome;
    private String cargo;
    private String id;
    private double salario;
    private double bonus;
    private ArrayList<Dependente> dependentes;

    public Empregado(String nome, String cargo, String id, double salario) {
        try {
            if (salario < 0) {
                throw new IllegalArgumentException("O salário não pode ser negativo.");
            }
        } catch (IllegalArgumentException e) {
                System.err.println(e);
            }
        this.nome = nome;
        this.cargo = cargo;
        this.id = id;
        this.salario = salario;
        this.dependentes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        try {
            if (salario < 0) {
                throw new IllegalArgumentException("O salário não pode ser negativo.");
            }
        } catch (IllegalArgumentException e) {
                System.err.println(e);
            }
        
        this.salario = salario;
    }

    public ArrayList<Dependente> getDependentes() {
        return dependentes;
    }

    public void setDependentes(ArrayList<Dependente> dependentes) {
        this.dependentes = dependentes;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public String toString() {
        return "Empregado{" + "nome='" + nome + '\'' + ", cargo='" + cargo + '\'' + ", id='" + id + '\'' + ", salario=" + salario + '}';
    }

    public void adicionarDependente(String dependente) {
        dependentes.add(new Dependente(dependente));
    }

    public void aplicarBonus() {
        try {
            if(this.dependentes.size() == 0) {
                throw new IllegalArgumentException("Esse funcionário não tem dependentes");
            } 
        } catch(IllegalArgumentException e) {
            System.out.println(e);
        }

        this.bonus = getSalario() * (0.02 * dependentes.size());
    }

    public void arquivarEmpregado(String filePath) {
        try (FileWriter escrever = new FileWriter(filePath, true)) {
            escrever.write(this.toString() + System.lineSeparator());
        } catch (IOException e) {
            System.err.println("Erro ao arquivar empregado: " + e.getMessage());
        }
    }
}
