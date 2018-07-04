// Oefening 0705
public class Oefening0705 {
  public static void main( String[] args ) {
  	Rapport rapport = new Rapport( "Jorni" );
  	
  	rapport.voegResultaatToe( new Resultaat( "Java", 9 ) );
  	rapport.voegResultaatToe( new Resultaat( "C++", 8 ) );
  	rapport.voegResultaatToe( new Resultaat( "Nederlands", 8 ) );
  	
  	rapport.print();
  }
}
