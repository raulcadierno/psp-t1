package ejecutar;

import java.io.*;

public class ExecCompilar {

	public static void main(String[] args) {
		// Ejecuta control.compilar
		
		//Runtime r= Runtime.getRuntime();
		
		try {

			ProcessBuilder pb= new ProcessBuilder("java", "-cp", "bin", "control.Compilar");
			
			File fout= new File("pbout.txt");
			File ferr= new File("pberr.txt");
			
			pb.redirectOutput(fout);
			pb.redirectError(ferr);
			
			pb.start();
			
		}catch(IOException e) {
		}

	}

}
