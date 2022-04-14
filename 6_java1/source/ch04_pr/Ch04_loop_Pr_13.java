package com.sw.fileIo;
import java.util.*;
public class Ch04_loop_Pr_13 {

	public static void main(String[] args) {
		
		Scanner sc  =new Scanner(System.in);
		int num=0, i=0,count=0;
		double avg=0,sum=0;
		
		
		for(i=0;i<20;i++) {//20개 입력받기
			num=sc.nextInt();
			sum=sum+num;
			count++;
			if(num==0) {//0 이면 입력 종료
				break;
			}
		
		}
		avg=sum/count;
		System.out.println("sum : "+sum+" , avg : "+avg);
		
	}//main

}
