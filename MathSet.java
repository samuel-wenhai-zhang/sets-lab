//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class MathSet
{
	private Set<Integer> one;
	private Set<Integer> two;

	public MathSet(String o, String t)
	{
		one = new TreeSet<Integer>();
		two = new TreeSet<Integer>();
		String[] words1 = o.split(" "), words2 = o.split(" ");
		for (String word : words1) {
			one.add(Integer.parseInt(word));
		}
		for (String word : words2) {
			two.add(Integer.parseInt(word));
		}
	}

	public Set<Integer> union()
	{
		return null;
	}

	public Set<Integer> intersection()
	{
		return null;
	}

	public Set<Integer> differenceAMinusB()
	{
		return null;
	}

	public Set<Integer> differenceBMinusA()
	{
		return null;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		return null;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}