// Luiz Flávio Gomes Martins da Costa - RA 31518781
package Dojo2;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.util.Scanner;

public class VigenereFile {
	private String fileName ="";
	private String path ="";
	String alfabeto = "abcdefghijklmnopqrstuvwxyz ";
	String chave = "";

	public String cifra(String caminho, String nome, String chave) throws FileNotFoundException {
		String textoCifrado = "";
		this.path = caminho;
		this.fileName = nome;
		this.chave = chave ;
		String mensagem = "" ;
		int idxkey = 0;
		int idxword = 0;
		String chavepronta ="";

		FileInputStream inputStream = new FileInputStream((this.path + this.fileName));
		mensagem = new Scanner(inputStream,"UTF-8").useDelimiter("\\A").next();
		// Monta chave
		for (int y = 0 ; y < mensagem.length(); y++ ){

			if ( 26 == (this.alfabeto.indexOf(mensagem.charAt(y)))){
				chavepronta += " ";
			}else{
				chavepronta += this.chave.charAt(idxkey);

				if (idxkey == this.chave.length() -1 ){
					idxkey = 0;
				}else{
					idxkey++;
				}
			}
		}
		for (int i = 0 ; i < mensagem.length(); i++){
			idxword = this.alfabeto.indexOf(mensagem.charAt(i));
			idxkey = this.alfabeto.indexOf(chavepronta.charAt(i));
			if (idxword >=0){
				if ( 26 == (this.alfabeto.indexOf(mensagem.charAt(i))) ){
					textoCifrado += " ";
				}else{
					textoCifrado += this.alfabeto.charAt((idxword + idxkey) % 26);
				}
			}
		}
		return textoCifrado;			
	}
}