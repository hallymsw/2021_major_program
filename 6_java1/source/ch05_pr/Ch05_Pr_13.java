

import java.util.Scanner;
public class Ch05_Pr_13 {
	public static void main(String[] args) {
		int numArr[]=new int[100];
		Scanner scan = new Scanner(System.in);
		int i=0, count=0, grade=0;
		int pArrLen=11;
		int personArr[]=new int[pArrLen];

 
		for(i=0;i<numArr.length;i++) {
			int num= scan.nextInt();
			if(num==0)
			{
				break;
			}
			numArr[i]=num;
			count++;
		}
		for(i=0;i<count;i++) {
			grade=numArr[i]/10;
//			System.out.println(i+" : "+grade);
			personArr[grade]=personArr[grade]+1;
		}
		System.out.println("----------");
		for(i=0;i<personArr.length;i++) {
			if(personArr[i]!=0) {
				System.out.println(i*10+" : "+personArr[i]+" person");
			}
		}
		scan.close();
		
	}
}
