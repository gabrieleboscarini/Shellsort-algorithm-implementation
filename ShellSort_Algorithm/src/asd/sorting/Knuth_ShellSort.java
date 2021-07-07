package asd.sorting;

import java.util.ArrayList;

import static java.lang.Math.pow;

public class Knuth_ShellSort extends Sorter{

    public Knuth_ShellSort() {
        super("Knuth_ShellSort");
    }

    @Override
    public void sort(int[] A) {

        int n = A.length;
        int k = n/3 -1;
        int gap = (int)(pow(3,k)-1)/2;

        while (k>0){

            for (int i = gap; i < n; i ++){

                int temp = A[i];
                int j;

                for (j = i; j >= gap && A[j - gap] > temp; j -= gap){
                    A[j] = A[j - gap];
                }
                A[j] = temp;
            }
            k--;
        }
    }

    @Override
    public ArrayList<Integer> sequence_constructor(int n) {
        return null;
    }

}
