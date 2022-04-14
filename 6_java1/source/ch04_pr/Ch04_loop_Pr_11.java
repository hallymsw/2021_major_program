package com.sw.fileIo;
import java.util.*;
public class Ch04_loop_Pr_11 {

	public static void main(String[] args) {
		
		Scanner sc  =new Scanner(System.in);
		int count=0, sn=0, en=0, i=0;
		double avg=0, sum=0;
		
		sn=sc.nextInt();
		en=sc.nextInt();
		for(i=sn;i<=en;i++) {//첫 입력받은 정수부터 두번째 입력 받은 정수까지 모든수의 값을 얻는다
			if(i%3==0) {//3의 배수 체크
				sum+=i;
				count++;
			}
			else if(i%5==0) {//3의 배수 체크
				sum+=i;
				count++;
			}
		}
	
		System.out.println("sum : "+sum);
		avg=sum/count;
		System.out.println("avg : "+avg);

	}//main

}
