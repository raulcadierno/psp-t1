package procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ExecHolaV2 {

	public static void main(String[] args) {

Runtime r= Runtime.getRuntime();
		
		try {

			Process p= r.exec("java -cp bin compilar.Hola.java");
			
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
