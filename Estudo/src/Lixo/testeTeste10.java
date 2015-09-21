package Lixo;

import java.util.Scanner;

public class testeTeste10 {

	public static void main (String[] args){
		Teste10 meuTeste10;
		meuTeste10 = new Teste10();
		Scanner sc = new Scanner(System.in);

		System.out.println ("Digite seu nome:");
		String nome = sc.nextLine();
		System.out.println ("Digite Sua idade");
		int idade = sc.nextInt();
		
		meuTeste10.imprimirIdade(idade);
		
	}
}
