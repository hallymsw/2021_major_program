package ch06.pr05;

public class ClassInfo {
	double getAvg(int[] score){		
		double ret=0;
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		ret=sum/score.length;
		return ret;
	}
	int[] setValuesInArray(int size, int[] pArr){
		for(int i=0;i<size;i++) {
			pArr[i]=(i+1)*10;// 10 20 30 40 50
		}
		return pArr;
	}
}