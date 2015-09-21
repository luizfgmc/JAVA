//Leia a base (b) e a altura (h) de um ret�ngulo, imprima seu per�metro (per�metro = 2b + 2a)
package aula_20150227;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	int perimetro = 0;
	System.out.println("Digite o valor da base: ");
	int base = sc.nextInt();
	
	System.out.println("Digite o valor da altura: ");
	int altura = sc.nextInt();
	
	perimetro = (base * altura);
	
	System.out.println("O valor do perimetro � " + perimetro);
	
	if (sc != null)
	{
		sc.close();
	}
	
	
	}
}
