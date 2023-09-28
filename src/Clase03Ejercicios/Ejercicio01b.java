package Clase03Ejercicios;

public class Ejercicio01b {
	public static void main(String[] args) {
	
//		int numero1 = 80;
//		int numero2 = 4;
//		int numero3 = 10;
//		
		boolean ordenAscendente = true;
		
		int[] vectorDeNumero = {80, 4, 10};
		
		// Si el orden es ascendente
		if (ordenAscendente) {
		
            for (int i = 0; i < vectorDeNumero.length - 1; i++) {
            	
                for (int j = 0; j < vectorDeNumero.length - i - 1; j++) {
                	
                    if (vectorDeNumero[j] > vectorDeNumero[j + 1]) {

                        int temp = vectorDeNumero[j];
                        vectorDeNumero[j] = vectorDeNumero[j + 1];
                        vectorDeNumero[j + 1] = temp;
                        
                    }
                    
                }
                
            }
            
		}
		// Si el orden es descendente
		else {
			
            for (int i = 0; i < vectorDeNumero.length - 1; i++) {
            	
                for (int j = 0; j < vectorDeNumero.length - i - 1; j++) {
                	
                    if (vectorDeNumero[j] < vectorDeNumero[j + 1]) {
                    	
                        int temp = vectorDeNumero[j];
                        vectorDeNumero[j] = vectorDeNumero[j + 1];
                        vectorDeNumero[j + 1] = temp;
                    }
                }
            }
		}
			
		
		
		for (int i = 0; i < vectorDeNumero.length; i++) {
			System.out.println("El elemento en la posición " + (i+1) + " es: " + vectorDeNumero[i]);
		}
		
	}
}
