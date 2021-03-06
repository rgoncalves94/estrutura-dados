package edu.fatec.pilha;

public class PilhaString {

	private int tamanho = 0;
	private String dados[];

	public PilhaString() {
		this(10);
	}

	public PilhaString(int capacidade) {
		dados = new String[capacidade];
	}

	public void adiciona(String elemento) {
		if (this.filaCheia()) {
			for (int i = tamanho; i > 0; i--) {
				dados[i] = dados[i - 1];
			}
			dados[0] = elemento;
			tamanho++;
		} else {
			System.out.println("A Lista est� cheia.");
		}
	}

	public String remove() {
		if (filaVazia()) {
			String removido = this.dados[0];

			for (int i = 0; i < this.tamanho - 1; i++) {
				this.dados[i] = this.dados[i + 1];
			}

			this.tamanho--;
			return removido;
		}
		return null;

	}

	public String percorre() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < tamanho; i++) {
			sb.append("�ndice(");
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
			System.out.println("N�o � possivel remover quando a fila esta vazia.");
			status = false;
		}

		return status;
	}
}
