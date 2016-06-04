package com.futuregong.crazy_java_Practice;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/*
 * 字符流还可以使用字符串作为物理节点，用于实现从字符串读取内容，或将内容写入字符串（实际上用StringBuilder充当了字符串）的功能。
 * 
 * 下面程序示范了使用字符串作为物理节点的字符输入，输出流的用法
 */

public class StringNodeTest {
	
	public static void main(String[] args) {
		
		//StringReader
		String src = "从明天起，做一个幸福的人\n"+"喂马，劈柴，周游世界\n"+"从明天起，关心蔬菜和粮食"+"我有一所房子，面朝大海，春暖花开\n";
		StringReader sr = new StringReader(src);
		char[] buffer  =new char[32];
		int hasRead = 0;
		try{
			while((hasRead=sr.read(buffer))>0){
				System.out.println(new String (buffer,0,hasRead));
			}
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		finally{
			sr.close();
		}
		
		//StringWriter
		StringWriter sw = new StringWriter(20);
		sw.write("我远离了大海\n");
		sw.write("看不到春暖花开\n");
		sw.write("我只有一只小龟\n");
		sw.write("一样可以闻到花香\n");
		System.out.println("下面是sw的字符串节点里的内容");
		System.out.println(sw.toString());
	}

}
