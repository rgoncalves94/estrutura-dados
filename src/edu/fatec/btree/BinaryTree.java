package edu.fatec.btree;

public class BinaryTree {
	BinaryTreeNode root;

	public BinaryTree() {

	}

	public boolean isEmpty() {
		if (root == null)
			return true;

		return false;
	}

	public int getAltura() {
		return getAltura(this.root);
	}

	private int getAltura(BinaryTreeNode root) {
		if (root == null)
			return 0;
		int alturaEsquerda = getAltura(root.getLeft());
		int alturaDireita = getAltura(root.getRight());

		if (alturaEsquerda > alturaDireita) {
			return alturaEsquerda + 1;
		} else {
			return alturaDireita + 1;
		}
	}

	public int getQtdeNode() {
		return getQtdeNode(root);
	}

	private int getQtdeNode(BinaryTreeNode root) {
		if (root == null)
			return 0;
		int qtdeEsquerda = getQtdeNode(root.getLeft());
		int qtdeDireita = getQtdeNode(root.getRight());

		return qtdeEsquerda + qtdeDireita + 1;
	}

	public void imprimeArvore() {
		if (this.root == null)
			System.out.println("Árvore vazia");
		else
			imprimeArvore(this.root);
	}

	private void imprimeArvore(BinaryTreeNode node) {

		if (node.getLeft() != null) {
			imprimeArvore(node.getLeft());
		}
		if (node.getRight() != null) {
			imprimeArvore(node.getRight());
		}

		System.out.println("Nó:" + node.getValue());
	}

	public void insert(int valor) {
		inserir(this.root, valor);
	}

	private void inserir(BinaryTreeNode node, int valor) {
		BinaryTreeNode newNode = new BinaryTreeNode(valor);
		if (this.root == null)
			this.root = newNode;
		else {
			if (valor < node.getValue()) {
				if (node.getLeft() != null) {// Ramo preenchido
					inserir(node.getLeft(), valor);
				} else {// Ramo vazio
					node.setLeft(newNode);
				}
			} else if (valor > node.getValue()) {
				if (node.getRight() != null) {// Ramo preenchido
					inserir(node.getRight(), valor);
				} else {// Ramo vazio
					node.setRight(newNode);
				}
			}
		}
	}

	public BinaryTreeNode remover(int valor) {
		return remover(this.root, valor);
	}

	private BinaryTreeNode remover(BinaryTreeNode node, int valor) {
		if (this.root == null) {
			return null;
		} else {
			if (valor < node.getValue()) {
				node.setLeft(remover(node.getLeft(), valor));
			} else if (valor > node.getValue()) {
				node.setRight(remover(node.getRight(), valor));
			}
		}
		return node;
	}

}
