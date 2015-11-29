package edu.fatec.tabelaEspalhamento.contatos;

public class TabelaDeContatos {

	private ListaDeContatos tabela[];

	public TabelaDeContatos() {
		tabela = new ListaDeContatos[26];
	}

	public int funcaoDeEspalhamento(char c) {
		int letra = c;

		return letra - 97;
	}

	public void adiciona(String nome, String fone) {
		Contato c = new Contato(nome, fone);
		char letra = nome.toLowerCase().charAt(0);
		int i = funcaoDeEspalhamento(letra);
		if (i >= 0 && i < tabela.length) {
			if (tabela[i] == null)
				tabela[i] = new ListaDeContatos();
			tabela[i].adiciona(c);
		} else {
			System.out.println("Nome Inválido.");
		}
	}

	public Contato remove(String nome) {
		char letra = nome.toLowerCase().charAt(0);

		int i = funcaoDeEspalhamento(letra);

		if (i >= 0 && i < tabela.length) {
			if (tabela[i] != null) {
				return tabela[i].remove(nome);
			}
		} else {
			System.out.println("Nome inválido");
		}

		return null;
	}

	public void percorre() {
		for (ListaDeContatos table : tabela) {
			if (table != null)
				System.out.println(table.percorre());
		}
	}
}
