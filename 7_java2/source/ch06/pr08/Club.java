package ch06.pr08;
import java.util.*;
public class Club{
	String[] mName;
	int[] mAge;
	int arrLen=0;
	
	//리턴타입 메소드명(매개변수){
//	}
	//메소드명(매개변수){
//	}
	Club(){
		arrLen=5;
		mName = new String[arrLen];
		mAge = new int[arrLen];
	}
	Club(int[] numArr){
		numArr = new int[5];
	}
	void setMemberNames() {
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<mName.length;i++) {
			String name = sc.next();
			this.mName[i]=name;
		}
	}
	void setMemberAges(){
		
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<mAge.length;i++) {
			int  age = sc.nextInt();
			this.mAge[i]=age;
		}
	}
	
	
	int[] getAgesOver(int age) {
		int[] ageArr=new int[arrLen];
		int valCount=0;
		for(int i=0;i<5;i++) {
			if(mAge[i]>=age) {
				ageArr[valCount]=mAge[i];
				valCount++;
			}
		}
		return ageArr;
	}
	String[] getNamesOver(int age) {
		String[] nameArr=new String[arrLen];
		int valCount=0;
		for(int i=0;i<5;i++) {
			if(mAge[i]>=age) {
				nameArr[valCount]=mName[i];
				valCount++;
			}
		}
		return nameArr;
	}
	void printNames() {
		for(int i=0;i<mName.length;i++) {
			System.out.println(this.mName[i]);
		}
	}
	void printAges() {
		for(int i=0;i<mName.length;i++) {
			System.out.println(this.mAge[i]);
		}
	}
	
}
