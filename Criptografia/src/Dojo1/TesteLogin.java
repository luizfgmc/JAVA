// Luiz Flávio Gomes Martins da Costa - RA 31518781
package Dojo1;
public class TesteLogin {
	public static void main(String[] args) {
		ChallengeResponse login = new ChallengeResponse();

		int posicao = 0;
		String mensagem = login.sendQuest();
		String decifra = "";
		int  posicao_decifra = 0;
		String alfabeto = "abcdefghijklmnopqrstuvwxyz";

		for(int i=0 ; i < mensagem.length() ; i++){
			for(int j=0 ; j < alfabeto.length() ;  j++){
				if (mensagem.charAt(i) ==  alfabeto.charAt(j))
				{
					posicao = j;
				}
			}
			posicao_decifra = ((posicao - 3) + alfabeto.length() )% alfabeto.length() ;
			decifra += alfabeto.charAt(posicao_decifra);

		}	
		if (login.respondQuest(decifra) == true){

			System.out.println("Você logou!!");

		}else{
			System.out.println("Senha Invalida");
		}

	}
}
