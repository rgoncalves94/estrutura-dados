package edu.fatec.tela;

import javax.swing.JOptionPane;

import edu.fatec.fila.circular.FilaCircularString;

public class TelaFilaCircular {
	public static void main(String[] args) {
		FilaCircularString fila = new FilaCircularString();

		int opcao = 1;

		while (opcao != 0) {
			StringBuffer sb = new StringBuffer();
			sb.append("Escolha uma das opções abaixo:\n");
			sb.append("1) Adicionar um texto na fila circular;\n");
			sb.append("2) Adicionar remover um texto da fila circular;\n");
			sb.append("3) Mostrar textos;\n");
			sb.append("0) Sair do Programa.\n");
			sb.append("\n");
			sb.append("Selecione:");

			opcao = Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
			int aceitacao = -1;
			String elem = "";
			switch (opcao) {
			case 1:
				elem = JOptionPane.showInputDialog("Digite um Texto: ");

				fila.adiciona(elem);
				break;
			case 2:
				aceitacao = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja remover?");
				if (aceitacao == 0)
					if ((elem = fila.remove()) instanceof String)
						JOptionPane.showMessageDialog(null, "Texto removido com sucesso");

				break;
			case 3:
				JOptionPane.showMessageDialog(null, fila.percorre());
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
