package com.sw.fileIo;
import java.util.*;
public class Ch04_loop_Pr_08 {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		double sum=0, avg=0; 
		int score=0, num=0, count=0;
		num=sc.nextInt();
		for(int i=0;i<num;i++) {
			score=sc.nextInt();
			sum=sum+score;
			count++;		
		}
		avg=sum/count;
		System.out.println("avg : "+avg);
		if(avg>=80) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}


		
	}//main

}
