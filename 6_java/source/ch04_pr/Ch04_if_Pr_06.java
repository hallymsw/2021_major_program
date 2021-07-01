package ch04_pr;

import java.util.Scanner; 

public class  Ch04_if_Pr_06 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String strInput = sc.next();
		if(strInput.equals("A")) {
			System.out.println("Excellent");
		}else if(strInput.equals("B")) {
			System.out.println("Good");
		}else if(strInput.equals("C")) {
			System.out.println("Usually");
		}else if(strInput.equals("D")) {
			System.out.println("Effort");
		}else if(strInput.equals("F")) {
			System.out.println("Failure");
		}else{
			System.out.println("Error");
		}
		
	}
}


