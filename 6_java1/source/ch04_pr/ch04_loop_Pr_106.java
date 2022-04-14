package ch04_pr;

import java.util.Scanner;
public class Ch04_loop_Pr_106 {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i =0; i<num*2-1;i++) {
			if(i<num) {
				for(int j =0; j<=i;j++) {
					System.out.print("*");
				}	
			}
			else {//3
				for(int j =0; j<=num*2-i-2;j++) {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
		sc.close();
	
	}
	
//	public static void main(String[] args) {     
//	     int num, i, j;
//	     Scanner sc = new Scanner(System.in);
//	      = sc.nextInt();
//	     for(i=0;i<num;i++){
//	         for(j=0;j<=i;j++){
//	          System.out.printf("*");
//	         }
//	         System.out.printf("\n");
//	     }
//	     for(i=0;i<num;i++){
//	         for(j=0;j<num-i-1;j++){
//	          System.out.printf("*");
//	         }
//	         System.out.printf("\n");
//	     }
//	 }
}
