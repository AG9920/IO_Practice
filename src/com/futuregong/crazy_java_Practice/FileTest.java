package com.futuregong.crazy_java_Practice;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) throws IOException {
		File file = new File(".");
		//�ļ���
		System.out.println(file.getName());
		//�ļ��ľ���·��
		System.out.println(file.getAbsolutePath());
		//������·���ĸ�·��������null
		System.out.println(file.getParent());
		//�����·������ֵ��ͬ
		System.out.println(file.getAbsoluteFile());
		//��ȡ��һ��·��
		System.out.println(file.getAbsoluteFile().getParent());
		//�ڵ�ǰ·���´�����ʱ�ļ�
		File tmpfile = File.createTempFile("aaaa", ".txt",file);
		//ָ����JVM�˳�ʱɾ�����ļ�
		tmpfile.deleteOnExit();
		//��ϵͳ��ǰʱ����Ϊ���ļ������������ļ�
		File newFile = new File(System.currentTimeMillis()+"");
		System.out.println("newFile�����Ƿ���ڣ�"+newFile.exists());
		//��ָ��newFile����������һ���ļ�
		newFile.createNewFile();
		/*
		 * ��newFile����������һ��Ŀ¼����ΪnewFile�Ѿ����ڣ����Դ���ʧ�ܣ�����false
		 */
		System.out.println(newFile.mkdir());
		//ʹ��List�������г���ǰ·���µ������ļ���·��
		String[] fileList = file.list();
		System.out.println("��ǰ·���������ļ���·�����£�");
		for(String fileName:fileList){
			System.out.println(fileName);
		}
		//listRoots��̬�����г����еĴ��̸�·��
		File[] roots = File.listRoots();
		System.out.println("ϵͳ���и�·�����£�");
		for(File root: roots){
			System.out.println(root);
		}
		
		
	}

}
