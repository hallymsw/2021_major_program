package com.sw.fileIo;
import java.util.*;
public class Ch04_loop_Pr_06 {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int count=0, num=0;
		while(true) {
			num=sc.nextInt();
			if(num==0) {
				break;
			}
			if(num%3==0){// 3의 배수 -> 아무 일도 않고 while의 처음으로
				continue;
				
			}
			if(num%5==0){// 5의 배수 -> 아무 일도 않고 while의 처음으로
				continue;
				
			}
			else {//홀수
				count++;
			}	
		}
		System.out.println("count - "+count);


	}

}
