package br.edu.faeterjrio.vector;

import java.util.Vector;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String str;
		char continua='S';
		Vector<String> palavras = new Vector<String>();
		Scanner in = new Scanner(System.in);
		while (continua == 'S') {
			System.out.println("Insira uma palavra: ");
			str = in.nextLine();
			palavras.add(str);
			System.out.println("Deseja continuar? [S/N]");
			continua = in.nextLine().charAt(0);
		}
		System.out.println(palavras);
	}

}
