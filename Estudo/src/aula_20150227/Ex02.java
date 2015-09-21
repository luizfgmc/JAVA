// Leia dois n�meros inteiros e imprima soma destes
package aula_20150227;

// Importa o Scanner.
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		// Inicializa a variavel "soma".
		int soma = 0;
		// Cria o Scanner "sc".
		Scanner sc = new Scanner(System.in);
		// Imprime texto.
		System.out.println("Digite um numero: ");
		// Preenche a variavel "num1" utilizando o Scanner "sc".
		int num1 = sc.nextInt();

		// Imprime texto.
		System.out.println("Digite outro numero:");
		// Preenche a variavel "num2" utilizando o Scanner "sc".
		int num2 = sc.nextInt();

		// Preenche variavel "soma" com a soma das variaveis "num1, num2".
		soma = (num1 + num2);

		// Impreime o valor da variavel "soma"
		System.out.println("A soma dos dois numeros � " + soma);

		// Fecha o Scanner
		if (sc != null) {
			sc.close();
		}
	}
}
