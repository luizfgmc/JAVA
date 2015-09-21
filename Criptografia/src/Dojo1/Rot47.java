// Luiz Flávio Gomes Martins da Costa - RA 31518781
package Dojo1;
public class Rot47 {
	int _chave = 47;
	public String getCifra(String mensagem_original)
	{
		int novo_valor_ascii;
		int valor_ascii;
		String mensagem_cifrada = "";
		//percorra o meu texto claro
		for(int i=0; i < mensagem_original.length();i++)
		{
			valor_ascii = (int)mensagem_original.charAt(i);
			if(valor_ascii >= 33 && valor_ascii <= 126)
			{
				valor_ascii -= 33;
				novo_valor_ascii = (valor_ascii + this._chave) % 94;
				mensagem_cifrada += (char)(novo_valor_ascii+33);
			}
			else
				mensagem_cifrada += mensagem_original.charAt(i);
		}
		return mensagem_cifrada;
	}
	public String getDeCifra(String mensagem_cifrada)
	{
		int novo_valor_ascii;
		int valor_ascii;
		String mensagem_original = "";
		//percorra o meu texto claro
		for(int i=0; i < mensagem_cifrada.length();i++)
		{
			valor_ascii = (int)mensagem_cifrada.charAt(i);
			if(valor_ascii >= 33 && valor_ascii <= 126)
			{
				valor_ascii -= 33;
				novo_valor_ascii = ((valor_ascii + this._chave) + 94)  % 94;
				mensagem_original += (char)(novo_valor_ascii+33);
			}
			else
				mensagem_original += mensagem_cifrada.charAt(i);
		}
		return mensagem_original;
	}
}

