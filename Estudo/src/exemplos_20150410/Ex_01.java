package exemplos_20150410;
public class Ex_01{
	public static void main(String[] args){
		int a = 8;
		int b = 0;
		int c = 0;
		try {
			c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e){
			System.out.println("Divisão por  zero");
		}finally{
			System.out.println(c);
		}
	}
}