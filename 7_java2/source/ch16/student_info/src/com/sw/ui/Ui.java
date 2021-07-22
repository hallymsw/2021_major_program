package com.sw.ui;
import java.util.*;
import com.sw.process.*;
public class Ui {
	Scanner sc= null;
	public static final int SearchByName=1;
	public static final int SearchByNumber=2;
	public static final int SearchByDept=3;
	public static final int Exit=4;
	public Ui() {
		sc = new Scanner(System.in);
	}
	public void showMenu() {
		System.out.println("1. 이름으로 검색");
		System.out.println("2. 학번으로 검색");
		System.out.println("3. 학과으로 검색");
		System.out.println("4. 종료");
	}
	public void showSearchWordStep() {
		System.out.println("키워드 입력");
		
	}
	public int getUserSelection() {
		int num =sc.nextInt();
		return num;
	}
	public String getKeyWord() {
		String ui = sc.next();
		return ui;
	}
	public void printSearchByName(List<StudentInfo> pList) {
		for(int i=0;i<pList.size();i++) {
			StudentInfo si = pList.get(i);
			System.out.println("학번 : "+si.num);
			System.out.println("전화번호 : "+si.tel);
			System.out.println("학과 : "+si.dept);
		}
		
	}
	public void printSearchByNumber(StudentInfo si) {
		System.out.println("이름 : "+si.name);
		System.out.println("전화번호 : "+si.tel);
	}
	public void printSearchByDept(List<StudentInfo> pList) {
		for(int i=0;i<pList.size();i++) {
			StudentInfo si = pList.get(i);
			System.out.println("이름 : "+si.name);
			System.out.println("학번 : "+si.num);

		}
	}
	public void printNoData() {
		System.out.println("해당데이터가 존재하지 않음 ");
	}
}
