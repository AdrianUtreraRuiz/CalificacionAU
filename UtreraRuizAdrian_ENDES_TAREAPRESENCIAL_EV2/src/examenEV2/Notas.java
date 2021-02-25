package examenEV2;

public class Notas {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);// Para pedir números por teclado
		int nota = 0;
		String calificacion = "";
		System.out.print("Introduzca una nota: ");
		nota = reader.nextInt();
		calificacion = obtenerNota(nota);
		System.out.println(calificacion);
		reader.close();
	}

	/**
	 * @param nota
	 * @return
	 */
	private static String obtenerNota(int nota) {
		String calificacion;
		if (nota >= 0 && nota < 5)
			calificacion = "Suspenso";
		else if (nota >= 5 && nota <= 10)
			calificacion = "Aprobado";
		else
			calificacion = "La nota introducida no es correcta";
		return calificacion;
	}
}