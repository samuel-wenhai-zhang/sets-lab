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
		String[] words1 = o.split(" ");
		String[] words2 = t.split(" ");
		for (String word : words1) {
			one.add(Integer.parseInt(word));
		}
		for (String word : words2) {
			two.add(Integer.parseInt(word));
		}
	}

	public Set<Integer> union()
	{
		Set<Integer> union = new TreeSet<Integer>();
		union.addAll(one);
		union.addAll(two);
		return union;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> intersection = new TreeSet<Integer>();
		intersection.addAll(one);
		intersection.retainAll(two);
		return intersection;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> difference = new TreeSet<Integer>();
		difference.addAll(one);
		difference.removeAll(two);
		return difference;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> difference = new TreeSet<Integer>();
		difference.addAll(two);
		difference.removeAll(one);
		return difference;
	}

	public Set<Integer> symmetricDifference()
	{
		Set<Integer> symmetry = new TreeSet<Integer>();
		Set<Integer> union = union();
		Set<Integer> intersection = intersection();
		symmetry.addAll(union);
		symmetry.removeAll(intersection);
		return symmetry;
	}

	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}