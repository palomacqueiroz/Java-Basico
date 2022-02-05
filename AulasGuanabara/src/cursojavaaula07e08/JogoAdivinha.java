package cursojavaaula07e08;

import java.util.Scanner;

public class JogoAdivinha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double n = 1 + Math.random() * (6 - 1);
		int valor = (int) n , valorRecebido;
		
		System.out.println("Digite um numero entre 1 a 6 ");
		valorRecebido = sc.nextInt();
		
			
		String f1 = "Acertou !!!";
		String f2 = "Errou, o numero é " + valor;
		
		String resultado = (valor == valorRecebido) ? f1 : f2;
		System.out.println(resultado);
				

	}

}
