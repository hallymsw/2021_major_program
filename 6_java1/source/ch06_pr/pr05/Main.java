package ch06.pr05;

public class Main {

	public static void main(String[] args) {
		int arrNew[]=null;
		int arrVal[]=null;
		int size=3;
		double avg=0;
		ClassInfo ci=new ClassInfo();
		arrVal=ci.setValuesInArray(size,arrNew);
		for(int i=0;i<size;i++) {
//			System.out.println(i);
			System.out.println(arrVal[i]);
		}
		avg=ci.getAvg(arrVal);
		System.out.println(avg);

	}

}
