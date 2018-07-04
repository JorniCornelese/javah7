// Oefening 0703
public class Oefening0703 {
  public static void main( String[] args ) {
  	Bestelling bestelling = new Bestelling();

    Artikel artikel1 = new Artikel( "TV-Flatscreen 32 inch", 640.42, 19.0 );
    Artikel artikel2 = new Artikel( "PC zonder monitor", 420.00, 19.0 );
    Artikel artikel3 = new Artikel( "Boek", 35.66, 6.0 );
    
    bestelling.voegtoe( artikel1 );
    bestelling.voegtoe( artikel2 );
    bestelling.voegtoe( artikel3 );

  	bestelling.print();
  }
}
