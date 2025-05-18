package ex3;


import java.io.*;


public class test {

public static void main(String[] args) throws IOException {

	File source = new File("C:\\fichiers\\originale.png");

	File destination = new File("C:\\fichiers\\copy_img.png");


	InputStream in = new FileInputStream(source);
	
	OutputStream out = new FileOutputStream(destination);


	byte[] buffer = new byte[1024];

	int longueur;


	while ((longueur = in.read(buffer)) > 0) {

		out.write(buffer, 0, longueur);

}


in.close();

out.close();


System.out.println("Image copiée avec succès !");

}

}