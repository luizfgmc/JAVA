// Leia o nome e idade e teste se e maior de 30 anos
package exemplos_20150227;
import java.util.Scanner;

public class Ex02_1{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();

		System.out.println("Digite sua idade: ");

		int idade = sc.nextInt();

		if(idade > 30){
			System.out.println("Voce " + nome + " tem mais de 30 anos.");
		}else{
			System.out.println("Voce " + nome + " tem 30 anos ou menos.");
		}
		if (sc!=null)
		{ 
			sc.close();
		}
	}
}
