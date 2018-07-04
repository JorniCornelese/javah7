public class Rapport {
  private String naam;
  private Cijferlijst cijferlijst;
  
  public Rapport( String naam ) {
    this.naam = naam;
    this.cijferlijst = new Cijferlijst();
  }

  public void voegResultaatToe( Resultaat resultaat ) {
  	cijferlijst.voegtoe( resultaat );
  }
  
  public void print() {
    System.out.println( "Rapport van: " + naam );
    cijferlijst.print();
  }
}
