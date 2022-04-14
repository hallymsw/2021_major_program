package com.sw.fileIo;
import java.util.*;
public class Ch04_loop_Pr_07 {

	public static void main(String[] args) {
		Scanner sc  =new Scanner(System.in);
		double base=0, height=0;
		double width=0;
		String con=null;
		String y1="Y", y2="y";
		while(true) {
			//입력
			System.out.print("Base = ");
			base=sc.nextInt();
			System.out.print("Height = ");
			height=sc.nextInt();
			
			//계산
			width = base*height/2;
			System.out.println("Triangle width =  - "+width);

			//다음 진행 여부
			System.out.print("Continue? ");
			con=sc.next();


			if(con.equals("y") || con.equals("Y")) {
				continue;
			}

			break;
			
		}


		
	}

}
