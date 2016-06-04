package com.futuregong.crazy_java_Practice;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/*
 * �ַ���������ʹ���ַ�����Ϊ����ڵ㣬����ʵ�ִ��ַ�����ȡ���ݣ�������д���ַ�����ʵ������StringBuilder�䵱���ַ������Ĺ��ܡ�
 * 
 * �������ʾ����ʹ���ַ�����Ϊ����ڵ���ַ����룬��������÷�
 */

public class StringNodeTest {
	
	public static void main(String[] args) {
		
		//StringReader
		String src = "����������һ���Ҹ�����\n"+"ι��������������\n"+"�������𣬹����߲˺���ʳ"+"����һ�����ӣ��泯�󺣣���ů����\n";
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
		sw.write("��Զ���˴�\n");
		sw.write("��������ů����\n");
		sw.write("��ֻ��һֻС��\n");
		sw.write("һ�������ŵ�����\n");
		System.out.println("������sw���ַ����ڵ��������");
		System.out.println(sw.toString());
	}

}
