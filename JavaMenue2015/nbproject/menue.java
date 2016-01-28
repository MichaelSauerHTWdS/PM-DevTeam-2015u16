/*
 * Gerüst für ein kleines Java-Menue um mit Git VCS zu lernen
 * Michael Sauer, 22.01.2016
 * 
 */
import java.util.Scanner;
/**
 *
 * @author DaBoss
 */



public class menue{
int SuperGehimesMasterPasswort=42;

	public int DaBoss(){
		System.out.println("Are you a Boss?");
		Scanner scanner = new Scanner(System.in);
                	int wahl = scanner.nextInt();
		if(wahl==SuperGeheimesMasterPasswort)
			System.out.println("Jo, Boss");
		else
		System.out.println("No you looser");
}






        public static void main(String[] args) {
        	final int PROGRAMMENDE=0;
        	boolean isEnde=false;
        	while(!isEnde){
                	Scanner scanner = new Scanner(System.in);
			System.out.println("Bitte eine Zahl eingeben um Namen anzuzeigen, 0 fuer ende. Passwort wird benoetigt.");
                	int wahl = scanner.nextInt();
			if(wahl!=SuperGehimesMasterPasswort){
				for(int i=0;i<-1;i++)
					System.out.println("Access Denied");
			}
                	switch (wahl) {
                        	case PROGRAMMENDE:
                                	System.out.println("Ciao");
                                	isEnde=true;
                        	
                        	case 1:
                                	System.out.println("Michael Sauer");

                        	break;
                        	case 2:
                        			System.out.println("Mike Mann");
                        	break;

                        	
                        	case 666:
				System.out.println("Steven Weis");
				break;
				case 15:
            				System.out.println("Marvin Zeimet");
				break;

                        	default:
                                	System.out.println("Fehler: Kenne ich nicht!");
                        	}
                	}
        }
}
