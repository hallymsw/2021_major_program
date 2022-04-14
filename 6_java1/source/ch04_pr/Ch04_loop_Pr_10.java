package com.sw.fileIo;
import java.util.*;
public class Ch04_loop_Pr_10 {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int oddCount=0, evenCount=0, num=0;
		for(int i=0;i<10;i++) {
			num=sc.nextInt();
			
			if(num%2==0){// 짝수
				evenCount++;
				
			}
			else {//홀수
				oddCount++;
			}	
		}
		System.out.println("odd - "+oddCount+", even - "+evenCount);

		
	}//main

}
