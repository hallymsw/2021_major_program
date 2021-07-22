package com.sw.ui;
import com.sw.dataInput.*;
import com.sw.process.*;

import java.util.*;
public class MainClass {
	public static final int NO_DATA=0;

	public static void main(String[] args) {
		String fileName = "student_info.txt";
		DataAccess da = new DataAccess();
		FileDataInput fi = new FileDataInput(da);
		
		List<StudentInfo> retVal=null;
		Ui ui = new Ui();
		fi.fileInput(fileName);

		StudentInfo si = null;
		while(true) {
			ui.showMenu();
			int selection=ui.getUserSelection();
			ui.showSearchWordStep();
			String keyWord = ui.getKeyWord();
			if(selection==Ui.SearchByName) {
				retVal=da.getDataByName(keyWord);
				if(retVal.size()==NO_DATA) {
					ui.printNoData();
				}
				else {
					ui.printSearchByName(retVal);
				}
				
			}
			else if(selection==Ui.SearchByNumber) {
				si=da.getDataByNum(keyWord);
				if(si==null) {
					ui.printNoData();
				}
				else {
					ui.printSearchByNumber(si);
				}
				
				
			}
			else if(selection==Ui.SearchByDept) {
				retVal=da.getDataByDept(keyWord);
				if(retVal.size()==NO_DATA) {
					ui.printNoData();
				}
				else {
					ui.printSearchByDept(retVal);
				}
				
			}
			else {
				break;
			}
		
			
		}
			
	}

}
