package aula_20150306;

public class Endereco 
{
	public String logadouro;
	public String complemento;
	public String bairro;
	public String nomedacidade;
	public String uf;
	public String cep;
	public int numero;

	public String imprimirEndereco()
	{
		String endCompleto; 
		endCompleto = (logadouro + " - " + numero + " - " + complemento + " - " + bairro 
				+ " - " + nomedacidade + " - " + uf + " - "	 + cep );
		return endCompleto;
	}
}
