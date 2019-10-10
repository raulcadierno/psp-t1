package ejecutar;

import java.io.IOException;

public class NotePadexe {

	public static void main(String[] args) {
		
		//Ejecuta notepad.exe
		
		Runtime r= Runtime.getRuntime();
		
		try {
			
			Process p= r.exec("NOTEPAD");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
