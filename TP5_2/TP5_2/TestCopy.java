package TP5_2;

import java.io.*;
public class TestCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File inputFile = new File("c:\\fichiers\\in.txt");
		File outputFile = new File("c:\\fichiers\\out.txt");


		FileReader in = new FileReader(inputFile);

		FileWriter out = new FileWriter(outputFile);


		int c;

		while ((c = in.read()) != -1) {

		out.write(c);

		}

		in.close();

		out.close();

		}

		

}
