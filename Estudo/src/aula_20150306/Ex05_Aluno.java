// nome, seu RA, as notas P1, P2, T1, T2 e PA.
package aula_20150306;

public class Ex05_Aluno {
	public static void main (String[] args){
		Aluno novoAluno;
		novoAluno = new Aluno();

		novoAluno.nome = "Luiz";
		novoAluno.RA = "12345678";
		novoAluno.P1 = 11;
		novoAluno.P2 = 9;
		novoAluno.T1 = 10;
		novoAluno.T2 = 15;
		novoAluno.PA = 10;

		System.out.println ("O nome do aluno " + novoAluno.obterNome());

		System.out.println ("E sua nota total é " + novoAluno.obterTotal());

		System.out.println ("A sistuacao do aluno é " +  novoAluno.obterSituacao(novoAluno.obterTotal()));

		System.out.println ("A nota minima da alternativa é  " + novoAluno.obterNotaMinimaAlternativa(novoAluno.P1, novoAluno.P2, novoAluno.obterTotal(),novoAluno.obterSituacao(novoAluno.obterTotal())));

		System.out.println ("A prova alternativa esta: " + novoAluno.podeFazerAlternativa(novoAluno.obterNotaMinimaAlternativa(novoAluno.P1, novoAluno.P2, novoAluno.obterTotal(),novoAluno.obterSituacao(novoAluno.obterTotal()))));

	}
}