import java.util.Scanner;

public class Ch05_Pr_06 {

	public static void main(String[] args) {
		double dataArr[]=new double[6];
		Scanner scan = new Scanner(System.in);
		int i=0, sum=0;
		double avg=0;
		
		for(i=0;i<dataArr.length;i++)
		{
			dataArr[i]= scan.nextInt();
		}
		for(i=0;i<dataArr.length;i++)
		{
			sum+=dataArr[i];
		}
		avg=sum/dataArr.length;
		System.out.println("avg : "+avg);
		

	}

}
