package aula_20150515;

public class Pessoa{
	private int idade;
	private char sexo;
	private double peso;
	private double altura;
	private String nome;

	public Pessoa(){

	}

	public Pessoa(String nome, int idade, char sexo){
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setidade(int idade){
		this.idade = idade;
	}
	public int getIdade(){
		return this.idade;
	}
	public void setSexo(char sexo){
		this.sexo = sexo;
	}
	public char getSexo(){
		return this.sexo;
	}
	public void setPeso(double peso){
		this.peso = peso;
	}
	public double getPeso(){
		return this.peso;
	}
	public void setAltura(double altura){
		this.altura = altura;
	}
	public double getAltura(){
		return this.altura;
	}

}
