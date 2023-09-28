package Clase03Ejercicios;

public class Ejercicio01c {

	public static void main(String[] args) {

		int[] numeros = {4, 2, 6, 8};
		int numX = 5;
		int resultadoSuma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			
			if (numeros[i] > numX) {
				resultadoSuma += numeros[i];
			}
		}

		System.out.println("El resultado es: " + resultadoSuma);
	}

}
