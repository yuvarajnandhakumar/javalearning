package org.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHandlingss {

	public static void main(String[] args) throws IOException {

		String s="D://amazon//testdata.txt";
		
		File f = new File(s);
		File f1 = new File(".//testdata.txt");
		
		boolean c1 = f.createNewFile();
		boolean c2 = f1.createNewFile();
		
		System.out.println(c1 +"  " +c2);
		
		
		File d = new File("D://amazon//yuvraj");
		boolean dir = d.mkdir(); 
		System.out.println(dir);

		
		File d1 = new File("D://amazon//yuvraj//day//month/year");
		boolean dir2 = d1.mkdirs();
		System.out.println(dir2);
		
		//to write data in a file( txt )
		Path pt = Paths.get(s);  // access a text file path location
		/*BufferedWriter wr = Files.newBufferedWriter(pt, Charset.forName("UTF-8"));
		wr.write("hi all feb batch");
		wr.newLine();
		wr.write("2021");
		wr.close();*/
		
		
		//to read data from a file
		
		BufferedReader reader = Files.newBufferedReader(pt, Charset.forName("UTF-8"));
		String currentline="2021";  //no content
		String sd="yyy";   // content
	
		System.out.println("\t");
		System.out.println("\n");
		
		while((currentline = reader.readLine()) !=null) // read each line in a text file
		{
			if(currentline.contains("2021"))
			System.out.println(currentline);
		}

		
		
	}

}
