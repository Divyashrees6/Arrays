package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class ScannerArray_double {

	public static void main(String[] args) {

		double rollno[]=new double[3];
		Scanner s1=new Scanner(System.in);
		 for(int i=0;i<rollno.length;i++)
		 {
			 rollno[i]=s1.nextDouble();
		 }	
		 s1.close();
	
	System.out.println(Arrays.toString(rollno));

	} // how to take value of array using scanner class
	

}
