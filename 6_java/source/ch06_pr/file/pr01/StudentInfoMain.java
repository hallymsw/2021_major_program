package ch06.file.pr01;

public class StudentInfoMain {

	public static void main(String[] args) {
		String data ="강감찬 2012685 010-1234-5681 경제학과:김유신 2013635 010-1234-5682 수의학과:정약용 2017654 010-1234-5683 통계학과";
		
		String[] rowArr=data.split(":");
		System.out.println(rowArr.length);	
		StudentInfoProcess sip = new StudentInfoProcess(rowArr.length);

		for(int i=0;i<rowArr.length;i++) {
			sip.saveDataInArray(rowArr[i]);
		}
		sip.printArray();
		

	}

}
