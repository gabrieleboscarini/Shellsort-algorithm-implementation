package asd.sorting;

import java.util.ArrayList;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class Hibbard_ShellSort extends Sorter{

    public Hibbard_ShellSort() {
        super("Hibbard_ShellSort");
    }

    @Override
    public ArrayList<Integer> sequence_constructor(int n) {
        return null;
    }

    @Override
    public void sort(int[] A) {

        int n = A.length;
        int k = (int)(log(n)/log(2));
        int gap = (int)(pow(2,k)-1);

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
}
