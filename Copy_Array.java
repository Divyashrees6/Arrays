package Arrays;

import java.util.Arrays;

public class Copy_Array {
	public static void main(String[] args) {
			
		double Esalary[]=new double[3];
		Esalary[0]=3449.8;
		Esalary[1]=7659.6;
		Esalary[2]=43337.6;
		
		double Msalary[]=new double[3];
		for(int i=0;i<Esalary.length;i++)
		{
			Msalary[i]=Esalary[i];
		}
		
		System.out.println("List of employee salary before copying is ");
		System.out.println(Arrays.toString(Esalary));
		System.out.println("List of manager salary After copying is ");
		System.out.println(Arrays.toString(Msalary));

	}

}
