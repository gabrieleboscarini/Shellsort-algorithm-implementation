package asd.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class Pratt_ShellSort extends Sorter {

    public Pratt_ShellSort() {
        super("Pratt_ShellSort");
    }

    @Override
    public void sort(int[] A) {

        int n = A.length;
        ArrayList<Integer> gap_sequence = sequence_constructor(n);

        for(int k = gap_sequence.size()-1; k >= 0; k--){

            int gap = gap_sequence.get(k);
            for (int i = gap; i < n; i ++){

                int temp = A[i];
                int j;

                for (j = i; j >= gap && A[j - gap] > temp; j -= gap){
                    A[j] = A[j - gap];
                }
                A[j] = temp;
            }
        }
    }

    @Override
    public ArrayList<Integer> sequence_constructor(int n) {

        ArrayList<Integer> products = new ArrayList<>();
        int p2 = 1;
        while(p2<n){
            int p = p2;
            while(p < n){
                products.add(p);
                p*=3;
            }
            p2*=2;
        }
        Collections.sort(products);
        return products;
    }
}
