package edu.fatec.fila;

import edu.fatec.model.Aluno;

public class FilaAlunos {

	private Aluno dados[];
	private int tamanho;

	public FilaAlunos(int capacidade) {
		dados = new Aluno[capacidade];
		tamanho = 0;
	}

	public void adiciona(Aluno elemento) {
		if (listaCheia()) {
			for (int i = tamanho; i > 0; i--) {
				dados[i] = dados[i - 1];
			}
			dados[0] = elemento;
			tamanho++;
		} else {
			System.out.println("Lista Cheia");
		}
	}

	public Aluno remove() {
		Aluno elemento = null;
		if (listaVazia()) {
			elemento = dados[tamanho - 1];
			dados[tamanho - 1] = null;
			tamanho--;
		} else {
			System.out.println("Lista Vazia");
		}
		return elemento;
	}

	public String percorre() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < tamanho; i++) {
			sb.append("Índice(");
			sb.append(i);
			sb.append("): ");
			sb.append(dados[i].toString());
			if (!(i == tamanho - 1)) {
				sb.append(", ");
			}
		}
		return sb.toString();
	}

	private boolean listaCheia() {
		if (tamanho == dados.length) {
			return false;
		}
		return true;
	}

	private boolean listaVazia() {
		if (tamanho == 0) {
			return false;
		}
		return true;
	}
}
