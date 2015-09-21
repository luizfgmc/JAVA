package aula_20150306;

public class Ex04_Pessoa {

	public static void main (String[] args){
		
		String nomeretornado;
		Pessoa  minhaPessoa;

		minhaPessoa = new Pessoa();
		minhaPessoa.cpf = "123456789-98";
		minhaPessoa.primeironome = "Luiz";
		minhaPessoa.nomedomeio = "Flavio";
		minhaPessoa.ultimonome = "Gomes";

		nomeretornado = minhaPessoa.obterNomeCompeleto();

		System.out.println (nomeretornado);
	}
}