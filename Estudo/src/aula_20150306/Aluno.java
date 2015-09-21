// obterTotal(): deve retornar o somatório das notas obtidas pelo aluno.
// obterSituacao(): deve retornar “Aprovado” se o aluno tiver obtido 70 ou mais, e “Reprovado” caso o contrário.
// obterNotaMininmaAlternativa(): calcula o mínimo de pontos que o aluno deve obter na prova alternativa 
// para conseguir passar. A prova alternativa substitui o valor da menor prova (P1 ou P2).
// podeFazerAlternativa(): retornar verdadeiro apenas se o aluno puder fazer a alternativa, ou seja, 
//há possibilidade de obter 70 pontos ou mais substituindo a nota da menor prova (P1 ou P2).

package aula_20150306;

public class Aluno {

	public String nome;
	public String RA;
	public int P1;
	public int P2;
	public int T1;
	public int T2;
	public int PA;

	public String obterNome(){

		String nomeAluno;
		nomeAluno = (nome + " - RA " + RA) ;
		return nomeAluno;
	}

	public int obterTotal(){

		int notaTotal;
		notaTotal = (P1 + P2 + T1 + T2 + PA);	
		return notaTotal;
	}

	public String obterSituacao(int nota){

		String situacaoAulo;
		if (nota >= 70) {
			situacaoAulo = "Aprovado";
		}else{
			situacaoAulo = "Reprovado";
		}
		return situacaoAulo;
	}

	public int obterNotaMinimaAlternativa(int nota1, int nota2, int total, String situacao){
		int notaAlternativa =0;

		if (situacao == "Reprovado"){
			if (nota1 >= nota2){
				notaAlternativa = (70  - (total - nota2));
			}else{
				notaAlternativa = (70  - (total - nota1));
			}		
		}else{
		}
		return notaAlternativa;
	}

	public String podeFazerAlternativa(int nAlternativa){
		String alternativaDisponivel;
		if (nAlternativa <= 30){
			alternativaDisponivel = "Disponivel";
		}else{
			alternativaDisponivel = "Indisponivel";
		}
		return alternativaDisponivel ;
	}
}
