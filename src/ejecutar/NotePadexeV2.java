package ejecutar;

import java.io.IOException;

public class NotePadexeV2 {

	public static void main(String[] args) {
		
		//Ejecuta notepad.exe
		
		ProcessBuilder pb= new ProcessBuilder("NOTEPAD");
		
		try {
			
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
