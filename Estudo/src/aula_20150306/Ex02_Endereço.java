package aula_20150306;

public class Ex02_Endereço 
{
	public static void main (String[] args)
	{
		Endereco  meuEndereco;
		meuEndereco = new Endereco();
		meuEndereco.logadouro = "Av. Francisco";
		meuEndereco.complemento = "Apto 407";
		meuEndereco.numero = 40;
		meuEndereco.bairro = "Floresta";
		meuEndereco.cep = "30150-220";
		meuEndereco.uf = "Mg";
		meuEndereco.nomedacidade = "Belo Horizonte";
				
		System.out.println ("O Endereço é " + meuEndereco.imprimirEndereco());
		
	
	}
	
}
