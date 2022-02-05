package cursojavaaula09_10_11_12;

import java.util.Scanner;

public class EstruturaCondicionalComposta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int anoNascimento , calculoIdade;
		
		System.out.println("Ano de Nascimento : ");
		anoNascimento = sc.nextInt();
		
		calculoIdade = 2022 - anoNascimento;
		System.out.println("Sua idade é : " + calculoIdade);
		
		if (calculoIdade >= 18) {
			System.out.println("Você é maior de idade. ");
		} else {
			System.out.println("Você não é maior de idade. ");
		}
		
		if(calculoIdade % 2 == 0 ) {
			System.out.println("número par");
		} else {
			System.out.println("número impar");
		}
		

	}

}
