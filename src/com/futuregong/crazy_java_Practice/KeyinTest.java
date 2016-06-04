package com.futuregong.crazy_java_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//输入输出流体系里还提供了2个转换流，这两个转换流用于实现将字节流转换成字符流：InputStreamReader,OutputStreamWriter

/*
 * BufferedReader流具有一个缓冲功能，他可以一次读取一行文本，以换行符为标志，如果他没有读到换行符，则程序阻塞，等到读到换行符位置。
 * 由于BufferedReader具有一个readline方法，可以非常方便地一次读入一行内容，所以经常把读取文本内容的输入流包装成BufferedReader，用以方便地读取输入流的文本内容
 */
public class KeyinTest {
	public static void main(String[] args) {
		BufferedReader br = null;
		try{
			/*
			 * System.in代表标准输入，是InputStream类的实例，这里将System.in对象转换成Reader对象
			 */
			InputStreamReader reader = new InputStreamReader(System.in);
			//将普通Reader包装成BuffererReader
			br = new BufferedReader(reader);
			String buffer = null;
			//采用循环的方式，一行一行地读取
			while((buffer = br.readLine())!=null)
			{
				if(buffer.equals("exit")){
					System.exit(1);
				}
				System.out.println("输入内容为："+buffer);
			}
		}catch (IOException e){
			e.printStackTrace();
			
		}
		//关闭输入流
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
