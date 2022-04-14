package ch04_pr;

import java.util.Scanner;
public class Ch04_loop_Pr_102 {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int loopNum = sc.nextInt();
		int num=1;
		int ascCode=65;
		for(int i =0; i<loopNum;i++) {
			for(int j =0; j<loopNum+1;j++) {
				if(j+i>=loopNum) {
					System.out.print((char)ascCode);
					ascCode++;
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
