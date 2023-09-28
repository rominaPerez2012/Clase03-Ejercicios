package Clase03Ejercicios;

public class Ejercicio02 {

	public static void main(String[] args) {

		String frase = "hola que tal";
		int desplazamiento = 1;
		
		// Transformar el String al código numérico de la tabla ASCII
		byte[] decodedBytes = frase.getBytes();
		
		System.out.println("Decodifico la frase: " + frase);
		frase = "";
		
		for (byte letra : decodedBytes) {
			
			letra = (byte) (letra + desplazamiento);
			frase = frase + (char)letra;
		
			System.out.println(letra);
		}
		
		System.out.println("Codifico la frase original: " + frase);

	}

}
