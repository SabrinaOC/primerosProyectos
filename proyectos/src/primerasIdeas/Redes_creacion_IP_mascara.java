package primerasIdeas;

public class Redes_creacion_IP_mascara {

	public static void main(String[] args) {


		int ip [] = new int [4];
		//Creamos IP al azar
		System.out.println("\tIP");
		for (int i = 0; i < ip.length; i++) {
			ip[i] = utils.Utils.obtenerNumeroAzar(0, 255);
			
			System.out.print(ip[i] + ".");
		}
		//Creamos máscara de red al azar
		int masc = utils.Utils.obtenerNumeroAzar(8, 26);
		System.out.println("\n"
				+ "\nMáscara de red: " + masc);
		
		//Elegimos red o host
		int choice = utils.Utils.obtenerNumeroAzar(0, 1);
		if (choice == 0) {
			System.out.println("\nCrear SUBREDES");
		} else {
			System.out.println("\nCrear HOSTS");
		}
		
		//Cantidad de subredes o hosts que crearemos
		
		int subRed = utils.Utils.obtenerNumeroAzar(8, 1000);
		System.out.println("Cantidad que crear: " + subRed);
		
	}

}
