package ch06.pr08;

public class Main {

	public static void main(String[] args) {

		int age=15;
		int[] ageArr=null;
		String[] nameArr=null;
		Club ci=new Club();
		ci.setMemberNames();
		
		ci.setMemberAges();
//		ci.printNames();
//		ci.printAges();
//		ageArr=ci.getAgesOver(age);
		nameArr=ci.getNamesOver(age);
		for(int i=0;i<5;i++) {
			System.out.println(nameArr[i]);

		}
	}
	

}
