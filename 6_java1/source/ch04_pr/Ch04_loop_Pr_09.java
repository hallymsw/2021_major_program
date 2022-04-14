package com.sw.fileIo;
import java.util.*;
public class Ch04_loop_Pr_09 {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int count=0, num=0, i=0;
		int sum=0;
		
		num=sc.nextInt();
		for(i=1;i<=num;i++) {//1부터 입력받은 정수까지 모든수의 값을 얻는다
			if(i%5==0) {//5의 배수 체크
				sum+=i;
			}
		}
	
		System.out.println("sum : "+sum);

		
	}//main

}
