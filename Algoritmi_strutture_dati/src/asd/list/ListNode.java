package asd.list;

public class ListNode {
	private Object info;
	private ListNode next;
	private ListNode prev;
	
	/* Crea un nodo il cui dato è info e i cui campi prev e next sono null */
	public ListNode(Object info) {
		super();
		this.info = info;
		this.next = null;
		this.prev = null;
	}

	/* Restituisce il dato associato al nodo */
	public Object getInfo() {
		return info;
	}
	
	/* Imposta il dato associato al nodo */
	public void setInfo(Object info) {
		this.info = info;
	}

	/* Restituisce il nodo successivo */	
	public ListNode getNext() {
		return next;
	}

	/* Imposta il nodo successivo */
	public void setNext(ListNode next) {
		this.next = next;
	}

	/* Restituisce il nodo precedente */
	public ListNode getPrev() {
		return prev;
	}

	/* Imposta il nodo precedente */
	public void setPrev(ListNode prev) {
		this.prev = prev;
	}	
	
	/* Restuituisce una descrizione testuale del nodo */
	public String toString() {
		return ""+this.info;
		//return "[("+(this.prev!=null?this.prev.info:"-")+")-"+this.info+"-("+(this.next!=null?this.next.info:"-")+")]";
	}
}
