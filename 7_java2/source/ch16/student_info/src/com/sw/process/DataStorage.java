package com.sw.process;

import java.util.*;

public class DataStorage {
	private List<StudentInfo> stList = null;
	public DataStorage() {
		stList= new ArrayList<StudentInfo>();
	}
	public  List<StudentInfo> getStudentList(){
		return stList;
	}
	
}
