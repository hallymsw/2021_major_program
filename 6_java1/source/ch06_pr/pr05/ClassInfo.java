package ch06.pr05;

public class ClassInfo{
	int num;
	int[] numArr;
	public int addNum(int i, int y)
	{
		return i+y;
	}	
	public int[] setValuesInArray(int size,int[] pArr){
		pArr = new int[size];//0,0,0
		for(int i=0;i<size;i++) {
			pArr[i]=(i+1)*10;
		}
		
		return pArr;
	}
	double getAvg(int[] pArr) {
		int sum=0;
		double avg=0;
		for(int i=0;i<pArr.length;i++) {
			sum+=pArr[i];
		}
		avg=sum/pArr.length;
		return avg;
	}
	
}
