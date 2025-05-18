package ex2;
import java.io.*;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) throws IOException {

		File inputFile = new File("c:\\fichiers\\in.txt");


		Scanner scanner = new Scanner(System.in);


		System.out.print("Entrez le login : ");

		String login = scanner.nextLine().trim();


		System.out.print("Entrez le mot de passe : ");

		String motDePasse = scanner.nextLine().trim();


		boolean trouve = false;


		BufferedReader br = new BufferedReader(new FileReader(inputFile));

		String ligne;


		while ((ligne = br.readLine()) != null) {

			String[] parties = ligne.trim().split(" ");


			if (parties.length == 2) {

				String fichierLogin = parties[0];

				String fichierMotDePasse = parties[1];


			if (fichierLogin.equals(login) && fichierMotDePasse.equals(motDePasse)) {

				trouve = true;

				break;

				}

			}

		}


		br.close();

		scanner.close();


		if (trouve) {

		System.out.println("Authentification réussie");

		} else {

		System.out.println("Problème d'authentification");

			}

		}

		

}
