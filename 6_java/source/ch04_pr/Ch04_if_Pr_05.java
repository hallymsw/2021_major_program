package ch04_pr;

import java.util.Scanner; 

public class  Ch04_if_Pr_05 {
	public static void main(String[] args){
		int n1=0,n2=0, n3=0;
		int min=0;
		Scanner sc = new Scanner(System.in);
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		if(n1<n2)
		{
			min=n1;
			
			if(n3<n1){
				min=n3;
			}
		}
		else
		{
			min=n2;
			if(n3<n2){
				min=n3;
			}
			
		}
		System.out.println(min);

		
		
		
	}
}


