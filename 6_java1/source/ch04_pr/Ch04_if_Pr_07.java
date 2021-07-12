package ch04_pr;

import java.util.Scanner; 

public class  Ch04_if_Pr_07 {
	public static void main(String[] args){
		double score=0;
		
		Scanner sc = new Scanner(System.in);
		
		score = sc.nextDouble();
	

		if(score>=4.0){
			System.out.println("Scholarship");
		}else if(score>=3.0) {
			System.out.println("next semester");
		}else if(score>=2.0) {
			System.out.println("seasonal semester");
		}else if(score<2.0) {
			System.out.println("retake");
		}else {
			System.out.println("error");
		}
		

		
		
		
	}
}


