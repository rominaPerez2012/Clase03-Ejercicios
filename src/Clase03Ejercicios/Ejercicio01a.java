package Clase03Ejercicios;

public class Ejercicio01a {

	public static void main(String[] args) {

		String palabra = "Ejercicio 1 de la clase 3 del curso de JAVA";
		char letra = 'a';
		
		int contador = 0;
		
		for	(int i = 0; i < palabra.length(); i++) {
			
			if (palabra.charAt(i) == letra) {
				contador++;
			}
		}
		
		System.out.println("La letra " + letra + " aparece: " + contador + " veces en la palabra o frase: \"" + palabra + "\"");


	}

}
