package experiments;


import asd.sorting.Sorter;

import java.util.Arrays;

public class Runner {
	
	public static String run(Sorter[] algos, int[][] seqs){
		String s="";
		for(Sorter a: algos){
			s+="\t"+a.getName();
		}
		s+="\n";
		
		System.out.print ("\nSize: "+seqs[0].length+ " Instances: ");
		for(int i=0;i<seqs.length;i++){
			int[] dati;
			long t0, t1, t2, t3;
			System.out.print(" "+i);
			

			s+=""+seqs[0].length;

			for (Sorter a : algos) {
				//				System.out.println ("\t\tRunning "+a.getName());
				dati = Arrays.copyOf(seqs[i], seqs[i].length);

				t0 = System.nanoTime();
				a.sort(dati);
				t1 = System.nanoTime();

				if(a.getName().equals("Pratt_ShellSort")){
					t2 = System.nanoTime();
					a.sequence_constructor(dati.length);
					t3 = System.nanoTime();
					s += "\t" + ((t1 - t0) - (t3-t2)) / 1E6;
				} else{
					s += "\t" + (t1 - t0) / 1E6;
				}
			}

			s+="\n";
		}

		return s;
		
	}

}
