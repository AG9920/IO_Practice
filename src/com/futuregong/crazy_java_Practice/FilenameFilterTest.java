package com.futuregong.crazy_java_Practice;

import java.io.File;
import java.io.FilenameFilter;

public class FilenameFilterTest {
	
	public static void main(String[] args) {
		File file = new File(".");
		//查看全部文件
		String[] alllist = file.list();
		for(String name: alllist){
			System.out.println(name);
		}
		
		System.out.println();
		
		//添加文件过滤器
		String[] namelist = file.list(new MyFilenameFilter());
		for(String name: namelist){
			System.out.println(name);
		}
		
	}

}
class MyFilenameFilter implements FilenameFilter{

	public boolean accept(File dir, String name) {
		//如果文件名以.java结尾，或者文件对应一个路径，返回true
		return name.endsWith(".java")||new File(name).isDirectory();
	}
	
}
