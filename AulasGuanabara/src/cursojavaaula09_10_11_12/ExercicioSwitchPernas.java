package cursojavaaula09_10_11_12;

import java.util.Scanner;

public class ExercicioSwitchPernas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite a quantidade de perna(s) que o ser tem? ");
		int perna = sc.nextInt();
		String tipo;
		System.out.println("Isso é um(a): ");
		
		switch(perna) {
		case 1:
			tipo = "Saci";
			break;
		case 2:
			tipo = "Bipede";
			break;
		case 3:
			tipo = "Tripé";
			break;
		case 4:
			tipo = "Quadrupede";
			break;
		case 6:
			tipo = "Aranha";
			break;
		default:
			tipo = "ET";
		}
		
		System.out.println(tipo);
	}

}
