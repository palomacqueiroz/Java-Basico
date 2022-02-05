package cursojavaaula07e08;

public class ComparacaoString {

	public static void main(String[] args) {
		
		String nome1 = "Gustavo";
		String nome2 = "Gustavo";
		String nome3 = new String ("Gustavo");
		String resultado, resultado2;
		resultado = (nome3 == nome2) ? "igual" : "diferente";
		System.out.println(resultado);
		resultado2 = (nome1.equals(nome3)) ? "igual" : "diferente";
		System.out.println(resultado2);




	}

}
