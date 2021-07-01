package ch04_pr;

import java.util.Scanner;
public class ch04_loop_Pr_101 {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		String inputStr = sc.next();
		
		if(inputStr.equals("A")) {
			System.out.println("Excellent");
		}else if(inputStr.equals("B")) {
			System.out.println("Good");
		}else if(inputStr.equals("C")) {
			System.out.println("Usually");
		}else if(inputStr.equals("D")) {
			System.out.println("Excellent");
		}else if(inputStr.equals("E")) {
			System.out.println("Effort");
		}else if(inputStr.equals("F")) {
			System.out.println("Failure");
		}else {
			System.out.println("error");
		}
		
		sc.close();
	
	}
}
