package ch06.file.pr01;

public class SubJectScoreMain {

	public static void main(String[] args) {
		String data ="이름 국어 영어 수학 과학 사회 음악 체육:김철수 80 60 70 100 80 90 100:박유철 60 90 90 100 90 90 70:김영희 100 100 60 70 90 90 100:최수지 80 40 50 70 80 100 100";

		String[] rowArr=data.split(":");
		System.out.println(rowArr.length);		

	}

}
