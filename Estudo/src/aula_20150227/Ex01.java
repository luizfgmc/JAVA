// 1 - Leia e imprima o seu nome na tela. 
package aula_20150227;

// Importa o Scanner
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// Cria o scanner
		Scanner sc = new Scanner(System.in);
		// Imprime texto
		System.out.println("Digite seu nome: ");
		// Le nome digitado.
		String nome = sc.nextLine();
		// imprime o nome digitado;
		System.out.println("O nome digitado � " + nome);
		// Fecha o Scanner.
		if (sc != null) {
			sc.close();
		}
	}

}
