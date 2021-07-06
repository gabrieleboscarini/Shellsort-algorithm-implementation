package asd.test;

import asd.list.DoublyLinkedList;
import asd.list.ListNode;

public class ListTest {

	public static void main(String[] args) {
		DoublyLinkedList list=new DoublyLinkedList();
		
		
		System.out.println("lista: "+list);
		System.out.println("isEmpty: "+list.isEmpty());
		
		System.out.println("\n Metodi di aggiunta");
		
		ListNode n1=list.addFirst("A");
		System.out.println("addFirst (\"A\") lista: "+list);
		ListNode n2=list.addFirst("B");
		System.out.println("addFirst (\"B\") lista: "+list);
		ListNode n3=list.addLast("C");
		System.out.println("addLast (\"C\") lista: "+list);
		ListNode n4=list.addLast("D");
		System.out.println("addLast (\"D\") lista: "+list);
		ListNode n5=list.addAfter(n1,"E");
		System.out.println("addAfter ("+n1+",\"E\") lista: "+list);
		ListNode n6=list.addBefore(n1,"F");
		System.out.println("addBefore ("+n1+",\"F\") lista: "+list);
		ListNode n7=list.addAfter(n4,"G");
		System.out.println("addAfter ("+n4+",\"G\") lista: "+list);
		ListNode n8=list.addBefore(n2,"H");
		System.out.println("addBefore ("+n2+",\"H\") lista: "+list);
		
		System.out.println("isEmpty: "+list.isEmpty());
		
		
		System.out.println("\n Metodi di navigazione");
		System.out.println("first: "+list.first());
		System.out.println("last: "+list.last());
		
		System.out.println("next di "+n1+": "+list.next(n1));
		System.out.println("prev di "+n1+": "+list.prev(n1));
		
		System.out.println("next di "+n8+": "+list.next(n8));
		System.out.println("prev di "+n8+": "+list.prev(n8));	
		
		System.out.println("next di "+n7+": "+list.next(n7));
		System.out.println("prev di "+n7+": "+list.prev(n7));	
			
		
		System.out.println("\n Metodi di ricerca");
		System.out.println("search A: "+list.search("A"));
		System.out.println("search H: "+list.search("H"));
		System.out.println("search G: "+list.search("G"));
		System.out.println("search X: "+list.search("X"));
		
		System.out.println("\n Metodi di cancellazione");
		list.deleteFirst();
		System.out.println("deleteFirst: "+list);
		list.deleteLast();
		System.out.println("deleteLast: "+list);
		list.delete(n3);
		System.out.println("delete "+n3+": "+list);
		list.empty();
		System.out.println("empty: "+list);
	}

}
