package edu.fatec.tela;

import javax.swing.JOptionPane;

import edu.fatec.pilha.PilhaDePilhas;
import edu.fatec.pilha.PilhaString;

public class DuasPilhas {

	public static void main(String[] args) {
		PilhaDePilhas pilhas = new PilhaDePilhas();
		pilhas.adiciona(new PilhaString());
		pilhas.adiciona(new PilhaString());

		int opcao = 1;
		int pilha = 0;
		while (opcao != 0) {
			StringBuffer sb1 = new StringBuffer();
			sb1.append("Escolha uma das pilhas:\n");
			sb1.append("1) Primeira pilha;\n");
			sb1.append("2) Segunda Fila;\n");
			sb1.append("0) Sair do Programa.\n");
			sb1.append("\n");
			sb1.append("Selecione:");

			pilha = Integer.parseInt(JOptionPane.showInputDialog(sb1.toString())) - 1;

			StringBuffer sb = new StringBuffer();
			sb.append("Você está na pilha " + (pilha + 1) + "\n");
			sb.append("Escolha uma das opções abaixo:\n");
			sb.append("1) Adicionar uma String na pilha " + (pilha + 1) + ";\n");
			sb.append("2) Remover uma String da pilha " + (pilha + 1) + ";\n");
			sb.append("3) Mostrar Strings da pilha " + (pilha + 1) + ";\n");
			sb.append("0) Sair do Programa.\n");
			sb.append("\n");
			sb.append("Selecione:");

			opcao = Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
			int aceitacao = -1;
			String elemento = "";
			switch (opcao) {
			case 1:
				elemento = JOptionPane.showInputDialog("Digite o texto: ");

				pilhas.adicionarEmEstrutura(pilha, elemento);
				break;
			case 2:
				aceitacao = JOptionPane.showConfirmDialog(null,
						"Tem certeza de que deseja remover da pilha " + (pilha + 1) + "?");
				if (aceitacao == 0)
					if ((elemento = pilhas.removeEmEstrutura(pilha)) != null)
						JOptionPane.showMessageDialog(null, "String da pilha " + (pilha + 1) + " removido com sucesso");

				break;
			case 3:
				JOptionPane.showMessageDialog(null, pilhas.percorreEmEstrutura(pilha));
				break;
			case 0:
				JOptionPane.showMessageDialog(null, "O programa foi finalizado");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
