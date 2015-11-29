package edu.fatec.btree;

public class BinaryTreeNode {
	int item;
	BinaryTreeNode parent;
	BinaryTreeNode left;
	BinaryTreeNode right;

	public BinaryTreeNode(int item) {
		this.item = item;
	}

	public int getValue() {
		return item;
	}

	public void setValue(int item) {
		this.item = item;
	}

	public BinaryTreeNode getParent() {
		return parent;
	}

	public void setParent(BinaryTreeNode parent) {
		this.parent = parent;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

}
