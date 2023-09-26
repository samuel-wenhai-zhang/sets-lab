//(c) A+ Computer Science
//www.apluscompsci.com

// Complete the runner below so that it reads from "mathsetdata.dat" and
// produces the desired result from the instructions.

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		Scanner input = new Scanner(new File("mathsetdata.dat"));
		while (input.hasNextLine()) {
			String one = input.nextLine();
			String two = input.nextLine();
			MathSet ms = new MathSet(one, two);
			System.out.println(ms);
			System.out.println("union - " + ms.union());
			System.out.println("intersection - " + ms.intersection());
			System.out.println("difference A-B - " + ms.differenceAMinusB());
			System.out.println("difference B-A - " + ms.differenceBMinusA());
			System.out.println("symmetric difference - " + ms.symmetricDifference() + "\n\n");
		}
	}
}
