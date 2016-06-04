package com.futuregong.crazy_java_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�����������ϵ�ﻹ�ṩ��2��ת������������ת��������ʵ�ֽ��ֽ���ת�����ַ�����InputStreamReader,OutputStreamWriter

/*
 * BufferedReader������һ�����幦�ܣ�������һ�ζ�ȡһ���ı����Ի��з�Ϊ��־�������û�ж������з���������������ȵ��������з�λ�á�
 * ����BufferedReader����һ��readline���������Էǳ������һ�ζ���һ�����ݣ����Ծ����Ѷ�ȡ�ı����ݵ���������װ��BufferedReader�����Է���ض�ȡ���������ı�����
 */
public class KeyinTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		try{
			/*
			 * System.in�����׼���룬��InputStream���ʵ�������ｫSystem.in����ת����Reader����
			 */
			InputStreamReader reader = new InputStreamReader(System.in);
			//����ͨReader��װ��BuffererReader
			br = new BufferedReader(reader);
			String buffer = null;
			//����ѭ���ķ�ʽ��һ��һ�еض�ȡ
			while((buffer = br.readLine())!=null)
			{
				if(buffer.equals("exit")){
					System.exit(1);
				}
				System.out.println("��������Ϊ��"+buffer);
			}
		}catch (IOException e){
			e.printStackTrace();
			
		}
		//�ر�������
		finally{
			try{
				br.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
	}

}
