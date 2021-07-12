package ch04_pr;

import java.util.Scanner;
public class ch04_loop_Pr_108 {
//	public static void main(String[] args) {
//		Scanner sc  =new Scanner(System.in);
//		int loopNum = sc.nextInt();
//		int num=1;
//		for(int i =0; i<loopNum;i++) {
//			for(int j =0; j<loopNum;j++) {
//				if(j>=i) {
//					System.out.print(num);
//					num++;
//					
//				}
//				else {
//					System.out.print(" ");
//				}
//					
//				
//			}
//			System.out.println();			
//		}
//		
//		sc.close();
//	
//	}
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int loopNum = sc.nextInt();
		int num=1;
		for(int i =0; i<loopNum;i++) {
			for(int j =0; j<loopNum;j++) {
				if(j<i) {
					System.out.print(" ");
				}
				else {
					System.out.print(num);
					num++;
				}
					
				
			}
			System.out.println();			
		}
		
		sc.close();
	
	}
}
