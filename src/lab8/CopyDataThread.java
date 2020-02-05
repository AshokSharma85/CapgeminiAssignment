package lab8;

import java.io.FileInputStream;

import java.io.FileNotFoundException;

import java.io.IOException;

import java.io.FileOutputStream;

public class CopyDataThread extends Thread{
	Thread t;
	CopyDataThread(){
		super("copyData");
		start();
	}
	
	public void run() {
		System.out.println(Thread.currentThread());
		System.out.println("Hello");
		String myfile="file1";
		String myfile1="file2";
		try {
			FileInputStream fis=new FileInputStream("sample.txt");
			FileOutputStream fos=new FileOutputStream("myfile.txt");
			int count=0;
			int i;
			while((i=fis.read())!=-1) {
				if(count<10) {
					fos.write((char)i);
				}
				else {
					System.out.println("10 characters copied");
					try{
						Thread.sleep(5000);
					}
					catch(InterruptedException ee) {
						System.out.println(ee);
					}
					fos.write((char)i);
					count=0;
				}
				count++;
			}
		
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(IOException e) {
			System.out.println("File not found");
		}
		
		
	}
}
