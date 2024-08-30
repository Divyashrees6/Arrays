package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Scanner_Array {

	public static void main(String[] args) {

		int rollno[]=new int[3];
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the int values to create Array");
		 for(int i=0;i<rollno.length;i++)
		 {
			 rollno[i]=s1.nextInt();
		 }	
		 s1.close();
	
	System.out.println(Arrays.toString(rollno));

	} // how to take value of array using scanner class
	

}
