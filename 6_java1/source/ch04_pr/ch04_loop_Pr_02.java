package ch04_pr;

import java.util.Scanner;
public class ch04_loop_Pr_02 {
	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		int num=0, count=0, sum=0;
		double avg=0;
		//2. 반복문 - 입력, 처리
		while(true) {
			//1. 키보드 입력
			num=sc.nextInt();
			
			//6. 카운팅
			count++;
//			count=count+1;
			//4. 합계
//			sum=sum+num;
			sum+=num;

			//3. 100이상이 입력이 되면 끝, 마지막수 포함	
			if(num>=100) {
				break;
			}			
		}
		//5. 평균 -> 합계/카운팅
		avg=sum/count;
		

	}
}
