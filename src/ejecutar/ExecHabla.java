package ejecutar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.io.PrintWriter;

public class ExecHabla {

	public static void main(String[] args) {
		/* Habla interactua con el usuario en tiempo de ejecucion
		   asi que ExecHabla debe pedir datos y pasarselos a Habla*/

		Runtime r = Runtime.getRuntime();
		Scanner scan = new Scanner(System.in);
		
		try {
			Process p= r.exec("CMD /K java -cp bin ejecutar.Habla");
		
			//pedir datos			
			System.out.println("Escribe una palabra para Habla");
			String pal = scan.next();
			
			System.out.println("Escribe un numero para Habla");
			String n = scan.next();
			
			//pasar datos a traves de OutputStream
			PrintWriter pw = new PrintWriter(p.getOutputStream());
			pw.write(pal+"\n"+n);
			pw.close();
			
			//mostrar salida
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(), "UTF-8"));
			br.lines().forEach(System.out::println);
			br.close();
			
			scan.close();
		}catch(IOException e) {
		}
	}

}
