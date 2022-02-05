package cursojavaaula09_10_11_12;

import java.util.Scanner;

public class EstruturasCondicionaisSimples {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Primeira nota : ");
		float n1 = sc.nextFloat();
		System.out.println("Segunda nota : ");
		float n2 = sc.nextFloat();
		float media = (n1 + n2)/2;
		
		System.out.println("Sua média é: " + media);
		
		if (media > 9) {
			System.out.println("Parabéns");
	
		}

	}

}
