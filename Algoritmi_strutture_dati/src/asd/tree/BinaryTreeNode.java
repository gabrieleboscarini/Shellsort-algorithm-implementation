package asd.tree;

public class BinaryTreeNode {

	private Object info;
	private BinaryTreeNode parent;
	private BinaryTreeNode left;
	private BinaryTreeNode right;

	/* Crea un nodo il cui dato associato è info e i cui riferimenti parent, left e right sono nulli */
	public BinaryTreeNode(Object info){
		this.info=info;
		this.parent=null;
		this.left=null;
		this.right=null;
	}

	/* Restituisce il dato associato con il nodo */
	public Object getInfo() {
		return info;
	}

	/* Restituisce il padre del nodo */
	public BinaryTreeNode getParent() {
		return parent;
	}

	/* Restituisce il figlio sinistro del nodo */
	public BinaryTreeNode getLeft() {
		return left;
	}

	/* Restituisce il figlio destro del nodo */
	public BinaryTreeNode getRight() {
		return right;
	}

	/* Imposta il dato associato con il nodo */
	public void setInfo(Object info) {
		this.info=info;

	}

	/* Imposta il padre del nodo */
	public void setParent(BinaryTreeNode n) {
		this.parent=n;

	}

	/* Imposta il figlio sinsitro del nodo */
	public void setLeft(BinaryTreeNode n) {
		this.left=n;
	}

	/* Imposta il figlio destro del nodo */
	public void setRight(BinaryTreeNode n) {
		this.right=n;
	}

	/* Restituisce una descrizione testuale del nodo */
	public String toString(){
		return ""+this.info;
	}
}
