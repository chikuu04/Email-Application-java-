package utilities;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class CSV {
	
	//read data from csv file
		public static List<String[]> read(String file) {
			List<String[]> data= new LinkedList<String[]>();
			
			String dataflow;
			try {
			BufferedReader br= new BufferedReader(new FileReader(file));
			while((dataflow = br.readLine())!=null){
			String[] dataRecords = dataflow.split(",");
			data.add(dataRecords);
			}
		}catch(FileNotFoundException e) {
			System.out.println("Could not find a file");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println("Could not find a file");
			e.printStackTrace();
		}
			return data;
}
}