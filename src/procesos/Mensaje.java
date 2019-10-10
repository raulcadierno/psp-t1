package procesos;

public class Mensaje {

	public static void main(String[] args) {

		if(args.length < 2)
			System.out.println("Se necesitan una palabra y un numero");
		else {
			
			int num = Integer.parseInt(args[1]);
			
			for(int i=0; i<num; i++) {
				System.out.println(args[0]);
			}
		}
			

	}

}
