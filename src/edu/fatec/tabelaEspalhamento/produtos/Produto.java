package edu.fatec.tabelaEspalhamento.produtos;

/**
 * @author tecnico
 *
 */
public class Produto {

	private int codigo;
	private double quantidade;

	public Produto(int codigo, double quantidade) {
		this.codigo = codigo;
		this.quantidade = quantidade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", quantidade=" + quantidade + "]";
	}

}
