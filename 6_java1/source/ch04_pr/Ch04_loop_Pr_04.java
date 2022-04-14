package com.sw.fileIo;
import java.util.*;
public class Ch04_loop_Pr_04 {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		double sum=0, avg=0; 
		int count=0, num=0;
		while(true) {
			num=sc.nextInt();
			if(num<0 || num > 100) {
				break;
			}
			sum=sum+num;
			count++;	
		}
		avg=sum/count;
		System.out.println("sum - "+sum+", avg - "+avg);


	}

}
