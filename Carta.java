package principal;

public class Carta {
	 private String cara;
	 private String palo;
	 
	 public Carta( String caraCarta, String paloCarta){
		 cara = caraCarta;
		 palo = paloCarta;

	 }

	 public String toString(){
		 return cara + " de " + palo;
	 }
}
