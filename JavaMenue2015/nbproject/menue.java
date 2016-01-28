/*
 * Gerüst für ein kleines Java-Menue um mit Git VCS zu lernen
 * Michael Sauer, 22.01.2016
 * 
 */
import java.util.Scanner;
/**
 *
 * @author mike
 */


public class menue{
        public static void main(String[] args) {
        	final int PROGRAMMENDE=0;
        	boolean isEnde=false;
        	while(!isEnde){
                	Scanner scanner = new Scanner(System.in);
                	int wahl = scanner.nextInt();
                	switch (wahl) {
                        	case PROGRAMMENDE:
                                	System.out.println("Ciao");
                                	isEnde=true;
                        	break;
                        	case 1:
                                	System.out.println("Michael Sauer");
                        	break;
							case 2:
								break;
                        	case 42:
									for(int i = 0; i<5; i++){
										for(int j = 0; j < 5; j++)
										{
											System.out.print(" ");
										}
										for(int k = 0; k <= i; k++)
										{
											System.out.print("# ");
										}
										System.out.println();
									}
                        	break;
                        	default:
                                	System.out.println("Fehler: Kenne ich nicht!");
                        	}
                	}
        }
	}
