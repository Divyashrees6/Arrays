package Arrays;
import java.util.Arrays;

public class ToCharArrayalphabet {

	public static void main(String[] args) {

		String input="Da no 1";
		char[] c1= input.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		System.out.println("Finding Alphabet");
		for(int i=0;i<input.length();i++)
		{
			boolean answer1= Character.isAlphabetic(c1[i]);
			System.out.println(answer1);
		}
	}

}
