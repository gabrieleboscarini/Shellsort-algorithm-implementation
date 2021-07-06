package asd.app;

import asd.tree.BinaryTree;
import asd.tree.BinaryTreeNode;


public class ExpressionParser {
	public static BinaryTree parseExpression(String s){
		int par=0;
		
		//cerca sottoespressione dx
		int opIndex=-1;
		int i=0;
		boolean continua=true;
		while(i<s.length() && continua){
			char ch=s.charAt(i);
			if(ch=='('){
				par++;
			}
			if(ch==')'){
				par--;
			}
			
			if((ch=='+' || ch=='-' || ch=='*' || ch=='\\' ) && par==1) {
				continua=false;
				opIndex=i;
			}
			i++;
		}
		
		String operator=s.substring(opIndex,opIndex+1);
		BinaryTree t=new BinaryTree();
		BinaryTreeNode r=t.addRoot(operator);
		
		if(s.charAt(opIndex-1)==')') {
			BinaryTree left=parseExpression(s.substring(1,opIndex));
			t.addLeftSubtree(r, left);
		}else {
			String op1=s.substring(1,opIndex);
			t.addLeftChild(r,op1);
		}
		
		if(s.charAt(opIndex+1)=='(') {
			BinaryTree right=parseExpression(s.substring(opIndex+1,s.length()-1));
			t.addRightSubtree(r, right);
		}else {
			String op2=s.substring(opIndex+1,s.length()-1);
			t.addRightChild(r,op2);
		}		
		
		return t;
	}
}
