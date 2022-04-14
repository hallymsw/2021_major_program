package ch04_pr;

import java.util.Scanner;
public class Ch04_loop_Pr_103 {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i =0; i<num;i++) {
			for(int j =0; j<num*2-1;j++) {
				if(num+1-(i*2)<=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();			
		}
		
		sc.close();
	
	}
}
