package Lixo;
// Programa para ler e somar numeros
import java.util.Scanner;

public class Teste10 {
	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println ("Digite seu nome:");
		String nome = sc.nextLine();
		System.out.println ("Digite Sua idade");
		int idade = sc.nextInt();
	}
	public void imprimirIdade(int idade){
		System.out.println("A idade digitada é " + idade);
	}
	
}
