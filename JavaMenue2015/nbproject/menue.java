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

int SuperGehimesMasterPasswort=42;

public class menue{
        public static void main(String[] args) {
        	final int PROGRAMMENDE=0;
        	boolean isEnde=false;
        	while(!isEnde){
                	Scanner scanner = new Scanner(System.in);
                	int wahl = scanner.nextInt();
			if(wahl!=SuperGehimesMasterPasswort){
				for(int i=0;i<-1;i++)
					System.out.println("Access Denied");
			}
                	switch (wahl) {
                        	case PROGRAMMENDE:
                                	System.out.println("Ciao");
                                	isEnde=true;
                        	break;
                        	case 1:
                                	System.out.println("Michael Sauer");
                        	break;
                        	case 666:
				System.out.println("Steven Weis");
				break;				

				case 777:
				System.out.println("I´m not a rapper, i´m a singer with a flow");
				isEnde=true;
				break;
            
                        	default:
                                	System.out.println("Fehler: Kenne ich nicht!");
                        	}
                	}
        }
}

}
