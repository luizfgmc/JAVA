// Luiz Flávio Gomes Martins da Costa - RA 31518781
package Dojo2;

import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthScrollBarUI;

public class TesteVigenereFile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		VigenereFile vegenereFile = new VigenereFile();
		String chave = "";
		String caminho = "";
		String nomedoarquivo = "";

		System.out.println("Digite a Chave: ");
		chave = teclado.nextLine();
		System.out.println("Digite o caminho do arquivo: Ex. c:\\ ");
		caminho = teclado.nextLine();
		System.out.println("Digite o nome do arquivo: Ex. teste.txt");
		nomedoarquivo = teclado.nextLine();
		try {
			System.out.println("O conteudo do arquivo cifrado é :" + vegenereFile.cifra(caminho + "\\", nomedoarquivo, chave));
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
