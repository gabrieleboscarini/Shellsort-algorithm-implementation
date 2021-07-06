package asd.list;

import java.util.List;

public class DoublyLinkedList {
	
	private ListNode head;
	private ListNode tail;
	
	/* Crea una lista vuota */
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
	}
	
	/* Restituisce true se le lista è vuota */
	public boolean isEmpty(){

		return this.head==null;
	}
	
	/* Svuota la lista */
	public void empty() {
		this.head = null;
		this.tail= null;
	}
	
	/* Restituisce il primo nodo della lista */
	public ListNode first() {
		return this.head;
		
	}
	
	/* Restituisce l'ultimo nodod della lista */
	public ListNode last() {
		return this.tail;
	}
	
	/* Restituisce il nodo successore del nodo x */ 
	public ListNode next(ListNode x) {
		return x.getNext();
	}
	
	/* Restituisce il nodo predecessore del nodo x */ 
	public ListNode prev(ListNode x) {
		return x.getPrev();
	}
	
	/* Restituisce il nodo successore che contiene il dato k, o null se nessun nodo contiene il dato k */ 
	public ListNode search(Object k) {

		ListNode x = this.head;

		while(x != null && !x.getInfo().equals(k)){
			x = x.getNext();
		}
		return x;
	}
	
	/* Aggiunge un nuovo nodo con dato k in testa alla lista */
	public ListNode addFirst(Object k) {
		ListNode x = new ListNode(k);
		x.setPrev(null);
		x.setNext(this.head);
		this.head = x;
		if(x.getNext() != null){
			x.getNext().setPrev(x);
		}
		else{
			this.tail = x;
		}
		return x;
	}
	
	/* Aggiunge un nuovo nodo con dato k in coda alla lista */
	public ListNode addLast(Object k) {
		ListNode x = new ListNode(k);
		x.setPrev(this.tail);
		x.setNext(null);
		this.tail = x;
		if(x.getPrev() != null){
			x.getPrev().setNext(x);
		}
		else{
			this.head = x;
		}
		return x;
		
	}	
	
	/* Aggiunge un nuovo nodo con dato k come successore del nodo y */
	public ListNode addAfter(ListNode y, Object k) {
		ListNode x = new ListNode(k);
		x.setPrev(y);
		x.setNext(y.getNext());
		y.setNext(x);
		if(x.getNext() != null){
			x.getNext().setPrev(x);
		}else{
			this.tail = x;
		}
		return x;
		
	}
	
	/* Aggiunge un nuovo nodo con dato k come predecessore del nodo y */
	public ListNode addBefore(ListNode y, Object k) {
		ListNode x = new ListNode(k);
		x.setPrev(y.getPrev());
		x.setNext(y);
		y.setPrev(x);
		if(x.getPrev() != null){
			x.getPrev().setNext(x);
		}else{
			this.head = x;
		}
		return x;
		
	}
	
	/* cancella il primo nodo della lista */
	public void deleteFirst() {
		if(this.head != null) {
			this.head = this.head.getNext();
		}
		if(this.head != null){
			this.head.setPrev(null);
		}else{
			this.tail = null;
		}
	}
	
	/* cancella l'ultimo nodo della lista */
	public void deleteLast() {
		if(this.head != null) {
			this.tail = this.tail.getNext();
		}
		if(this.tail != null){
			this.tail.setPrev(null);
		}else{
			this.head = null;
		}
	}
	
	/* cancella il nodo x dalla lista */
	public void delete(ListNode x) {
		if(x.getPrev() != null){
			x.getPrev().setNext(x.getNext());
		}else{
			this.head = x.getNext();
		}
		if(x.getNext() != null){
			x.getNext().setPrev(x.getPrev());
		}else{
			this.tail = x.getPrev();
		}

				
	}
	
	/* restiutisce una descrizione testuale della lista */
	public String toString() {

		String s = "(";

		ListNode x = this.head;
		while(x != null){
			s +=x.getInfo();
			x = x.getNext();
			if(x != null)
				s += ",";
		}

		s += ")";
		return s;
	}
}
