import java.util.Scanner;

public class Ch05_Pr_07 {

	public static void main(String[] args) {
		int dataArr[]=new int[100];
		Scanner scan = new Scanner(System.in);
		int i=0, num=0, inputCnt=0, sum=0;
		double avg=0;
		
		
		for(i=0;i<dataArr.length;i++){
			num= scan.nextInt();
			if(num==0) {
				break;
			}

			dataArr[i]=num;
			inputCnt++;

		}
		System.out.println("inputCnt : "+inputCnt);
		for(i=0;i<inputCnt;i++){
			if(dataArr[i]%5==0) {
				sum+=dataArr[i];
			}
		}
		avg=sum/inputCnt;
		System.out.println("avg : "+avg);

		
	}

}
