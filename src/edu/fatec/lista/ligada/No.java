package edu.fatec.lista.ligada;

/**
 * Classe que controla um nó de elemento inteiro positivo
 */
public class No {

	public int dado;
	public No prox;

	/**
	 * @param int
	 *            e Elemento do nó
	 * 
	 */
	public No(int e) {
		dado = e;
		prox = null;
	}

}
