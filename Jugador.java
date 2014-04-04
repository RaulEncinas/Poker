package principal;

public class Jugador {
	 private String nombre;
	 private int dinero;
	 
	 public Jugador( String nombreJugador, int dineroJugador, int v){
		 nombre = nombreJugador;
		 dinero = dineroJugador;

	 }

	 public String toString(){
		 return nombre + " tiene " + dinero +"€";
	 }
}
