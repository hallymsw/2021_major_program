package ch06.file.pr01;

import java.util.Scanner;

public class StudentInfoMain {

	public static void main(String[] args) {
		String data ="강감찬 2012685 010-1234-5681 경제학과:김유신 2013635 010-1234-5682 수의학과:김유신 2015635 010-1234-5685 의학과:정약용 2017654 010-1234-5683 통계학과";
		Scanner sc = new Scanner(System.in);
		String[] nameArr=null, stNumArr=null, phoneArr=null, deptArr=null;
		
		String[] rowArr=data.split(":");
		int[] resultIndex= new int[rowArr.length];
		int indexCount=0;
		StudentInfoProcess sip = new StudentInfoProcess(rowArr.length);		

		for(int i=0;i<rowArr.length;i++) {
			sip.saveDataInArray(rowArr[i]);
		}
		
		nameArr=sip.getNameArr();
		stNumArr=sip.getStNumArr();
		phoneArr=sip.getPhoneArr();
		deptArr=sip.getDeptArr();

		while(true) {
			System.out.print("select a number(1-4) : ");
			int selNum = sc.nextInt();

			if(selNum==1) {
				System.out.print("input name : ");
				String name= sc.next();
				resultIndex=sip.getIndexArrByName(name);
				
				for(int i=0;i<resultIndex.length;i++) {
					if(resultIndex[i]==1){
						System.out.println(stNumArr[i]+" "+phoneArr[i]+" "+deptArr[i]);
					}
					
				}
				
			}else if(selNum==2) {

				System.out.print("input student number : ");
				String number= sc.next();
				resultIndex=sip.getIndexArrByNumber(number);
				
				for(int i=0;i<resultIndex.length;i++) {
					if(resultIndex[i]==1){
						System.out.println(nameArr[i]+" "+phoneArr[i]);
					}
					
				}
				
			}else if(selNum==3) {
				System.out.print("input deptment : ");
				String number= sc.next();
				resultIndex=sip.getIndexArrByDept(number);
				
				for(int i=0;i<resultIndex.length;i++) {
					if(resultIndex[i]==1){
						System.out.println(nameArr[i]+" "+stNumArr[i]);
					}
					
				}
				
			}else if(selNum==4) {
				System.out.print("input phone number : ");
				String phone= sc.next();
				resultIndex=sip.getIndexArrByPhone(phone);
				
				for(int i=0;i<resultIndex.length;i++) {
					if(resultIndex[i]==1){
						System.out.println(nameArr[i]+" "+stNumArr[i]+" "+deptArr[i]);
					}
					
				}
				
			}else {
				System.out.println("error");
			}
			
			
		}
		
		
		

	}

}
