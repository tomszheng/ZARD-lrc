package com.test;

import java.io.*;

/**
 * 使用FileOutputStream写文件示例
 */
public class WriteFile {
//	public static void main(String args[]){
//		Fn_WriteFile("hello world","D:\\hello.tex");
//	}
	
	
	public static void Fn_WriteFile(String fileContent,String fileAbsPath) {

		fileContent = fileContent.replace("\ruby","\\ruby");

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(fileAbsPath);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			osw.write(fileContent);
			osw.flush();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
//		try {
//			fos = new FileOutputStream(fileAbsPath);
//			byte[] b1 = fileContent.getBytes();
//
//			fos.write(b1);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fos.close();
//			} catch (Exception e) {
//				
//			}
//		}
		System.out.println(fileAbsPath+" created success");
	}
}
