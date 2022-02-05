package cursojavaaula07e08;

public class OperadoresLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int x, y, n;
		
		x = 2;
		y = 7;
		n = 12;
		
		boolean resultado, resultado2, resultado3;
		resultado = (x < y && y == n) ? true : false;
		System.out.println(resultado);
		resultado2 = (x < y || y == n) ? true : false;
		System.out.println(resultado2);
		resultado3 = (x < y ^ y < n) ? true : false;
		System.out.println(resultado3); */
		
		int x, y, w;
		
		x = 8;
		y = 3;
		w = x/y;  // 8 / 3 = 2.66 pega somente 2 inteiro
		String z = (w % 2 == 0) ? "frase1" : "frase2"; // 2 % 2 = 0 == 0 true = frase1
				
		System.out.println(z);
		
		

	}

}
