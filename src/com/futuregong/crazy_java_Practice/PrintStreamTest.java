package com.futuregong.crazy_java_Practice;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
public class PrintStreamTest {
	//����ʹ��Printstream ����������װInputStream,ʹ�ô������������������ʱ����ӷ���
	public static void main(String[] args) throws IOException{
		PrintStream ps = null;
		try{
			//����һ���ڵ��������FileOutputStream
			FileOutputStream fos = new FileOutputStream("test.txt");
			//��PrintStream����װFileOutputStream�����
			ps = new PrintStream(fos);
			//ʹ��PrintStreamִ�����
			ps.println("��ͨ�ַ���");
			//ֱ��ʹ��PrintStream�������
			ps.println(new PrintStreamTest());
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			ps.close();
		}
	}

}
