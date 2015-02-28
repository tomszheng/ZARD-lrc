package com.test;

import java.io.File;

public class Test {
	 public static void main(String[] args) throws Exception {
	 //递归显示C盘下所有文件夹及其中文件
	 File root = new File("E:\\Users\\zheng\\Desktop\\lyric\\3");
	 String names[] = showAllFiles(root,true);
		 for(int i=0;i<names.length;i++)
		 {
			 System.out.println(names[i]);
		 }
	 }

	 /**
	  * @param fullPaht <h5>true -- return the full path of the file in this folder</h5>
	  * 				<h5>false-- return the name of the file in this folder</h5>
	  * */
	public static String[] showAllFiles(File dir,boolean fullPath) throws Exception {
		File[] fs = dir.listFiles();
		String[] names = new String[fs.length];
		for (int i = 0; i < fs.length; i++) {
			String path = fs[i].getAbsolutePath();			
			if(fullPath){
				names[i] = path;
			}else{
				names[i] = (String) path.subSequence(path.lastIndexOf("\\")+1, path.length());
			}
			if (fs[i].isDirectory()) {
				try {
					showAllFiles(fs[i],fullPath);
				} catch (Exception e) {
				}
			}
		}
		return names;
	}
}