/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fatec.recursividade;

import javax.swing.JOptionPane;

/**
 *
 * @author tecnico
 */
public class Recursividade {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		if (valor > 0) {
			System.out.println("O valor do fatorial é: " + new Recursividade().fatorial(valor));
		}
	}

	public int fatorial(int n) {
		if (1 >= n) {
			return 1;
		} else {
			return n * fatorial(n - 1);
		}
	}
}
