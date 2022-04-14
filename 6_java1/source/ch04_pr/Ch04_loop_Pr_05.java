package com.sw.fileIo;
import java.util.*;
public class Ch04_loop_Pr_05 {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		double sum=0, avg=0; 
		int count=0, num=0;
		while(true) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.print("number? ");
			num=sc.nextInt();
			
			if(num==1) {
					System.out.println("Seoul");
			}
			else if(num==2) {
				System.out.println("Washington");
			}
			else if(num==3) {
				System.out.println("Tokyo");
			}
			else if(num==4) {
				System.out.println("Beijing");
			}
			else {
				System.out.println("none");
				break;
			}

		}


	}

}
