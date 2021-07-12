import java.util.Scanner;

public class Ch05_Pr_04 {

	public static void main(String[] args) {
		int numArr[]=new int[10];
		Scanner scan = new Scanner(System.in);
		int i=0;
		double oddSum=0, evenSum=0,avg=0;
		
		for(i=0;i<numArr.length;i++)
		{
			numArr[i]= scan.nextInt();
		}
		
		for(i=0;i<numArr.length;i++)
		{
			if(i%2==0)
			{
				oddSum+=numArr[i];
			}
			else
			{
				evenSum+=numArr[i];
			}
		} 
		
		System.out.println("event sum : "+evenSum);
		System.out.println("odd sum : "+oddSum);
				

	}

}
