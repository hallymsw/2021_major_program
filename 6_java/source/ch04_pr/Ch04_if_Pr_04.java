package ch04_pr;

import java.util.Scanner; 

public class  Ch04_if_Pr_04 {
	public static void main(String[] args){
		int fNum=0, sNum=0;
		int res=0;
		int min=0;

 
		Scanner sc = new Scanner(System.in);
		fNum = sc.nextInt();
		sNum = sc.nextInt();
		if(fNum>sNum)
		{
			res = fNum - sNum;
		}
		else
		{
			res = sNum - fNum;
		}
		

		System.out.println(res);
		

		
		
		
	}
}


