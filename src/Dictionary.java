import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Dictionary {

	public static void main(String args[])
	{
		Map<String, String> container = new HashMap<String, String>(); // to hold word and its meaning
		
		Map<String, HashSet<String>> synonyms = new HashMap<String, HashSet<String>>(); // to hold synonyms
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.nextLine();
		System.out.println("Enter its meaning");
		String meaning = sc.nextLine();
		AddWord dictAdd = new AddWord();
		Synonyms sim = new Synonyms();
		dictAdd.addWord(container, word, meaning);
		System.out.println("Enter the word for lookup");
		String lookup = sc.nextLine();
		dictAdd.lookupWord(container, lookup);
		
		System.out.println("Enter the synonym for the word");
		String sym1 = sc.nextLine();
		dictAdd.addWord(container, sym1, meaning);
		sim.addSym(synonyms, word, sym1);
		System.out.println("Enter the synonym for the word");
		String sym2 = sc.nextLine();
		dictAdd.addWord(container, sym2, meaning);
		sim.addSym(synonyms, word, sym2);
		
		sim.getSym(synonyms, word);
		sim.getSym(synonyms, sym1);
		sim.getSym(synonyms, sym2);
		
		sc.close();
	}
}
