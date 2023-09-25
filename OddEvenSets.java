//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class OddEvenSets
{
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets(String line)
	{
		String[] words = line.split(" ");
		odds = new TreeSet<Integer>();
		evens = new TreeSet<Integer>();
		for (String word : words) {
			int n = Integer.parseInt(word);
			if (n % 2 == 0) {
				evens.add(n);
			} else {
				odds.add(n);
			}
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}