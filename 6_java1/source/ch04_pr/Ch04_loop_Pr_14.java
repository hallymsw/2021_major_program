package com.sw.fileIo;
import java.util.*;
public class Ch04_loop_Pr_14 {

	public static void main(String[] args) {
		
		Scanner sc  =new Scanner(System.in);
		int num=0, resNum=0, i=1;
		
		
		num=sc.nextInt();

		while(true) {//20개 입력받기
			resNum=num*i;
			i++;
			System.out.print(resNum+" ");
			if(resNum%10==0) {
				break;
			}
		
		
		}
		
		
		
	}//main

}
