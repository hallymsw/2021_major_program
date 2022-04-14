package com.sw.fileIo;
import java.util.*;
public class Ch04_loop_Pr_12 {

	public static void main(String[] args) {
		
		Scanner sc  =new Scanner(System.in);
		int num=0, i=0,res=0;;
		
		num=sc.nextInt();
		for(i=1;i<11;i++) {//
			res=num*i;
			System.out.print(" "+res);
		}
	
		

	}//main

}
