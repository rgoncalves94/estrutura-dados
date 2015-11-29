package edu.fatec.pilha;

public class PilhaDePilhas {

	private int tamanho;
	private PilhaString[] dados;

	public PilhaDePilhas() {
		this(2);
	}

	public PilhaDePilhas(int capacidade) {
		dados = new PilhaString[capacidade];
	}

	public void adiciona(PilhaString elemento) {
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

	public PilhaString remove() {
		if (filaVazia()) {
			PilhaString removido = this.dados[0];

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
			sb.append(dados[i].toString());
			sb.append("\n");
		}
		return sb.toString();
	}

	// Metodos de Manipulação de cada estrutura;

	/**
	 * Metodo que executa o adiciona() de um dos valores da pilha de pilhas
	 * 
	 * @param posicao
	 * @return String
	 */
	public void adicionarEmEstrutura(int posicao, String valor) {
		dados[posicao].adiciona(valor);
	}

	/**
	 * Metodo que executa o remove() de um dos valores da pilha de pilhas
	 * 
	 * @param posicao
	 * @return String
	 */
	public String removeEmEstrutura(int posicao) {
		return dados[posicao].remove();
	}

	/**
	 * Metodo que executa o percorre() de um dos valores da pilha de pilhas
	 * 
	 * @param posicao
	 * @return String
	 */
	public String percorreEmEstrutura(int posicao) {
		return dados[posicao].percorre();
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
