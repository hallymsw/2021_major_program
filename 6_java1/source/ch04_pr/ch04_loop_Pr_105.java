package ch04_pr;

import java.util.Scanner;
public class Ch04_loop_Pr_105 {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i =0; i<num*2;i++) {
			if(i<num) {
				for(int j =i; j<num;j++) {
					System.out.print("*");
				}		
			}
			else {
				for(int j =0; j<=i-num;j++) {
					System.out.print("*");
				}	
				
			}	
			System.out.println();			
		}
			
		sc.close();
	
	}
	
//	public static void main(String[] args) {
//		Scanner sc  =new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for(int i =0; i<num;i++) {
//			for(int j =i; j<num;j++) {
//				System.out.print("*");
//			}
//			System.out.println();			
//		}
//		for(int i =0; i<num;i++) {
//				for(int j =0; j<=i;j++) {
//					System.out.print("*");
//				}
//				System.out.println();			
//		}
//		
//		sc.close();
//	
//	}
}
