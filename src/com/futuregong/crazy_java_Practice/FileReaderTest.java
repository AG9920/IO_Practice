package com.futuregong.crazy_java_Practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		try {
			fr = new FileReader("E:/workspace2/IO_Practice/src/com/futuregong/crazy_java_Practice/FileReaderTest.java");
			/*
			 * attention! here we set the length of the char array to 32, and you can see the difference between this output and the FileInputStreamTest one.
			 * 32 or lower means the program would use several times to fully acquire all the data needed. And 1024 clearly obtains all in one time.
			 * Now, you can change the settings from 32 to a higher or lower level and see the result. 
			 */
			char[] cbuf = new char[32];
			int hasRead =0;
			while((hasRead=fr.read(cbuf))>0){
				System.out.println(new String(cbuf,0,hasRead));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fr!=null){
				fr.close();
			}
		}
	}

}
