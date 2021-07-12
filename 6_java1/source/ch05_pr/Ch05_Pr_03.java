import java.util.Scanner;

public class Ch05_Pr_03 {

	public static void main(String[] args) {
		int inputArr[]=new int[5];
		Scanner scan = new Scanner(System.in);
		int i=0, sum=0;
		for(i=0;i<inputArr.length;i++)
		{
			inputArr[i]= scan.nextInt();
		}
		
		for(i=0;i<inputArr.length;i+=2)
		{
			sum = inputArr[i];
			
		} 
		System.out.println("sum : "+sum);

				

	}

}
