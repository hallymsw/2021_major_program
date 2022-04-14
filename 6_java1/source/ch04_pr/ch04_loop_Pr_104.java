package ch04_pr;

import java.util.Scanner;
public class Ch04_loop_Pr_104 {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int loopNum = sc.nextInt();
		int num=1;
		for(int i =0; i<loopNum;i++) {
			num=1;
			for(int j =0; j<loopNum;j++) {
				if(loopNum-1-i<=j) {
					System.out.print(num);
					num++;
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
