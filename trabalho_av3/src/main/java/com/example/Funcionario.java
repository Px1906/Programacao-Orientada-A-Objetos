package com.example;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	protected int codigo;
	protected String nome;
	protected String cpf;
	protected String setor;
	protected double pag;
	protected int dependentes;
	private List<String> nomesDependentes = new ArrayList<>();

	public Funcionario(int codigo, String nome, String cpf, String setor, double pag, int dependentes) {
		if (pag < 0) {
			throw new IllegalArgumentException("Pagamento não pode ser <= 0");
		}
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.setor = setor;
		this.pag = pag;
		this.dependentes = dependentes;
	}

	// Getters
	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSetor() {
		return setor;
	}

	public double getPag() {
		return pag;
	}

	public int getDependentes() {
		return dependentes;
	}

	public List<String> getNomesDependentes() {
		return nomesDependentes;
	}

	// Setters
	public void setPag(double pag) {
		if (pag < 0) {
			throw new IllegalArgumentException("Pagamento não pode ser <= 0");
		}
		this.pag = pag;
	}

	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}

	// Métodos
	public void adicionarDependente(String nome) {
		if (nome != null && !nome.trim().isEmpty()) {
			nomesDependentes.add(nome);
		}
	}

	public double bonus() {
		return pag * dependentes * 0.02;
	}
}
