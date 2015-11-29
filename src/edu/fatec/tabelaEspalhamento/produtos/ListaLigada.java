package edu.fatec.tabelaEspalhamento.produtos;

/**
 * Classe que possui operações de uma lista simplesmente encadeada
 */
public class ListaLigada {
	private NoProduto inicio;

	/**
	 * Construtor
	 */
	public ListaLigada() {
		inicio = null;
	}

	/**
	 * Método que verifica se a lista esta vazia
	 * 
	 * @return int e lista esta vazia retorna true caso contrario retorna false
	 */

	public boolean vazia() {
		return inicio == null;
	}

	/**
	 * Metodo que adiciona um no com o novo elemento no inicio da lista
	 * 
	 * @param int
	 *            valor é o novo elemento
	 */
	public void adicionaInicio(Produto valor) {
		NoProduto novo = new NoProduto(valor);
		novo.prox = inicio;
		inicio = novo;
	}

	/**
	 * Metodo que adiciona um no com o novo elemento no inicio da lista
	 * 
	 * @param int
	 *            valor é o novo elemento
	 */
	public void adicionaFinal(Produto valor) {
		NoProduto novo = new NoProduto(valor);
		if (!vazia()) {
			NoProduto aux = inicio;
			while (aux.prox != null) {
				aux = aux.prox;
			}

			aux.prox = novo;
		} else {
			inicio = novo;
		}
	}

	/**
	 * Método que remove o primeiro elemento da lista
	 * 
	 * @return int retorna o elemento removido
	 */
	public Produto removeInicio() {
		Produto r = null;
		if (vazia())
			System.out.println("Erro! Lista vazia.");

		r = inicio.dado;
		inicio = inicio.prox;

		return r;
	}

	public Produto remove(int codigo) {
		Produto p = null;
		NoProduto aux1 = inicio, aux2 = inicio;
		if (inicio == null) {
			System.out.println("Erro! Lista Vazia");
		} else if (inicio.prox == null) {
			if (inicio.dado.getCodigo() == codigo) {
				p = inicio.dado;
				inicio = null;
			}
		} else {
			while (aux1.prox != null && aux1.dado.getCodigo() != codigo) {
				aux2 = aux1;
				aux1 = aux1.prox;
			}
			if (aux1.dado.getCodigo() == codigo) {
				p = aux1.dado;
				aux2.prox = aux1.prox;
			}
		}
		return p;
	}

	/**
	 * Metodo que remove o ultimo elemento
	 * 
	 * @param int
	 *            valor é o novo elemento
	 */
	public Produto removeFinal() {
		Produto r = null;
		if (vazia()) {
			System.out.println("A lista nao pode estar vazia");
		} else {
			if (inicio.prox == null) {
				r = inicio.dado;
				inicio = null;
			} else {
				NoProduto aux = inicio;
				NoProduto aux2 = null;
				while (aux.prox != null) {
					aux2 = aux;
					aux = aux.prox;
				}

				r = aux.dado;

				aux2.prox = null;
			}
		}
		return r;
	}

	public String percorre() {
		StringBuffer sb = new StringBuffer();

		NoProduto aux = inicio;

		while (aux != null) {
			sb.append(" ");
			sb.append(aux.dado.toString());
			aux = aux.prox;
		}
		return sb.toString();
	}

	/**
	 * Função de adição de elemento em uma posição informada.
	 * 
	 * @param e
	 *            elemento
	 * @param p
	 *            posição
	 */
	public void adiciona(Produto e, int p) {
		NoProduto novo = new NoProduto(e);
		int c = 1;

		if (vazia()) {
			if (p == 1) {
				inicio = novo;
			} else {
				System.out.println("Posição inválida");
			}
		} else {
			if (p == 1) {
				// adiciona no inicio
				novo.prox = inicio;
				inicio = novo;
			} else {
				NoProduto aux1 = inicio, aux2 = null;
				while (aux1.prox != null && c < p) {
					aux2 = aux1;
					aux1 = aux1.prox;
					c = c + 1;
				}

				if (aux1.prox == null) {
					if (c == p - 1) {
						// adiciona no final
						aux1.prox = novo;
					} else if (c == p) {
						novo.prox = aux1;
						aux2.prox = novo;
					} else {

						System.out.println("Erro! Posição inválida");
					}
				} else {
					novo.prox = aux1;
					aux2.prox = novo;
				}
			}
		}
	}
}
