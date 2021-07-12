package ch04_pr;

import java.util.Scanner;
public class ch04_loop_Pr_101 {
	public static void main(String[] args) {
		int n;
	     Scanner sc = new Scanner(System.in);
	     n = sc.nextInt();
	     for(int i=0;i<n;i++){
	         for(int j=0;j<i;j++){
	          System.out.print(" ");
	         }
	         for(int j=0;j<((n-i)*2-1);j++){
	          System.out.print("*");
	         }
	         System.out.println("");
	     }
		sc.close();
	
	}
}
