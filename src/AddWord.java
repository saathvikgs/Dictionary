import java.util.*;
public class AddWord {
	//constructor
	public AddWord()
	{
		
	}
	//function pairs the word and its definition
	public void addWord(Map<String, String> container, String key, String value)
	{
		//if the word deosnt exist then add it to dictionary 
		if(! container.containsKey(key)){    
			container.put(key, value);
		    System.out.println("The insertion was successful");
		    System.out.println("The inserted word: " + key + " and its meaning: " + container.get(key));
		}
		else
		{
			System.out.println("The word already exists in the dictionary");
		}
	}
	// function to lookup word and to display its definition
	public void lookupWord(Map<String, String> container, String key)
	{
		if(! container.containsKey(key))  // to check if the word exists in dictionary or not
		{
			System.out.println("The word cannot be found");
		}
		else
		{
			System.out.println("The meaning for the word:" + key + " is " + container.get(key));
		}
	}
}
