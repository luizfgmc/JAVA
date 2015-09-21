// Luiz Flávio Gomes Martins da Costa - RA 31518781
public class Ex02 {
	public static void main(String[] args){
		float soma= 0;
		int[][] matriz = {{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				soma += matriz[i][j];
			}
		}
		System.out.println("A media é " + soma /16);

	}
}

