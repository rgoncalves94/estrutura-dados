package edu.fatec.fila.circular;

public class FilaCircularString {

	private int fim;
	private int inicio;
	private String dados[];

	public FilaCircularString() {
		this(10);
	}

	public FilaCircularString(int capacidade) {
		fim = 0;
		inicio = 0;
		dados = new String[capacidade];

	}

	public void adiciona(String elemento) {
		if (verificaFilaCheia()) {
			dados[fim] = elemento;
			fim++;
			verificaContadores();
		} else {
			System.out
					.println("A Fila Circular chegou ao limite, por favor, remova alguns elementos e tente novamente.");
		}
	}

	public String remove() {
		String elemento = null;
		if (verificaFilaVazia()) {
			elemento = dados[inicio];
			dados[inicio] = null;
			inicio++;
			verificaContadores();
		} else {
			System.out.println("A Fila Circular está vazia, impossível remover!");
		}

		return elemento;
	}

	public String percorre() {
		StringBuffer sb = new StringBuffer();
		int count = inicio;
		boolean primeiroWhile = false;
		while (count <= dados.length - 1) {
			if (dados[count] != null) {
				sb.append("Índice(");
				sb.append(count);
				sb.append("): ");
				sb.append(dados[count]);
				sb.append(", ");

				count++;
				primeiroWhile = true;
			} else {
				break;
			}
		}

		if (primeiroWhile && inicio > 0) {
			count = 0;
			while (count < fim) {
				if (dados[count] != null) {
					sb.append("Índice(");
					sb.append(count);
					sb.append("): ");
					sb.append(dados[count]);
					sb.append(", ");
					count++;
				} else {
					break;
				}
			}
		}

		return sb.toString().replaceAll(",\\s+$", "");
	}

	private boolean verificaFilaVazia() {
		for (String d : dados)
			if (d != null)
				return true;

		return false;
	}

	private boolean verificaFilaCheia() {
		for (String d : dados)
			if (d == null)
				return true;

		return false;
	}

	/*
	 * private boolean verificaFila() { if (!verificaFilaVazia()) return true;
	 * 
	 * int proxIndiceInicio = 0; int proxIndiceFinal = 0; if (fim > dados.length
	 * - 1) proxIndiceFinal = 0;
	 * 
	 * if (inicio > dados.length - 1) proxIndiceInicio = 0;
	 * 
	 * if (proxIndiceFinal == proxIndiceInicio) return false;
	 * 
	 * return true; }
	 */

	private void verificaContadores() {
		if (fim > dados.length - 1)
			fim = 0;

		if (inicio > dados.length - 1)
			inicio = 0;

	}
}
