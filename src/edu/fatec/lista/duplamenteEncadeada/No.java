package edu.fatec.lista.duplamenteEncadeada;

/**
 *
 * @author p.azotovici
 */
public class No {
	public int dado;
	public No prox, ant;

	public No(int e) {
		dado = e;
		prox = null;
		ant = null;
	}
}
