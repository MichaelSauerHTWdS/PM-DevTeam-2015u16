import java.util.*;
import java.io.PrintWriter;

public class Store{
	public void writeFile(String name, String pw){
		PrintWriter writer = new PrintWriter("mwahaha.txt", "UTF-8");
		writer.println(name);
		writer.println(pw);
		writer.close();
	}
	
}