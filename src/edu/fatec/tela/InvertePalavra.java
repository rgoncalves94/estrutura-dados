package edu.fatec.tela;

import javax.swing.JOptionPane;

import edu.fatec.pilha.PilhaChar;

public class InvertePalavra {

	public static void main(String[] args) {
		PilhaChar pilha = new PilhaChar();

		String palavra = JOptionPane.showInputDialog("Digite a palavra a ser invertida: ");

		for (int i = 0; i < palavra.length(); i++) {
			pilha.adiciona(palavra.charAt(i));
		}

		char elem[] = new char[palavra.length()];
		for (int i = 0; i < palavra.length(); i++) {
			elem[i] = pilha.remove();
		}

		String palavraInvertida = new String(elem);

		JOptionPane.showMessageDialog(null, "Invertendo a palavra, se origina: " + palavraInvertida);

	}
}
