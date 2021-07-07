import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class pratt_sequence {

    static void printArray(ArrayList<Integer> arr)
    {
        int n = arr.size();
        for (int i=0; i<n; ++i) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static ArrayList<Integer> pratt_sequence_maker(int n){

        ArrayList<Integer> products = new ArrayList<Integer>();
        int p2 = 1;
        while(p2<n){
            int p = p2;
            while(p < n){
                products.add(p);
                p*=3;
            }
            p2*=2;
        }
       // Arrays.sort(products);
        Collections.sort(products);
        return products;
    }

    public static void main(String[] args){
        int n = 89;
        ArrayList<Integer> rocia = pratt_sequence_maker(n);
        printArray(rocia);
    }

}
