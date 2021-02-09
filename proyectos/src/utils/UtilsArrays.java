package utils;

public class UtilsArrays {

	/**
	 * 
	 * @param array
	 */
	public static void mostrarArray (int[] array) {
		System.out.println("Contenido del array");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	/**
	 * 
	 * @param longitud
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int[] creaArrayNumerosAzar (int longitud, int limInf, int limSup) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerNumeroAzar(limInf, limSup);
		}
		return array;
	}

	/**
	 * 
	 * @param longitud
	 * @param limInf
	 * @param limSup
	 * @return
	 */
	public static int[] creaArrayNumerosUsuario (int longitud) {
		int array[] = new int[longitud];
		for (int i = 0; i < array.length; i++) {
			array[i] = Utils.obtenerEntero();
		}
		return array;
	}
	
	
	/**
	 * 
	 * @param array
	 */
	public static void ordenaArray (int array[]) {
		boolean hayIntercambios;
		do {
			hayIntercambios = false;
			// Empieza el algoritmo
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i+1] < array[i]) {
					// Entonces hago un intercambio
					int aux = array[i+1];
					array[i+1] = array[i];
					array[i] = aux;
					hayIntercambios = true;
				}
			}
		} while (hayIntercambios);

	}

	/** 
	 * 
	 * @param array
	 */
	
	public static void MayorYMenorArray (int array[]) {
		int mayor;
		int menor;
		
		mayor = array[0];
		menor = array[0];
		
		for (int i = 0; i<array.length; i++) {
			if (array[i]<menor) {
				menor = array [i];
			} if (array[i]>mayor) {
				mayor = array [i];
			}
	    }
		
		System.out.println("El mayor es " + mayor
				+ "\nEl menor es " + menor);
	}
	
	/** 
	 * 
	 * @param longitud
	 * @param limiteInf
	 * @param limiteSup
	 * @return
	 */
	
	public static int [] creaInicializaArrayEnterosAzarLimites (int longitud, int limiteInf, int limiteSup) {
		int array[] = new int [longitud];
		
		for (int i = 0; i < array.length; i++) {
			array [i] = Utils.obtenerNumeroAzar(limiteInf, limiteSup);
		}
		return array;
		
	}
		
	
}
	
