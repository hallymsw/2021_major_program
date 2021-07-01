package ch04_pr;

public class  Ch04_if_Pr_11 {
	public static void main(String[] args){
		int inputYear=2008;
		
	
		if(inputYear%400==0 || (inputYear%4==0 && inputYear%100!=0))
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("common year");
		}
//		
		
	}
}


