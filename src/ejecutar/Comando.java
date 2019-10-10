package ejecutar;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Comando {

	public static void main(String[] args) {
		
		/*Ejecuta un comando cualquiera que se introduce como argumento
		 * 
		 * EJ: java -cp bin ejecutaar.Comando DIR
		 */
		
		Runtime r= Runtime.getRuntime();
		
		if(args.length==0) {
			
			System.out.println("No hay comando");
			System.exit(1);//ERROR
		}
		
		String com= args[0];
		System.out.println(com);
		
		Process p= null;
		InputStream is= null;
		FileWriter fw= null;
		
		try {
			p= r.exec("CMD /C"+com);
			is= p.getInputStream();
			
			BufferedReader br= new BufferedReader(new InputStreamReader(is));
			
			String linea= "";
			
			fw = new FileWriter("log.txt");
			
			while((linea=br.readLine())!=null) {
				System.out.println(linea);
				fw.append(linea+'\n');
			}
		
			fw.close();
			br.close();
		}catch (IOException e) {
		}
	}
}
