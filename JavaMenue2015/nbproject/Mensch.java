public class Mensch{

int Intelligenz;
int Aussehen;
String Name;


public Mensch(int i, int a, String n){
	Intelligenz=i;
	Aussehen=a;
	Name=n;
}
public String toString(){
	StringBuilder sb = new StringBuilder();
	sb.append("Intelligenz: " 	+ i 	+ \n
			+ "Aussehen: " 	+ a 	+\n
			+ "Name: " 	+ n	);
	return sb.toString();
}
}
