package cursojavaaula09_10_11_12;

import java.util.Scanner;

public class ExercicioTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		int a,b,c;
		System.out.println("Vamos verificar se forma um triangulo");
		System.out.println("Digite um número: ");
		a = sc.nextInt();
		System.out.println("Digite outro número:");
		b = sc.nextInt();
		System.out.println("Digite  um ultimo número:");
		c = sc.nextInt();
		
		if(a<b+c && b<a+c && c<a+b) {
			System.out.println("Forma um triangulo");
			if(a==b && b==c) {
				System.out.println("-Equilatero-");
			} else if (a!=b && b!=c && a!=c){
				System.out.println("-Escaleno-");
			} else {
				System.out.println("-Isósceles-");
			}
		} else {
			System.out.println("Não forma um triangulo");
			System.out.println("-----");
		}
		

	}

}
