import java.util.Scanner;

/*
 * Geruest für ein kleines Java-Menue um mit Git VCS zu lernen
 * Michael Sauer, 22.01.2016
 * 
 *
 * @author DaBoss
 */
public class menue{
static int SuperGehimesMasterPasswort=42;

	public void DaBoss(){
		System.out.println("Are you a Boss?");
		Scanner scanner = new Scanner(System.in);
                	int wahl = scanner.nextInt();
		if(wahl==SuperGehimesMasterPasswort)
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
					DaBoss();
			}
                	switch (wahl) {
                        	case PROGRAMMENDE:
                                	System.out.println("Ciao");
                                	isEnde=true;
                        	
                        	case 1:
                                	System.out.println("Michael Sauer");

                        	break;

                        	case 2:
<<<<<<< HEAD
              //wer da sonst noch so wäre ...
                        	break;
				case 1722:
					System.out.println("ZoXlike was here :P");
				break;
=======
                        			System.out.println("Mike Mann");

                        	case 666:
				System.out.println("Steven Weis");
							

				case 777:
				System.out.println("I´m not a rapper, i´m a singer with a flow");
				isEnde=true;
           
				
				case 15:
            				System.out.println("Marvin Zeimet");
				

				case 36:
					System.out.println("Sebastian Strauch");
				
				case 1234:
					System.out.println("Dyu Vu");
				break;


>>>>>>> a6d075b0ac737f456b2ac47e99a3034608f9f9a0
                        	default:
                                	System.out.println("Fehler: Kenne ich nicht!");
                        	}
                	}
        }
}
