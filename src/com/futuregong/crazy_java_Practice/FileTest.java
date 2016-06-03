package com.futuregong.crazy_java_Practice;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) throws IOException {
		File file = new File(".");
		//文件名
		System.out.println(file.getName());
		//文件的绝对路径
		System.out.println(file.getAbsolutePath());
		//获得相对路径的父路径，返回null
		System.out.println(file.getParent());
		//与绝对路径返回值相同
		System.out.println(file.getAbsoluteFile());
		//获取上一级路径
		System.out.println(file.getAbsoluteFile().getParent());
		//在当前路径下创建临时文件
		File tmpfile = File.createTempFile("aaaa", ".txt",file);
		//指定当JVM退出时删除该文件
		tmpfile.deleteOnExit();
		//以系统当前时间作为新文件名来创建新文件
		File newFile = new File(System.currentTimeMillis()+"");
		System.out.println("newFile对象是否存在："+newFile.exists());
		//以指定newFile对象来创建一个文件
		newFile.createNewFile();
		/*
		 * 以newFile对象来创建一个目录，因为newFile已经存在，所以创建失败，返回false
		 */
		System.out.println(newFile.mkdir());
		//使用List方法来列出当前路径下的所有文件和路径
		String[] fileList = file.list();
		System.out.println("当前路径下所有文件和路径如下：");
		for(String fileName:fileList){
			System.out.println(fileName);
		}
		//listRoots静态方法列出所有的磁盘根路径
		File[] roots = File.listRoots();
		System.out.println("系统所有根路径如下：");
		for(File root: roots){
			System.out.println(root);
		}
		
		
	}

}
