package cursojavaaula09_10_11_12;

import java.util.Scanner;

public class ExercicioVoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int anoNascimento , idade;
		
		System.out.println("Ano de Nascimento : ");
		anoNascimento = sc.nextInt();
		
		idade = 2022 - anoNascimento;
		System.out.println("Sua idade é : " + idade);
		
		if (idade < 16) {
			System.out.println("Você não pode votar.");
		} else {
			if ((idade >= 16 && idade < 18) || (idade > 70)){
				System.out.println("Você pode optar por votar, mas não é obrigatório.");
			} else {
				System.out.println("Você deve votar.");
			} 
		}
		

	}

}
