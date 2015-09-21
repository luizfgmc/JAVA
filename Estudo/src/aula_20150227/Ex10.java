//Leia um n�mero inteiro positivo e responda se ele � primo ou n�o. Obs: n�meros primos s�o n�meros que s�o
//divis�veis apenas por eles pr�prios e pelo n�mero 1. Ex: 1, 2, 3, 5, 7, 11.
package aula_20150227;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero para verificar se e um numero primo");
		int num = sc.nextInt();
		int totdiv =0;
		for (int i=1; i <= num; i++)
		{
			if (num%i==0)
			{
				totdiv++;
			}

		}
		if (totdiv <=2 ) 
		{
			System.out.println("O nuemro "+ num + " � um numero primo!");	
		}else{
			System.out.println("O nuemro "+ num + " n�o � um numero primo!");
		}
		if (sc != null)
		{
			sc.close();
		}
	}
}
