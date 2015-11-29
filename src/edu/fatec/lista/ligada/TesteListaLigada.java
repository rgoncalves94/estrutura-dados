package edu.fatec.lista.ligada;

public class TesteListaLigada {
	public static void main(String[] args) {
		ListaLigada l = new ListaLigada();

		l.adicionaInicio(90);
		l.adicionaInicio(10);
		l.adicionaInicio(80);

		l.adicionaFinal(70);
		l.adicionaFinal(150);
		l.adicionaInicio(5);

		l.removeFinal();
		l.adicionaInicio(2000);
		l.adicionaFinal(3000);

		l.adiciona(10, 8);
		l.adiciona(333, 8);
		l.adiciona(333, 9);
		l.adiciona(333, 10);
		l.adiciona(333, 11);

		System.out.println(l.percorre());
		System.out.println(l.somatoria());
	}
}
