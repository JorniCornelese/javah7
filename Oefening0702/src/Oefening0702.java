// Oefening 0702
public class Oefening0702 {
  public static void main( String[] args ) {
  	Persoon auteur = new Persoon( "Gertjan Laan",  new Datum( 31, 1, 1950 ) );
  	Boek boek = new Boek( "Aan de slag met Java", "978 90 395 2757 3", auteur );
  	System.out.println( boek );
  }
}
