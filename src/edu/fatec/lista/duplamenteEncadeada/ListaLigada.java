package edu.fatec.lista.duplamenteEncadeada;

/**
 *
 * @author p.azotovici
 */
public class ListaLigada {
	private No inicio, fim;

	public ListaLigada() {
		inicio = null;
		fim = null;
	}

	public boolean vazia() {
		return inicio == null;
	}

	public void adicionaInicio(int e) {
		if (vazia()) {
			inicio = new No(e);
			fim = inicio;
		} else {
			No novo = new No(e);
			novo.prox = inicio;
			inicio.ant = novo;
			inicio = novo;
		}
	}

	public int removeInicio() {
		int r = -1;

		if (vazia()) {
			System.out.println("ERRO! Lista Vazia");
		} else {
			r = inicio.dado;
			if (inicio == fim) {
				inicio = null;
				fim = null;
			} else {
				inicio = inicio.prox;
				inicio.ant = null;
			}
		}
		return r;
	}

	// public String percorre(){
	// No aux=fim;
	// String s = "";
	// while (aux != null){
	// s = s + " " + aux.dado;
	// aux=aux.ant;
	// }
	// return s;
	// }

	public String percorre() {
		String r = "";

		if (vazia()) {
			System.out.println("Lista Vazia");
		} else {
			r = percorre(inicio);
		}

		return r;
	}

	public String percorre(No aux) {
		if (aux == null) {
			return "";
		}

		return aux.dado + " " + percorre(aux.prox);
	}

	public void mostra() {
		if (vazia()) {
			System.out.println("Lista vazia");
		} else {
			mostra(inicio);
		}
	}

	public void mostra(No aux) {
		if (aux != null) {
			mostra(aux.prox);
			System.out.print(aux.dado + " ");

		}

	}

	public static void main(String args[]) {
		ListaLigada l = new ListaLigada();
		l.adicionaInicio(10);
		l.adicionaInicio(11);
		l.adicionaInicio(12);
		l.adicionaInicio(13);
		l.mostra();
		System.out.println("Tudo " + l.percorre(l.inicio));
		System.out.println("Removido " + l.removeInicio());
		System.out.println("Tudo " + l.percorre(l.inicio));
		System.out.println("Removido " + l.removeInicio());
		System.out.println("Removido " + l.removeInicio());
		System.out.println("Removido " + l.removeInicio());
		System.out.println("Removido " + l.removeInicio());
	}
}
