package com.example;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
	private static Map<Integer, Funcionario> funcionarios = new HashMap<>();
	private static Set<Integer> codigosGerados = new HashSet<>();
	private static Random random = new Random();

	public static void main(String[] args) {
		while (true) {
			String opcao = JOptionPane.showInputDialog(null,
				"1. Cadastrar funcionário\n" +
				"2. Mostrar bônus mensal\n" +
				"3. Excluir funcionário\n" +
				"4. Alterar salário\n" +
				"5. Cadastrar dependentes\n" +
				"0. Sair", "Menu", JOptionPane.QUESTION_MESSAGE);

			if (opcao == null || opcao.equals("0")) break;

			try {
				switch (opcao) {
					case "1": cadastrarFuncionario(); break;
					case "2": mostrarBonus(); break;
					case "3": excluirFuncionario(); break;
					case "4": alterarSalario(); break;
					case "5": cadastrarDependentes(); break;
					default: JOptionPane.showMessageDialog(null, "Opção inválida.");
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
			}
		}
	}

	private static int gerarCodigoUnico() {
		int codigo;
		do {
			codigo = 1000 + random.nextInt(9000);
		} while (codigosGerados.contains(codigo));
		codigosGerados.add(codigo);
		return codigo;
	}

	private static void cadastrarFuncionario() {
		String nome = JOptionPane.showInputDialog("Nome:");
		String cpf = JOptionPane.showInputDialog("CPF:");
		String setor = JOptionPane.showInputDialog("Setor:");
		double pag = Double.parseDouble(JOptionPane.showInputDialog("Pagamento mensal:"));

		int codigo = gerarCodigoUnico();
		Funcionario f = new Funcionario(codigo, nome, cpf, setor, pag, 0);

		// Cadastro dos nomes dos dependentes
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos dependentes deseja cadastrar agora?"));
		for (int i = 0; i < qtd; i++) {
			String nomeDep = JOptionPane.showInputDialog("Nome do dependente " + (i + 1) + ":");
			f.adicionarDependente(nomeDep);
		}
		f.setDependentes(f.getNomesDependentes().size());

		funcionarios.put(codigo, f);
		JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!\nCódigo gerado: " + codigo);
	}

	private static void mostrarBonus() throws IOException {
		if (funcionarios.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado.");
			return;
		}

		StringBuilder sb = new StringBuilder();
		for (Funcionario f : funcionarios.values()) {
			sb.append("Nome: ").append(f.getNome()).append("\n")
				.append("Dependentes: ").append(f.getDependentes()).append("\n")
				.append("Bônus: R$ ").append(String.format("%.2f", f.bonus())).append("\n\n");
		}

		JTextArea textArea = new JTextArea(sb.toString());
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize(new java.awt.Dimension(400, 300));
		JOptionPane.showMessageDialog(null, scrollPane, "Bônus Mensal", JOptionPane.INFORMATION_MESSAGE);

		FileWriter writer = new FileWriter("bonus_mensal.txt");
		writer.write(sb.toString());
		writer.close();
	}

	private static void excluirFuncionario() {
		if (funcionarios.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado.");
			return;
		}

		StringBuilder lista = new StringBuilder("Funcionários cadastrados:\n\n");
		for (Funcionario f : funcionarios.values()) {
			lista.append("Código: ").append(f.getCodigo())
				.append(" - Nome: ").append(f.getNome()).append("\n");
		}
		JOptionPane.showMessageDialog(null, lista.toString());

		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionário a excluir:"));
		Funcionario f = funcionarios.remove(codigo);
		if (f == null) {
			JOptionPane.showMessageDialog(null, "Funcionário Inexistente");
			return;
		}
		codigosGerados.remove(codigo);
		JOptionPane.showMessageDialog(null, "Funcionário removido com sucesso.");
	}

	private static void alterarSalario() {
		if (funcionarios.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado.");
			return;
		}

		StringBuilder lista = new StringBuilder("Funcionários cadastrados:\n\n");
		for (Funcionario f : funcionarios.values()) {
			lista.append("Código: ").append(f.getCodigo())
				.append(" - Nome: ").append(f.getNome()).append("\n");
		}
		JOptionPane.showMessageDialog(null, lista.toString());

		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionário:"));
		Funcionario f = funcionarios.get(codigo);
		if (f == null) {
			JOptionPane.showMessageDialog(null, "Funcionário Inexistente");
			return;
		}

		double novoPag = Double.parseDouble(JOptionPane.showInputDialog("Novo pagamento mensal:"));
		f.setPag(novoPag);
		JOptionPane.showMessageDialog(null, "Pagamento atualizado com sucesso!");
	}

	private static void cadastrarDependentes() {
		if (funcionarios.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhum funcionário cadastrado.");
			return;
		}

		StringBuilder lista = new StringBuilder("Funcionários cadastrados:\n\n");
		for (Funcionario f : funcionarios.values()) {
			lista.append("Código: ").append(f.getCodigo())
				.append(" - Nome: ").append(f.getNome()).append("\n");
		}
		JOptionPane.showMessageDialog(null, lista.toString());

		int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do funcionário:"));
		Funcionario f = funcionarios.get(codigo);
		if (f == null) {
			JOptionPane.showMessageDialog(null, "Funcionário inexistente.");
			return;
		}

		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantos dependentes deseja cadastrar?"));
		for (int i = 0; i < qtd; i++) {
			String nomeDep = JOptionPane.showInputDialog("Nome do dependente " + (i + 1) + ":");
			f.adicionarDependente(nomeDep);
		}

		f.setDependentes(f.getNomesDependentes().size());
		JOptionPane.showMessageDialog(null, "Dependentes cadastrados com sucesso!");
	}
}
