package ch06.file.pr01;

public class StudentInfoProcess {
	String[] nameArr;
	String[] stNumArr;
	String[] phoneArr;
	String[] deptArr;
	int indexCount=0;
	
	public String[] getNameArr() {
		return nameArr;
	}
	public String[] getStNumArr() {
		return stNumArr;
	}
	public String[] getPhoneArr() {
		return phoneArr;
	}
	public String[] getDeptArr() {
		return deptArr;
	}
	
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
	//인덱스 값에 0도 들어 있을 수 있으므로 반드시 인덱스를 가진 배열 길이도 알아야 한다.
	public int[] getIndexArrByName(String name) {
		int[] idxArr=new int[nameArr.length];

		for(int i=0;i<nameArr.length;i++) {
			if(name.equals(nameArr[i])) {
				idxArr[i]=1;			
			}
		}
		return idxArr;
	}
	public int[] getIndexArrByNumber(String num) {
		int[] idxArr=new int[stNumArr.length];

		for(int i=0;i<stNumArr.length;i++) {
			if(num.equals(stNumArr[i])) {
				idxArr[i]=1;			
			}
		}
		return idxArr;
	}
	public int[] getIndexArrByDept(String dept) {
		int[] idxArr=new int[deptArr.length];

		for(int i=0;i<deptArr.length;i++) {
			if(dept.equals(deptArr[i])) {
				idxArr[i]=1;			
			}
		}
		return idxArr;
	}
	public int[] getIndexArrByPhone(String phone) {
		int[] idxArr=new int[phoneArr.length];

		for(int i=0;i<deptArr.length;i++) {
			if(phone.equals(phoneArr[i])) {
				idxArr[i]=1;			
			}
		}
		return idxArr;
	}
}
