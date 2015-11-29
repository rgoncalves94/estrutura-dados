package edu.fatec.tabelaEspalhamento.produtos;

public class TabelaEspalhamento {

	private ListaLigada tabela[];

	public static void main(String[] args) {
	}

	public TabelaEspalhamento() {
		tabela = new ListaLigada[10];
	}

	public int funcaoDeEspalhamento(int chave) {
		return chave % 10;
	}

	public void adiciona(int chave, double qtde) {
		Produto p = new Produto(chave, qtde);
		int indice = funcaoDeEspalhamento(chave);

		if (indice >= 0 && indice < tabela.length) {
			if (tabela[indice] == null)
				tabela[indice] = new ListaLigada();
			tabela[indice].adicionaInicio(p);
		} else {
			System.out.println("Erro codigo invalido");
		}
	}

	public Produto remove(int chave) {
		int indice = funcaoDeEspalhamento(chave);

		if (indice >= 0 && indice < tabela.length) {
			if (tabela[indice] != null) {
				return tabela[indice].remove(chave);
			} else {
				System.out.println("Produto nao existe");
			}
		} else {
			System.out.println("Código Inválido");
		}

		return null;
	}

	public String percorre() {
		String aux = "";

		for (ListaLigada table : tabela) {
			if (table != null) {
				aux = aux + table.percorre() + "\n\n";
			}
		}

		return aux;
	}
}
