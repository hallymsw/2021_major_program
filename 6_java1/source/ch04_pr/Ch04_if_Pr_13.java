package ch04_pr;
import java.util.Scanner;
public class  Ch04_if_Pr_13 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String gender=null;
		int age=0;
		gender = sc.nextLine();
		age = sc.nextInt();
		
		if(gender.equals("F"))
		{
			
			if(age>18)
			{

				System.out.println("women");
			}
			else
			{
				
				System.out.println("girl");
			}

		}
		else
		{
			if(age>18)
			{
				
				System.out.println("men");
			}
			else
			{
				
				System.out.println("boy");
			}
		}
		
		
	}
}


