package ejecutar;

import java.io.*;

public class ExecCompilar2 {

	public static void main(String[] args) {
		// Ejecuta control.compilar
		
		Runtime r= Runtime.getRuntime();
		
		try {

			Process p= r.exec("java -cp bin control.Compilar");
			
			InputStream is= p.getInputStream();
			BufferedReader br= new BufferedReader(new InputStreamReader(is));
			
			String linea= null;
			
			while((linea=br.readLine())!=null) {
				System.out.println(linea);
			}
			
			br.close();
		}catch(IOException e) {
		}

	}

}
