/** 
 * Hochschule Harz
 * Fachbereich Automatisierung und Informatik
 * Prof. Dr. Bernhard Zimmermann
 * 
 * LV "Programmierung 1" WiSe 2020
 *
 * Problem: 	Algorithmus, der f�r eine gegebene nat�rliche Zahl x die gr��te nat�r-liche Zahl berechnet, 
 * 				die kleiner oder gleich der Quadratwurzel von x ist.
 *     
 * @author Viktor G�rbert
 * @version 1.0
 * 
 */


public class Wurzel extends Environment {

  public static void main(String[] args) {
    new Wurzel().mainProgram(args);
  }

  void mainProgram(String[] args) {
    System.out.println("Hello World!");
    
    int quadratwurzel, input, summe; 
    int summand; 
    
    summand = 1; // wir starten bei 1
    quadratwurzel=0;
    summe = 1;
    
    System.out.print("Bitte eine Zahl X >= 1 eingeben: ");
    input = stdin.readInt();
    
    while(summe <= input) {
     	
    	quadratwurzel = quadratwurzel + 1; // Quadratwurzel ergibt sich aus anzahl der Durchl�ufe
    	
    	summand = summand+2; // n�chster Summand
     	
     	summe = summe + summand; // aufaddieren
    }
    
    System.out.println("Nat�rliche Quadratwurzel: " + quadratwurzel);
  }

} // Wurzel
