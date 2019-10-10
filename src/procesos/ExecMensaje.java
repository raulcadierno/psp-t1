package procesos;

import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

public class ExecMensaje {

	public static void main(String[] args) {
		ProcessBuilder pb= new ProcessBuilder("CMD", "/K", "java", "-cp", "bin", "procesos.Mensaje", args[0], args[1]);

		pb.redirectInput(Redirect.INHERIT);
		try {
			pb.start();
		}catch(IOException e) {
		}
	}

}
