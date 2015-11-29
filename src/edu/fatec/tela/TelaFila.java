package edu.fatec.tela;

import javax.swing.JOptionPane;

import edu.fatec.fila.FilaAlunos;
import edu.fatec.model.Aluno;

public class TelaFila {

	public static void main(String[] args) {
		FilaAlunos fila = new FilaAlunos(30);

		int opcao = 1;

		while (opcao != 0) {
			StringBuffer sb = new StringBuffer();
			sb.append("Escolha uma das opções abaixo:\n");
			sb.append("1) Adicionar um aluno na fila;\n");
			sb.append("2) Adicionar remover um aluno da fila;\n");
			sb.append("3) Mostrar alunos;\n");
			sb.append("0) Sair do Programa.\n");
			sb.append("\n");
			sb.append("Selecione:");

			opcao = Integer.parseInt(JOptionPane.showInputDialog(sb.toString()));
			int aceitacao = -1, posicao = 0, ra = 0;
			Aluno elemento = new Aluno("", "");
			String nome = "";
			switch (opcao) {
			case 1:
				elemento.setNome(JOptionPane.showInputDialog("Digite o Nome do Aluno"));
				elemento.setRa((JOptionPane.showInputDialog("Digite o RA do Aluno")));

				fila.adiciona(elemento);
				// JOptionPane.showMessageDialog(null, "Aluno adicionado com
				// sucesso");
				break;
			case 2:
				aceitacao = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja remover?");
				if (aceitacao == 0)
					if ((elemento = fila.remove()) instanceof Aluno)
						JOptionPane.showMessageDialog(null, "Aluno removido com sucesso");

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
