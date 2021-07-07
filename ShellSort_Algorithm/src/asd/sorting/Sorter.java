package asd.sorting;


import java.util.ArrayList;

public abstract class Sorter {
	
	protected String name;
	
	public Sorter(String name){
		this.name=name;
	}
	
	public abstract void sort(int[] dati);

	public abstract ArrayList<Integer> sequence_constructor(int n);
	
	public String getName(){
		return name;
	}

}
