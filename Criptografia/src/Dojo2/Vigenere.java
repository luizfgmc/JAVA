// Luiz Flávio Gomes Martins da Costa - RA 31518781
package Dojo2;
public class Vigenere {

	int[] chave = {9,0,1,7,23,15,21,14,11,11,2,8,9};
	String alfabeto = "abcdefghijklmnopqrstuvwxyz";
	String mensagem = "";

	public String cifra(String mensagem){
		this.mensagem = mensagem.toLowerCase();
		int idxkey = 0;
		int idxword = 0;
		String textoCifrado = "";
		for (int i = 0 ; i < this.mensagem.length(); i++){
			idxword = this.alfabeto.indexOf(this.mensagem.charAt(i));
			if (idxword >=0){
				textoCifrado += this.alfabeto.charAt((idxword + chave[idxkey]) % 26);
				if (idxkey > this.chave.length){
					idxkey = 0;
				}else{
					idxkey++;
				}
			}
		}
		return textoCifrado;
	}

	public String decifra(String mensagem){
		String textoClaro ="";
		this.mensagem = mensagem.toLowerCase();
		int idxkey = 0;
		int idxword = 0;
		for (int i = 0 ; i < this.mensagem.length(); i++){
			idxword = this.alfabeto.indexOf(this.mensagem.charAt(i));
			if (idxword >=0){
				textoClaro += this.alfabeto.charAt(((idxword - chave[idxkey])+26 ) % 26);

				if (idxkey > this.chave.length){
					idxkey = 0;
				}else{
					idxkey++;
				}
			}
		}
		return textoClaro;
	}
}
