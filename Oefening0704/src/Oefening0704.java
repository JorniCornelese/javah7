// Oefening 0704
public class Oefening0704 {
  public static void main( String[] args ) {
  	Scorebord scorebord = new Scorebord();

    scorebord.verhoogScore1();
    scorebord.verhoogScore1();
    scorebord.verhoogScore2();
    scorebord.verhoogScore2();
    scorebord.verhoogScore2();
    
    scorebord.verhoogScore1();
    // Vergissing
    scorebord.verlaagScore1();
    // Toon de score 
    scorebord.print();
  }
}
