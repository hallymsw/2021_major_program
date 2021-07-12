package ch04_pr;

import java.util.Scanner; 

public class  Ch04_if_Pr_02 {
	public static void main(String[] args){
		int weight=0, height=0;

		double obeFormular = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("input height ");
		height = sc.nextInt();
		System.out.println("input weight ");
		weight = sc.nextInt();

		 obeFormular = weight+100-height;
		 System.out.println(obeFormular);

		 if(obeFormular>0)
		 {
			 System.out.println("obesity");
		 }
		
	}
}


