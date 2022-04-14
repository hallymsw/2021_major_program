package com.sw.fileIo;
import java.util.*;
public class Ch04_loop_Pr_15 {

	public static void main(String[] args) {
		
		Scanner sc  =new Scanner(System.in);
		int num=0,  i=1, count=0;;
		int sum=0;
		
		num=sc.nextInt();

		while(true) {
			sum=sum+i;
			i=i+2;
			count++;

			if(sum>=num) {
				break;
			}
		
		
		}
		System.out.println(count+" "+sum);
		
		
	}//main

}
