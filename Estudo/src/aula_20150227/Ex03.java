//Leia a base (b) e a altura (h) de um ret�ngulo, imprima sua �rea (�rea = b x a)
package aula_20150227;

// Importa o Scanner.
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		// Inicializa a variavel "area".
		int area = 0;
		Scanner sc = new Scanner(System.in);

		// Imprime texto.
		System.out.println("Digite o valor da base do retangulo: ");

		int base = sc.nextInt();

		// imprime texto.
		System.out.println("Digite o valor da altura do retangulo: ");
		int altura = sc.nextInt();

		// Preenche a variavel "area" com o resultado da multipli��o das
		// variaveis "base, aultura".
		area = (base * altura);

		// Imprime texto mais o valor da variavel "area".
		System.out.println("O valor da area e " + area);

		// Fecha o Scanner.
		if (sc != null) {
			sc.close();
		}
	}
}
