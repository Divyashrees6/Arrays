package Arrays;
public class Average_value {
	public static void main(String[] args) {

		int num[]=new int[4];
		num[0]=45;
		num[1]=67;
		num[2]=54;
		num[3]=95;
		double sum=0;
		
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		
		double average=sum/4;
		System.out.println(average);
	}

}
