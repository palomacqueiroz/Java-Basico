package cursojavaaula06;

import java.util.Scanner;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do Aluno");
		String nome = sc.nextLine();
		System.out.println("Digite a nota do Aluno");
		float nota = sc.nextFloat();		
		System.out.printf("A nota de %s é : %.2f \n ", nome, nota );  // formatado %f // para 2 casas %.2f
		
		System.out.format("A nota de %s é : %.1f \n ", nome, nota );  // formatado %f // para 2 casas %.2f


		
	}

}
