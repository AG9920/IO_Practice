package com.futuregong.crazy_java_Practice;

import java.io.FileWriter;
import java.io.IOException;

/*
 * ���ϣ��ֱ������ַ��������ݣ���ʹ��writer���и��õ�Ч����
 */
public class FileWriterTest {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		try{
			//�����ַ������
			fw = new FileWriter("poem.txt");
			
			/*
			 * ע�⣬\r\n��windowsƽ̨�Ļ��з��������Linux��ֻҪʹ��\n�Ϳ�����
			 */
			fw.write("��ɪ����������\r\n");
			fw.write("��ɪ�޶���ʮ�ң�һ��һ��˼���ꡣ\r\n");
			fw.write("ׯ�������Ժ��������۴����жž顣\r\n");
			fw.write("�׺����������ᣬ������ů�����̡�\r\n");
			fw.write("����ɴ���׷�䣬ֻ�ǵ�ʱ���Ȼ��\r\n");
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			//ʹ��finally�����ر��ļ������
			if(fw!=null)fw.close();
		}
	}

}
