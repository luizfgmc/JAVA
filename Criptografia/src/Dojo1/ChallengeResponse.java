// Luiz Flávio Gomes Martins da Costa - RA 31518781
package Dojo1;
import java.util.Random;

public class ChallengeResponse {
	String resposta = ""; 
	String quest = "";

	public String sendQuest(){
		String quest = "" ;
		Random gerador = new Random();
		for (int i = 1; i< 5 ; i++){
			quest += (char)(gerador.nextInt(26) + 97);
		}
		this.quest = quest;
		return this.quest;
	}

	public boolean respondQuest(String resposta){
		boolean lOk = false;
		int posicao = 0;
		String mensagem = this.quest;
		String decifra = "";
		int  posicao_decifra = 0;
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";

		for(int i=0 ; i < mensagem.length() ; i++){
			for(int j=0 ; j < alfabeto.length() ;  j++)	{
				if (mensagem.charAt(i) ==  alfabeto.charAt(j)){
					posicao = j;
				}
			}
			posicao_decifra = ((posicao - 3) + alfabeto.length() )% alfabeto.length() ;
			decifra += alfabeto.charAt(posicao_decifra);
		}
		if (decifra.equals(resposta)){
			lOk = true;
		}
		return lOk;
	}
}