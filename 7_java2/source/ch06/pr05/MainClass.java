package ch06.pr05;

public class MainClass {

	public static void main(String[] args) {
		int[] arr= null, retArr=null;
		arr= new int[5];// 0 0 0 0 0
		double retAvg=0;
		ClassInfo mc = new ClassInfo();
		retArr=mc.setValuesInArray(arr.length, arr);
		for(int i=0;i<retArr.length;i++) {
			System.out.println(retArr[i]);
		}
		retAvg=mc.getAvg(retArr);

		System.out.println(retAvg);
	}

}
