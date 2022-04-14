package ch04_pr;

import java.util.Scanner;
public class Ch04_loop_Pr_18 {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i =0; i<num;i++) {
			for(int j =0; j<num;j++) {
				if(i>j) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();			
		}
		
		sc.close();
	
	}
}
