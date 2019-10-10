package procesos;

import java.io.IOException;

public class ExecHola {

	public static void main(String[] args) {

		ProcessBuilder pb= new ProcessBuilder("java", "-cp", "bin", "procesos.ExecHola").inheritIO();
		
		try {
			pb.start();
		} catch (IOException e) {
		}
	}

}
