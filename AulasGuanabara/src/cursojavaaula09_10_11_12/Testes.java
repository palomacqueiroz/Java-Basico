package cursojavaaula09_10_11_12;

public class Testes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5, b = 2;
		String c;
		/* if (a > b) {
			c = "Primeiro é maior";
			System.out.println(c);
		}else {
			c = "Segundo é maior";
			System.out.println(c);
		} */ // Substituir por escrita com ternario
		
		c = (a <= b) ? "Segundo é maior" : "Primeiro é maior";
		System.out.println(c);

	}

}
