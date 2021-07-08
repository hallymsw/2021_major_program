package ch06.file.pr01;

public class StudentInfoProcess {
	String[] nameArr;
	String[] stNumArr;
	String[] phoneArr;
	String[] deptArr;
	int indexCount=0;
	public StudentInfoProcess(int len) {
		nameArr = new String[len];
		stNumArr = new String[len];
		phoneArr = new String[len];
		deptArr = new String[len];
	}
	public int saveDataInArray(String rowData) {
		int result=1;
		String[] stData=rowData.split(" ");
		nameArr[indexCount]=stData[0];
		stNumArr[indexCount]=stData[1];
		phoneArr[indexCount]=stData[2];
		deptArr[indexCount]=stData[3];
		indexCount++;
		return result;
	}
	public void printArray() {
		for(int i=0;i<indexCount;i++) {
			System.out.println(nameArr[i]);	
			System.out.println(stNumArr[i]);	
			System.out.println(phoneArr[i]);	
			System.out.println(deptArr[i]);	
		}
	}
	
	

}
