package asd.sorting;

import java.util.ArrayList;

public class InsertionSorter extends Sorter {
	
	

	public InsertionSorter() {
		super("InsertionSort");
	}

	@Override
	public void sort(int[] dati) {
		int n = dati.length;  // numero di elementi

		for (int j = 1; j<n; j++){
			/* key e' il primo tra i non ordinati */
			int key = dati[j]; // elemento da inserire
			/* trova la posizione per key tra gli ordinati */
			int i = j-1; // indice per scorrere gli ordinati
			while (i>=0 && dati[i]>key){
				dati[i+1] = dati[i];
				i--;
			}
			/* inserisce elem nella posizione trovata */
			dati[i+1] = key;
		}
	}

    @Override
    public ArrayList<Integer> sequence_constructor(int n) {
		return null;
	}

}
