package com.sw.process;

import java.util.*;


public class DataAccess {
	private List<StudentInfo> stList = null;
	public DataAccess() {
		DataStorage ds = new DataStorage();
		stList=ds.getStudentList();
	}
	public List<StudentInfo> getStudnetList() {
		return stList;
	}
	public int addData(StudentInfo si) {
		int ret=0;
		stList.add(si);
		return ret;
	}
	public List<StudentInfo> getDataByName(String name) {
		List<StudentInfo> retList = new ArrayList<StudentInfo>();
		for(int i=0;i<stList.size();i++) {
			StudentInfo si =stList.get(i);
//			System.out.println(si.name+", "+si.num+", "+si.tel+", "+si.dept);
			if(si.name.equals(name)) {
				retList.add(si);
			}
			
		}
		return retList;
	}
	public StudentInfo getDataByNum(String num) {
		StudentInfo ret=null;
		for(int i=0;i<stList.size();i++) {
			StudentInfo si =stList.get(i);
//			System.out.println(si.name+", "+si.num+", "+si.tel+", "+si.dept);
			if(si.num.equals(num)) {
				ret=si;
			}
			
		}
		return ret;
	}
	public List<StudentInfo> getDataByDept(String dept) {
		List<StudentInfo> retList = new ArrayList<StudentInfo>();
		for(int i=0;i<stList.size();i++) {
			StudentInfo si =stList.get(i);
//			System.out.println(si.name+", "+si.num+", "+si.tel+", "+si.dept);
			if(si.dept.equals(dept)) {
				retList.add(si);
			}
			
		}
		return retList;
	}
	public void printStudentInfo() {
		System.out.println("-- printStudentInfo() --");
		List<StudentInfo> stl=stList;
		for(int i=0;i<stl.size();i++) {
			StudentInfo si =stl.get(i);
			System.out.println(si.name+", "+si.num+", "+si.tel+", "+si.dept);
		}
		System.out.println("------------------------");
		
		
	}
}
