package experiments;

import asd.sorting.*;
import utils.FileUtils;

public class Experiment {

    public static void main(String[] args) {

        Sorter[] algos = {
                new Classic_ShellSort(),
                new Hibbard_ShellSort(),
                new Knuth_ShellSort(),
                new InsertionSorter(),
                new Pratt_ShellSort()
        };


        String outputDir = "output/";
        String inputDir = "input/";
        String s;

        //warmUp

        s="";
        for (int i = 1000; i <= 3000; i += 1000) {    //Esegue tutti gli algoritmi su tutte le sequenze da 1000 a 10000
            String filename = inputDir+"/general/"+"seq"+i+".txt";
            int[][] seqs= FileUtils.readSequences(filename,10,i);
            s+= Runner.run(algos, seqs)+"\n\n";
        }


        //sequenze general

        s="";
        for (int i = 1000; i <= 10000; i += 1000) {    //Esegue tutti gli algoritmi su tutte le sequenze da 1000 a 10000
            String filename = inputDir+"/general/"+"seq"+i+".txt";
            int[][] seqs= FileUtils.readSequences(filename,10,i);
            s+= Runner.run(algos, seqs)+"\n\n";
        }

        FileUtils.writeFile(outputDir+"general1.txt",s);

        //sequenze inverted

        s="";
        for (int i = 1000; i <= 10000; i += 1000) {    //Esegue tutti gli algoritmi su tutte le sequenze da 1000 a 10000
            String filename = inputDir+"/inverted/"+"seq"+i+".txt";
            int[][] seqs= FileUtils.readSequences(filename,10,i);
            s+= Runner.run(algos, seqs)+"\n\n";
        }

        FileUtils.writeFile(outputDir+"inverted1.txt",s);

        //sequenze sorted

        s="";
        for (int i = 1000; i <= 10000; i += 1000) {    //Esegue tutti gli algoritmi su tutte le sequenze da 1000 a 10000
            String filename = inputDir+"/sorted/"+"seq"+i+".txt";
            int[][] seqs= FileUtils.readSequences(filename,10,i);
            s+= Runner.run(algos, seqs)+"\n\n";
        }

        FileUtils.writeFile(outputDir+"sorted1.txt",s);
    }

}
