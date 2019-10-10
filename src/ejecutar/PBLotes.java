package ejecutar;

import java.io.File;
import java.io.IOException;

public class PBLotes {

	public static void main(String[] args) throws IOException {
		
		ProcessBuilder pb= new ProcessBuilder("CMD");
		
		File fout= new File("pbout.txt");
		File fin= new File("pbin.txt");
		File ferr= new File("pberr.txt");
		
		pb.redirectInput(fin);
		pb.redirectError(ferr);
		pb.redirectOutput(fout);
		
		pb.start();
	}

}
