package asd.test;

import asd.tree.BinaryTree;
import asd.tree.BinaryTreeNode;

public class TreeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryTree t1=new BinaryTree();
		BinaryTreeNode n1=t1.addRoot(1);
		
		BinaryTreeNode n2=t1.addLeftChild(n1, 2);
		BinaryTreeNode n3=t1.addRightChild(n1, 3);
		
		BinaryTreeNode n4=t1.addLeftChild(n2, 4);
		BinaryTreeNode n5=t1.addRightChild(n2, 5);
		
		BinaryTreeNode n6=t1.addLeftChild(n3, 6);
		BinaryTreeNode n7=t1.addRightChild(n3, 7);
		
		BinaryTreeNode n8=t1.addLeftChild(n4, 8);
		BinaryTreeNode n9=t1.addRightChild(n4, 9);		

		BinaryTreeNode n10=t1.addLeftChild(n5, 10);
		BinaryTreeNode n11=t1.addRightChild(n5, 11);		
		
		System.out.println("Primo albero");
		System.out.println(t1);
		
		BinaryTree t2=new BinaryTree();
		BinaryTreeNode n12=t2.addRoot(1);
		
		BinaryTreeNode n13=t2.addLeftChild(n12, 2);
		BinaryTreeNode n14=t2.addRightChild(n12, 3);
		
		BinaryTreeNode n15=t2.addLeftChild(n13, 4);
		BinaryTreeNode n16=t2.addRightChild(n13, 5);
		
		BinaryTreeNode n17=t2.addLeftChild(n14, 6);
		BinaryTreeNode n18=t2.addRightChild(n14, 7);
		
		BinaryTreeNode n19=t2.addLeftChild(n15, 8);
		BinaryTreeNode n20=t2.addRightChild(n15, 9);		

		BinaryTreeNode n21=t2.addLeftChild(n16, 10);
		BinaryTreeNode n22=t2.addRightChild(n16, 11);		

		System.out.println("Secondo albero");
		System.out.println(t2);		
		
		BinaryTree t=new BinaryTree();
		BinaryTreeNode r=t.addRoot(0);
		
		t.addLeftSubtree(r, t1);
		t.addRightSubtree(r, t2);
		
		System.out.println("Albero finale");
		System.out.println(t);
		
		BinaryTreeNode na=t.search(10);
		System.out.println("Nodo che contiene 10: "+na);

		BinaryTreeNode nb=t.search(20);
		System.out.println("Nodo che contiene 20: "+nb);
		
	}

}
