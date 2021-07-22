package com.sw.dataInput;

import java.io.*;

import com.sw.process.DataAccess;
import com.sw.process.StudentInfo;

public class FileDataInput {
	
	static final int FileSuccess_RET=1;
	static final int FileNotFoundException_RET=-1;
	static final int IOEXCEPTION_RET=-2;
	static final int CLOSE_IOEXCEPTION_RET=-3;
	
	public DataAccess da = null;

	public FileDataInput(DataAccess da){
		this.da = da;
		
	}
	public int fileInput(String fileName) {
		int ret=FileSuccess_RET;
		FileReader filereader= null;
		File file = null;
		BufferedReader bufReader = null;
		int rowCount=0;
        try{
            //파일 객체 생성
            file = new File(fileName);
            //입력 스트림 생성
            filereader = new FileReader(file);
            //입력 버퍼 생성
            bufReader = new BufferedReader(filereader);
            String line = "";
            while((line = bufReader.readLine()) != null){
            	
//            		System.out.println(line);
                    saveDataFromRowString(line);
            	
                
            }           
        }catch (FileNotFoundException e) {
        	System.out.println(e);
        	return FileNotFoundException_RET;
        }catch(IOException e){
            System.out.println(e);
            return IOEXCEPTION_RET;
        }
        finally{
        	try{
        		bufReader .close();
			}catch(IOException e){
				System.out.println(e);
	        	return CLOSE_IOEXCEPTION_RET;   
			}
		}
		return ret;
	}
	public int saveDataFromRowString(String rowStr) {
		
		int ret=0;
		String[] data = rowStr.split(" ");
//		printStringArr(data);
		StudentInfo si = new StudentInfo();
		si.name=data[0];
		si.num=data[1];
		si.tel=data[2];
		si.dept=data[3];
		da.addData(si);
//		da.printStudentInfo();
		return ret;
	}
	void printStringArr(String[] strArr) {
		System.out.println("-- printStringArr() --");
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		System.out.println("------------------------");
	}
}
