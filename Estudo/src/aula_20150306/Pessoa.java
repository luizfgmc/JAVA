// classe que represente uma pessoa caracterizada pelo cpf,
// primeiro nome, nome do meio, ultimo nome e sexo.
package aula_20150306;

public class Pessoa {
	public String cpf;
	public String nome;
	public String primeironome;
	public String nomedomeio;
	public String ultimonome;
	public String sexo;

	public String obterNomeCompeleto(){

		String nomecompleto;
		nomecompleto = primeironome + " " + nomedomeio + " " + ultimonome;
		return nomecompleto;

	}

}
