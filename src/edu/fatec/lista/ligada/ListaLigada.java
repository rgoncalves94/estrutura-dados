package edu.fatec.lista.ligada;

/**
 * Classe que possui operações de uma lista simplesmente encadeada
 */
public class ListaLigada {
	private No inicio;

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
	public void adicionaInicio(int valor) {
		No novo = new No(valor);
		novo.prox = inicio;
		inicio = novo;
	}

	/**
	 * Metodo que adiciona um no com o novo elemento no inicio da lista
	 * 
	 * @param int
	 *            valor é o novo elemento
	 */
	public void adicionaFinal(int valor) {
		No novo = new No(valor);
		if (!vazia()) {
			No aux = inicio;
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
	public int removeInicio() {
		int r = -1;
		if (vazia())
			System.out.println("Erro! Lista vazia.");

		r = inicio.dado;
		inicio = inicio.prox;

		return r;
	}

	/**
	 * Metodo que remove o ultimo elemento
	 * 
	 * @param int
	 *            valor é o novo elemento
	 */
	public int removeFinal() {
		int r = -1;
		if (vazia()) {
			System.out.println("A lista nao pode estar vazia");
		} else {
			if (inicio.prox == null) {
				r = inicio.dado;
				inicio = null;
			} else {
				No aux = inicio;
				No aux2 = null;
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

		No aux = inicio;

		while (aux != null) {
			sb.append(" ");
			sb.append(aux.dado);
			aux = aux.prox;
		}
		return sb.toString();
	}

	public String somatoria() {
		int total = 0;
		No aux = inicio;
		while (aux != null) {
			total += aux.dado;
			aux = aux.prox;
		}
		return "A somatoria do nó é igual à: " + total;
	}

	/**
	 * Função de adição de elemento em uma posição informada.
	 * 
	 * @param e
	 *            elemento
	 * @param p
	 *            posição
	 */
	public void adiciona(int e, int p) {
		No novo = new No(e);
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
				No aux1 = inicio, aux2 = null;
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
