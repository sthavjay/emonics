package streamio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileStream {
	
	public static void main(String[] args) {
		try {
			BufferedReader infile = new BufferedReader(new FileReader("D:\\data1.txt"));
			while(infile.read() != -1) {
			System.out.println(infile.readLine()); 
			}
			infile.close();
			
		} catch (Exception e) {
			System.out.println(e);
			}
		
		}
		
		
}
