import java.util.Scanner;

public class Ch05_Pr_08 {

	public static void main(String[] args) {
		int numArr[]=new int[100];
		Scanner scan = new Scanner(System.in);
		int i=0, count=0;
		
 
		for(i=0;i<numArr.length;i++)
		{
			int num= scan.nextInt();
			if(num==0)
			{
				break;
			}
			numArr[i]=num;
			count++;
		}
		System.out.println(" "+count);

		for(i=0;i<count;i++)
		{
			if(numArr[i]%2==1) {
				numArr[i]=numArr[i]*2;
			}
			else {
				numArr[i]=numArr[i]/2;
			}
		} 
		for(i=0;i<count;i++)
		{
			System.out.print(numArr[i]+" ");
		}

		
				

	}

}
