package ch04_pr;

import java.util.Scanner;
public class Ch04_loop_Pr_ {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int loopNum = sc.nextInt();
		int num=1;
		int ascCode=65;
		for(int i =0; i<loopNum;i++) {
			for(int j =0; j<loopNum;j++) {
				if(i<=j) {
					System.out.print((char)ascCode);
					ascCode++;
				}
				
			}
			System.out.println();			
		}
		
		sc.close();
	
	}
}
