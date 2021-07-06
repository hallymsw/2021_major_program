import java.util.Scanner;

public class Ch05_Pr_02 {

	public static void main(String[] args) {
		int inputArr[]=new int[10];
		Scanner scan = new Scanner(System.in);
		int i=0, val=0, oddSum=0, evenSum=0, cnt=0;
		double avg=0;
		for(i=0;i<inputArr.length;i++)
		{
			inputArr[i]= scan.nextInt();
		}
		
		for(i=0;i<inputArr.length;i++)
		{
			val = inputArr[i];
			if(i%2==0) {//홀수번째
				oddSum++;
				cnt++;
			}
			else {
				evenSum++;
			}
		} 
		avg=oddSum/cnt;
		System.out.println("sum : "+evenSum);
		System.out.println("avg : "+avg);

				

	}

}
