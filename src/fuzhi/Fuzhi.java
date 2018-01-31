package fuzhi;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class Fuzhi {
	public static void main(String[] args) throws Exception{
		/*File file1=new File("E:/ab.txt");
		File file2=new File("E:/abcde");
		System.out.println("文件1是否存在"+file1.exists());
		System.out.println("文件夹2是否存在"+file2.exists());
		System.out.println("文件1是否是文件"+file1.isFile());
		InputStream is=new FileInputStream(file1);
		byte[] b=new byte[(int) file1.length()];
		is.read(b);
		String str=new String(b);
		System.out.println("创建文件夹"+file2.mkdir());
		File file3=new File("E:/abcde/ab.txt");
		System.out.println("创建文件"+file3.createNewFile());
		OutputStream os=new FileOutputStream(file3);
		String ab=str;
		os.write(ab.getBytes());
		os.close();
		is.close();
		System.out.println("写入完成");*/
		
		
		File file1=new File("E:/ab.txt");
		File file2=new File("E:/abcde/ab.txt");
		InputStream is=new FileInputStream(file1);
		byte[] b=new byte[(int) file1.length()];
		is.read(b);
		OutputStream os=new FileOutputStream(file2);
		for(int i=0;i<file1.length();i++){
			os.write(b[i]);
		}
		System.out.println("写入完成");
	}
}
