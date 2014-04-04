package principal;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		Juego obj=new Juego();
		obj.repartir();
		obj.floop();
		obj.turn();
		obj.river();
		

	}

}
