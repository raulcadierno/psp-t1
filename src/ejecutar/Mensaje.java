package ejecutar;

import java.util.Scanner;

public class Mensaje {

	public static void main(String[] args) {
		/*Los parametros no son argumentos; es decir, no los conocemos de antemano
		 Los parametros se obtienen en tiempo de ejecucion*/
		
		//Pide una palabra y un numero
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Escribe una palabra");
		String pal= scan.next();
		
		System.out.println("Escribe un numero entre 1 y 20");
		int num= scan.nextInt();
		
		for(int i=0; i<num; i++)
			System.out.println(pal);
		
		scan.close();
	}

}
