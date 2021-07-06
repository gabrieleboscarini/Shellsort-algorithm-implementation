package asd.tree;

public class BinaryTree {

	private BinaryTreeNode root;
	
	/* Crea un albero binario vuoto */
	public BinaryTree(){
		this.root = null;
	}

	/* Restituisce true se l'albero binario è vuoto */
	public boolean isEmpty() {

		return this.root == null;
	}

	/* Restituisce la radice dell'albero */
	public BinaryTreeNode root() {

		return this.root;
	}
	
	/* Restituisce il nodo il cui dato associato è info, o null se tale nodo non esiste */
	public BinaryTreeNode search(Object info) {
		return searchRic(this.root, info);
	}

	private BinaryTreeNode searchRic(BinaryTreeNode n, Object info){
		if(n != null){
			if(n.getInfo().equals(info))
				return n;
			BinaryTreeNode nl = searchRic(n.getLeft(), info);
			if(nl != null)
				return nl;  //se supero l'if sono nell'else, potevo anche scriverlo con l'else

			BinaryTreeNode nr = searchRic(n.getRight(), info);
			if(nl != null)
				return nr;

			return null;
		}
		return null;
	}

	/* Aggiunge la radice all'albero. Questo metodo dovrebbe essere invocato su un albero vuoto; se viene invocato su un albero non vuoto l'albero esistente viene cancellato */
	public BinaryTreeNode addRoot(Object info) {
		BinaryTreeNode n = new BinaryTreeNode(info);
		n.setLeft(null);
		n.setRight(null);
		n.setParent(null);
		this.root = n;
		return n;
	}

	/* Aggiunge un nodo con dato associato info come figlio sinistro del nodo n */
	public BinaryTreeNode addLeftChild(BinaryTreeNode n, Object info) {
		BinaryTreeNode m = new BinaryTreeNode(info);
		m.setLeft(null);
		m.setRight(null);
		m.setParent(null);
		n.setLeft(m);
		return m;
		
	}
	
	/* Aggiunge un nodo con dato associato info come figlio destro del nodo n */
	public BinaryTreeNode addRightChild(BinaryTreeNode n, Object info) {
		BinaryTreeNode m = new BinaryTreeNode(info);
		m.setLeft(null);
		m.setRight(null);
		m.setParent(null);
		n.setRight(m);
		return m;
	}

	/* Aggiunge l'albero l come sottoalbero sinistro del nodo n */
	public void addLeftSubtree(BinaryTreeNode n, BinaryTree l) {
		BinaryTreeNode lroot = l.root();
		n.setLeft(lroot);
		lroot.setParent(n);
	}

	/* Aggiunge l'albero r come sottoalbero destro del nodo n */
	public void addRightSubtree(BinaryTreeNode n, BinaryTree r) {
		BinaryTreeNode rroot = r.root();
		n.setLeft(rroot);
		rroot.setParent(n);
	}
	
	/* Restituisce una descrizione testuale dell'albero */
	public String toString(){
		return print(this.root, "");
	}

	private String print(BinaryTreeNode n, String c){
		String s= "";
		if(n!=null){
			s+=c+n+"\n";
			s+=print(n.getLeft(),c+"| ");
			s+=print(n.getRight(), c+" ");
		}
		return s;
	}

}
