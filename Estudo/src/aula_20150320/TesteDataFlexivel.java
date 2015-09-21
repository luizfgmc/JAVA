package aula_20150320;

public class TesteDataFlexivel {
	public static void main (String[] args){
		DataFlexivel minhaDataFlexivel;
		minhaDataFlexivel = new DataFlexivel(31,12, 2014);
		System.out.println(minhaDataFlexivel.obterTextoDataCompleta());
		
	}
}