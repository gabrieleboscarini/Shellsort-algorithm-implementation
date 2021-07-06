import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import asd.tree.BinaryTree;
import asd.tree.BinaryTreeNode;

public class TreeReader {
	
	public static BinaryTree readTree(String filename){
		String s=readFile(filename);
		
		if(s.length()==2)
			return null;
		int a=-1;
		int b=-1;
		
		int c=0;
		int i=1;
		while(i<s.length()-1 && b==-1){
			char ch=s.charAt(i);
			if(ch=='('){
				c++;
				if(a==-1)
					a=i;
			}
			if(ch==')'){
				c--;
				if(c==0)
					b=i;
			}
			i++;
		}
		
		String s1=s.substring(1,a);
		String s2=s.substring(a,b+1);
		String s3=s.substring(b+1,s.length()-1);
		
		BinaryTree t=null;
		t=new BinaryTree();
		BinaryTreeNode n=t.addRoot(s1);
		BinaryTree tl=readTree(s2);
		if(tl!=null)
			t.addLeftSubtree(n, tl);
		BinaryTree tr=readTree(s3);
		if(tr!=null)
			t.addRightSubtree(n, tr);
	
		return t;
	}
	
	private static String readFile(String filename){
		String s="";
		InputStreamReader in=null;
		try {
			in=new InputStreamReader(new FileInputStream(filename));
			char ch;
			int i;
			while((i=in.read())>-1){
				ch=(char)i;
				s+=ch;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return s;
	}

}
