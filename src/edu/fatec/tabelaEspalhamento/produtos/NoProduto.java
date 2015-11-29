package edu.fatec.tabelaEspalhamento.produtos;

public class NoProduto {
	public Produto dado;
	public NoProduto prox;

	public NoProduto(Produto p) {
		dado = p;
		prox = null;
	}

}
