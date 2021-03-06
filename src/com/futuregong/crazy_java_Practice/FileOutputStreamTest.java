package com.futuregong.crazy_java_Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos =null;
		try{
			fis = new FileInputStream("E:/workspace2/IO_Practice/src/com/futuregong/crazy_java_Practice/FileOutputStreamTest.java");
			fos = new FileOutputStream("newFile.txt");
			byte[] bbuf = new byte[32];
			int hasRead = 0;
			while((hasRead= fis.read(bbuf))>0){
				fos.write(bbuf,0,hasRead);
			}
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			if(fis!=null){
				fis.close();
			}
			if(fos!=null){
				fos.close();
			}
		}
	}
	

}
