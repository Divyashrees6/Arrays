package Arrays;
import java.util.Arrays;
public class ToCharArray {

	public static void main(String[] args) {
             String input="Da no 1";
            char [] c1=   input.toCharArray();
            System.out.println(Arrays.toString(c1));
            
          boolean answer =  Character.isAlphabetic(c1[0]);
          boolean answer1 = Character.isAlphabetic(c1[1]);
          boolean answer2 = Character.isAlphabetic(c1[2]);

          
          System.out.println(answer);
          System.out.println(answer1);
          System.out.println(answer2);


          
          
	}

} 
