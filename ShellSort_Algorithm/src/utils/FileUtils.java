package utils;


import java.io.*;

public class FileUtils {
	
	public static int[][] readSequences(String fileName, int num, int length){
		int[][] seq=new int[num][length];
		try {
			BufferedReader in = new BufferedReader (new FileReader(fileName));
			String line = in.readLine ();
			int i=0;
			while (line != null){
				String[] sDati = line.split(" ");
				for (int j=0; j<seq[i].length; j++)
					seq[i][j] = Integer.parseInt(sDati[j]);
				line = in.readLine ();
				i++;
			}
			in.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return seq;
	}
	
	public static void writeFile(String fileName, String txt){
		try {
			PrintWriter out = new PrintWriter (new FileWriter(fileName));
			out.println(txt);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
