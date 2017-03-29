import java.util.*;
public class Synonyms {
	
	// function to add synonym
	public void addSym(Map<String, HashSet<String>> synonyms, String key, String value){
		HashSet<String> values = synonyms.get(key); // to match key is the synonym map
	    if (values == null) {
	        values = new HashSet<String>();
	    }
	    values.add(value);     // adds the word and its synonyms to the synonym map
	    synonyms.put(key, values);
	    
	    // now the following code add commutative and transitive functionality
	    HashSet<String> symVal = new HashSet<String>();
	    symVal.add(key);
	    for(String setVal: values)
	    {
	    	symVal.add(setVal);
		    synonyms.put(setVal, symVal);
	    }
	    
	}
	// function to display the synonyms of the given word
	public void getSym(Map<String, HashSet<String>> synonyms, String key)
	{
		if(! synonyms.containsKey(key))
		{
			System.out.println("The word cannot be found");
		}
		else
		{
			System.out.println("The synonym for the word:" + key);
			for(String val: synonyms.get(key)){
				if(!val.equals(key))
				System.out.println(val + " ");
			}
		}
	}
}
