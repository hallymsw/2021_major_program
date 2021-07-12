import java.util.Scanner;

public class Ch05_Pr_01 {

	public static void main(String[] args) {
		double scoreArr[]= {85.6, 79.5, 83.1, 80, 78.2,75};
		Scanner scan = new Scanner(System.in);
		int i=0;
		double sum=0;
		int inputArr[]=new int[2];
		for(i=0;i<inputArr.length;i++)
		{
			inputArr[i]= scan.nextInt();
		}
		
		for(i=0;i<inputArr.length;i++)
		{
			int cls = inputArr[i];
			sum=sum+scoreArr[cls-1];
		} 
		
		System.out.println(sum);
				

	}

}
