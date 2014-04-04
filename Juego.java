package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Juego {
	PaqueteDeCartas obj=new PaqueteDeCartas();
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	int numeroJugadores;
	Carta[][] mano;
	Carta[] cartasMesa=new Carta [5];
	public void repartir() throws IOException {
				
		System.out.println("Introduzca el número de jugadores(Max 8)");
		numeroJugadores=Integer.parseInt(in.readLine());
		mano=new Carta[numeroJugadores][2];
		obj.barajar();
		for (int i = 0; i < mano[1].length; i++) {
			for (int j = 0; j < mano.length; j++) {
				mano[j][i]=obj.repartirCarta();
			}
		}
		for (int j = 0; j < numeroJugadores; j++) {
			System.out.print("Jugador "+(j+1)+" tiene: ");
			for (int i = 0; i < mano[1].length; i++) {
				System.out.print(mano[j][i]);
				System.out.print("     ");
			}
			System.out.println();
		}
	}
	
	public void floop(){
		System.out.println("-----FLOOP-----");
		Carta aux;
		obj.repartirCarta();
		for (int i = 0; i < 3; i++) {
			aux=obj.repartirCarta();
			cartasMesa[i]=aux;
			System.out.println(aux);
		}
	}
	
	public void turn(){
		System.out.println("-----TURN-----");
		Carta aux;
		obj.repartirCarta();
		aux=obj.repartirCarta();
		cartasMesa[3]=aux;
		System.out.println(aux);
	}
	
	public void river(){
		System.out.println("-----RIVER-----");
		Carta aux;
		obj.repartirCarta();
		aux=obj.repartirCarta();
		cartasMesa[4]=aux;
		System.out.println(aux);
	}
}
