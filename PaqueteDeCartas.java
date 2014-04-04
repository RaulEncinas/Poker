package principal;

import java.util.Random;

public class PaqueteDeCartas{
	private Carta paquete[];
	private int cartaActual;
	private final int NUMERO_DE_CARTAS = 52;
	private Random numerosAleatorios;

	
	public PaqueteDeCartas(){
		
		String caras[] = { "AS", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE",
		"OCHO", "NUEVE", "DIEZ", "JOTA", "DAMA", "REY"};
		String palos[] = { "CORAZONES", "DIAMANTES", "TREBOLES", "ESPADAS"};
		
		paquete = new Carta[ NUMERO_DE_CARTAS ];
		cartaActual = 0;
		numerosAleatorios = new Random();
		
		for ( int i = 0; i < paquete.length; i++ )
		paquete[ i ] = new Carta( caras[i % 13], palos[i/13]); 
	}
	
	
	public void barajar(){
		cartaActual = 0;
		
		for ( int i = 0; i < paquete.length; i++ ){ 
			int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
			
			Carta aux = paquete[i];
			
			paquete[i] = paquete[segunda];
			paquete[segunda] = aux;
			
		}
	}
	
	public Carta repartirCarta(){
	if (cartaActual < paquete.length )
		 return paquete[cartaActual++];
	 else return null;
	}
}
