package Arrays;
public class CheckNo_38 {
	public static void main(String[] args) {

		int [] rollno=new int[5];
		rollno[0]=100;
		rollno[1]=89;
		rollno[2]=200;
		rollno[3]=300;
		rollno[4]=400;
         int givennumber=200;
         
         for(int i=0; i<rollno.length;i++)
         {
        	if(givennumber==rollno[i])
        	{
        		System.out.println("Part of an Array ");
        	}
        	else
        	{
        		System.out.println("This value is Not a part of Array");
        	}
         }
		
	}

}
