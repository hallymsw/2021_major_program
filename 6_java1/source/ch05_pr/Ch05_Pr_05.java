import java.util.Scanner;

public class Ch05_Pr_05 {

	public static void main(String[] args) {
		int dataArr[]=new int[100];
		Scanner scan = new Scanner(System.in);
		int i=0, num=0, inputCnt=0,case1=3, sum=0;
		
		
		for(i=0;i<dataArr.length;i++)
		{
			num= scan.nextInt();
			if(num==-1) {
				break;
			}

			dataArr[i]=num;
			inputCnt++;

		}
		System.out.println("inputCnt : "+inputCnt);

		if(inputCnt<=case1-1) {
			System.out.print("less : "+case1+" ");

			for(i=0;i<case1-1;i++)
			{
				sum+=dataArr[i];
			}
		}
		else {
			System.out.print("more : "+case1+" ");

			for(i=inputCnt-1;i>=inputCnt-case1;i--)
			{
//				System.out.println(inputCnt+", "+i+", "+sum);
				sum+=dataArr[i];
			} 
		}
		System.out.print(sum);
		
	}

}
