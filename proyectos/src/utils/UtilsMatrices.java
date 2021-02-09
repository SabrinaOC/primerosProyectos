package utils;


public class UtilsMatrices {

	/**
	 * M�todo que rellena la matriz con valores creados al azar.
	 * 
	 * @param matriz
	 */

	public static void rellenarMatrizAzar(int matriz[][]) { // Creamos m�todo vac�o que recibe una matriz

		for (int i = 0; i < matriz.length; i++) { // Recorremos las filas de la matriz
			for (int j = 0; j < matriz[i].length; j++) { // Recorremos columnas
				matriz[i][j] = Utils.obtenerNumeroAzar(); // Damos valores aleatorios
			}
		}
	}

	/**
	 * M�todo que rellena la matriz con valores creados al azar entre l�mites
	 * 
	 * @param matriz
	 * @param min
	 * @param max
	 */

	public static void rellenarMatrizAzarLimites(int matriz[][], int min, int max) { // Creamos m�todo vac�o que recibe
																						// una matriz

		for (int i = 0; i < matriz.length; i++) { // Recorremos las filas de la matriz
			for (int j = 0; j < matriz[i].length; j++) { // Recorremos columnas
				matriz[i][j] = Utils.obtenerNumeroAzar(min, max); // Damos valores aleatorios
			}
		}
	}

	/**
	 * M�todo que imprima la matriz en pantalla.
	 * 
	 * @param matriz
	 */

	public static void mostrarMatrizPantalla(int matriz[][]) {

		for (int i = 0; i < matriz.length; i++) { // Recorremos las filas de la matriz
			for (int j = 0; j < matriz[i].length; j++) { // Recorremos columnas
				System.out.print(matriz[i][j] + "\t");
				; // Mostramos en pantalla
			}
			System.out.println();
		}
	}
	
	
	/**
	 * M�todo que comprueba si la matriz es diagonal
	 * 
	 * @param matriz
	 */

	public static boolean comprobarMatrizDiagonal(int matriz[][]) {

		boolean esDiagonal = true; // Creamos boolean a modo de bandera, partimos de que es diagonal, si en alg�n
									// valor no lo es, pasa a false

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j) { // Las posiciones que pueden contener un valor distinto de cero, son aquellas en
								// las que i y j conciden
					if (matriz[i][j] != 0) { // por tanto, si en una posici�n fuera de estas encontramos un valor
												// distinto de 0,
						esDiagonal = false; // esDiagonal pasar�a a falso
					}
				}
			}
		}

		return esDiagonal; // Devolvemos boolean
	}

	
	/**
	 * M�todo para comprobar matriz triangular superior
	 * @param matriz
	 * @return
	 */
	
	public static boolean comprobarMatrizTriangularSuperior(int matriz[][]) {

		boolean esTriangular = true; //Creamos boolean de comprobaci�n, el mismo que devolveremos al main

		for (int i = 1; i <= matriz.length - 1; i++) { //Recorremos i desde 1 ya que la posici�n 0 forma parte de la trangular superior
			for (int j = 0; j < i; j++) { //Recorremos j hasta que su valor sea igual a i - 1
				if (matriz[i][j] != 0) { //Si en alguna de esas posiciones se encuentra un valor distinto de 0
					esTriangular = false; //esTriangular pasa a falso
				}
			}
		}
		return esTriangular; //Devolvemos boolean

	}
	
	
	/**
	 * Matriz a array unidimensional
	 * 
	 * @param matriz
	 * @return
	 */

	public static int[] matrizAArray(int matriz[][]) {
		int cont = 0; // Creo contador para ver cu�ntas posiciones tiene la matriz

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz para saber posiciones totales
			for (int j = 0; j < matriz[i].length; j++) {
				cont++; // Aumentamos contador en cada posici�n
			}
		}

		int array[] = new int[cont]; // Creamos array con longitud de posiciones totales de matriz
		int k = 0; // Creamos �ndice para array
		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz para dar valores a array
			for (int j = 0; j < matriz[i].length; j++) {
				array[k] = matriz[i][j];
				k++; // Aumentamos �ndice array en cada vuelta

			}

		}

		return array; // Devolvemos array
	}

	
	/**
	 * M�todo comprueba matriz sim�trica
	 * @param matriz
	 * @return
	 */
	
	public static boolean comprobarMatrizSimetrica (int matriz [][]) {
		boolean esSimetrica = true; //Creamos boolean que devolveremos al main
		
		for (int i = 0; i < matriz.length; i ++) { //Recorremos matris
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j) { //Como la diagonal principal no se ha de tener en cuenta, comprobamos el resto de posiciones
					if (matriz[i][j] != matriz[j][i]) { //Como la relaci�n es espejo, si no se cumple esa condici�n
						esSimetrica = false;			//esSimetrica es falso
					}
				}
			}
		}
		
		return esSimetrica; //Devolvemos boolean al main
				
	}
	
	
	/**
	 * M�todo para crear matriz traspuesta
	 * @param matriz
	 * @return
	 */

	public static int [][] matrizTraspuesta (int matriz[][]) {
		int filas = 0;
		int columnas = 0;
		
		for (int i = 0; i < matriz.length; i++) { //Recorremos matriz para establecer dimensiones nueva matriz (filas/columnas)
			columnas++;
			for (int j = 0; j <= matriz.length; j++) {
				 
				filas++;
			}
		}
		filas = filas /columnas;
		
		int traspuesta [][] = new int [filas] [columnas]; //Creamos nueva matriz con las dimensiones calculadas
		
		for (int i = 0; i < matriz.length; i++) { //Recorremos matriz para asignar valores a traspuesta
			for (int j = 0; j < matriz[i].length; j++) {
				traspuesta [j][i] = matriz [i][j]; //Asignaci�n opuesta, cambiamos filas por columnas
				
			}
		}
		
		return traspuesta;
	}

	
	public static int[][] eliminarFilaMatrizEligeUsiario(int matriz[][], int num) {

		// Creamos contador para filas y columnas de la matriz
		int columnas = 0;
		int filas = 0;

		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz para establecer dimensiones nueva matriz
													// (filas/columnas)
			filas++;
			for (int j = 0; j <= matriz.length; j++) {

				columnas++;
			}
		}
		columnas = columnas / filas;

		int matrizMod[][] = new int[filas - 1][columnas]; // Creamos nueva matriz con las dimensiones calculadas
		int k = 0; // Creamos variable para �ndice filas matriz modificada
		for (int i = 0; i < matriz.length; i++) { // Recorremos matriz para darle valores a la matriz modificada
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != num) { // Si el valor de i, es decir, la fila, coincide con el n�mero del usuario, la
								// saltamos
					matrizMod[k][j] = matriz[i][j];

				}

			}
			if (i != num) { // Si i es distinto de num el contador j aumenta 1
				k++;
			}
		}

		return matrizMod;
	}
	
	
	/**
	 * 
	 * @param filas
	 * @param cols
	 * @param min
	 * @param max
	 * @return
	 */
	public static int[][] generaMatriz (int filas, int cols, int min, int max) {
		int matriz[][] = new int[filas][cols];
		
		// Asignación de valores al azar en las posiciones de la matriz
		for (int i = 0; i < matriz.length; i++) { // Con la variable "i" recorro todas las filas
			for (int j = 0; j < matriz[i].length; j++) { // Con la variable "j" recorro las columnas de cada fila
				// Asigno número al azar
				matriz[i][j] = Utils.obtenerNumeroAzar(min, max);
			}
		}
		return matriz;
	}
	
}
