package cursojavaaula09_10_11_12;

import java.util.Scanner;

public class ExemploNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num, soma = 0, pares = 0, impares = 0,maiorCem = 0, media;
		String resp;
		
		do {
			System.out.println("Digite um número ");
			num = sc.nextInt();
			num += num;
			soma += num;
			System.out.println("Deseja continuar? s - sim e n - não");
			resp = sc.next();
			
				if(num % 2 == 0) {
					pares = sc.nextInt();
				} else {
					impares = sc.nextInt();					
				}
				
				if(num > 100) {
					maiorCem = sc.nextInt();					
				}
				
				num++;
				
			} while(num <=3);
		
		System.out.println("Total de números digitados: " + num);
		System.out.println("Numeros pares: " + pares);
		System.out.println("Numeros impares " + impares);	
		System.out.println("Número maiores que 100 " + maiorCem);
		System.out.println("Soma de todos os valores é : " + soma);
		
		

	}

}
