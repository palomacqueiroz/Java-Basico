package cursojavaaula09_10_11_12;

import java.util.Scanner;

public class ExercicioFatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = 0, f =1;
		int contador = n;
		
		System.out.println("Digite um numero para verificar seu fatorial: ");
		n = sc.nextInt();
		
		while(contador >= 1) {
			f *= contador;
			contador--;
		}
		
		System.out.println(f);
	}

}
