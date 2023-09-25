//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;

public class UniquesDupes
{
	public static Set<String> getUniques(String input)
	{

		String[] words = input.split(" ");
		Set<String> uniques = new TreeSet<String>(Arrays.asList(words));

		return uniques;
	}

	public static Set<String> getDupes(String input)
	{
		Set<String> dupes = new TreeSet<String>();
		Set<String> set = new TreeSet<String>();
		String[] words = input.split(" ");
		for(String word : words) {
			if (!set.add(word)) {
				dupes.add(word);
			}
		}
		
		
		return dupes;
	}
}