package ch06.file.pr01;

public class SalaryMain {

	public static void main(String[] args) {
		String data ="이름,실수령액,세금,국민연금:김철수,180,20,15:박유철,160,15,13:김영희,200,10,12:최수지,180,20,11";
//		String data ="20190215:아침식사:6000:480000";

		String[] rowArr=data.split(":");
		System.out.println(rowArr.length);		

	}

}
