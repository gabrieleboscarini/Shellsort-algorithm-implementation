package asd.sorting;

import java.util.ArrayList;

public class Classic_ShellSort extends Sorter{

    public Classic_ShellSort() {
        super("Classic_ShellSort");
    }

    @Override
    public void sort(int[] A) {
        int n = A.length;

        for (int gap = n/2; gap > 0; gap /= 2){
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

        return null;
    }
}
