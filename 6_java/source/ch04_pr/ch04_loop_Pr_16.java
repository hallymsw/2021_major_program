package ch04_pr;

import java.util.Scanner;
public class ch04_loop_Pr_16 {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int n=1;
		System.out.println(row);
		System.out.println(col);
		for(int i =0; i<row;i++) {
			n=1;
			for(int j =0; j<col;j++) {
//				System.out.println("->"+i+", "+j);
				System.out.print(n*(i+1)+" ");
				n++;
			}
			System.out.println();
		}
		sc.close();

	}
}
