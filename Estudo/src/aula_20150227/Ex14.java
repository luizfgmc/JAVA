/* Leia o nome e as notas P1, P2, T1, T2 e PA da quantidade de alunos informada 
pelo usu�rio. Ap�s ler os dados de todos os alunos o programa deve imprimir 
um consolidado com o nome, a nota final e a situa��o (aprovado/reprovado)
de cada aluno*/

package aula_20150227;

import java.util.Scanner;

public class Ex14 {
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de alunos a ler notas: ");
		int nalunos = sc.nextInt();

		String[] nome = new String[nalunos];
		String[] result = new String[nalunos];
		String[] provas = {"P1", "P2","T1","T2","PA"};
		int[] total = new int[provas.length];
		int[][] notaAlu = new int[nalunos][provas.length];
		int x = 0;

		for (int i=0 ; i <nalunos ; i++)
		{
			System.out.println("Digite o nome do aluno: ");
			nome[i] = sc.next();

			System.out.println("Digite a nota P1: ");
			notaAlu[i][0] = sc.nextInt();

			System.out.println("Digite a nota P2: ");
			notaAlu[i][1] = sc.nextInt();

			System.out.println("Digite a nota T1: ");
			notaAlu[i][2] = sc.nextInt();

			System.out.println("Digite a nota T2: ");
			notaAlu[i][3] = sc.nextInt();

			System.out.println("Digite a nota PA: ");
			notaAlu[i][4] = sc.nextInt();

			for (int y=0; y<provas.length; y++)
			{
				total[i] = (total[i] + notaAlu[i][y]);
			}

			if (total[i] >= 70) 
			{
				result[i] = ("Aprovado");
			}else{
				result[i] = ("Reprovado");
			}
		}
		while (x < nalunos)
		{
			System.out.println("O aluno " + nome[x] + " obiteve um total de " + total[x] + " pontos e foi " + result[x]);
			x++;
		}

		if (sc != null)
		{
			sc.close();
		}
	}
}

