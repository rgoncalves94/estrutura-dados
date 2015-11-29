package edu.fatec.pilha;

public class PilhaChar {

	private int tamanho = 0;
	private char dados[];

	public PilhaChar() {
		this(10);
	}

	public PilhaChar(int capacidade) {
		dados = new char[capacidade];
	}

	public void adiciona(char elemento) {
		if (this.filaCheia()) {
			for (int i = tamanho; i > 0; i--) {
				dados[i] = dados[i - 1];
			}
			dados[0] = elemento;
			tamanho++;
		} else {
			System.out.println("A Lista está cheia.");
		}
	}

	public char remove() {
		if (filaVazia()) {
			char removido = this.dados[0];

			for (int i = 0; i < this.tamanho - 1; i++) {
				this.dados[i] = this.dados[i + 1];
			}

			this.tamanho--;
			return removido;
		}
		return 0;

	}

	public String percorre() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < tamanho; i++) {
			sb.append("Índice(");
			sb.append(i);
			sb.append("): ");
			sb.append(dados[i]);
			if (!(i == tamanho - 1)) {
				sb.append(", ");
			}
		}
		return sb.toString();
	}

	private boolean filaCheia() {
		boolean status = true;
		if (this.tamanho >= this.dados.length) {
			status = false;
		}

		return status;
	}

	private boolean filaVazia() {
		boolean status = true;
		if (this.tamanho == 0) {
			System.out.println("Não é possivel remover quando a fila esta vazia.");
			status = false;
		}

		return status;
	}
}
