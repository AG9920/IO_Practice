package com.futuregong.crazy_java_Practice;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterTest {
	
	public static void main(String[] args) {
		File file = new File(".");
		//�鿴ȫ���ļ�
		String[] alllist = file.list();
		for(String name: alllist){
			System.out.println(name);
		}
		
		System.out.println();
		
		//����ļ�������
		String[] namelist = file.list(new MyFilenameFilter());
		for(String name: namelist){
			System.out.println(name);
		}
		
	}

}
class MyFilenameFilter implements FilenameFilter{

	public boolean accept(File dir, String name) {
		//����ļ�����.java��β�������ļ���Ӧһ��·��������true
		return name.endsWith(".java")||new File(name).isDirectory();
	}
	
}
