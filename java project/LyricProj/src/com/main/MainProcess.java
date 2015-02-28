package com.main;

import java.io.File;

import com.test.Test;
import com.test.WriteFile;
import com.zard.BomRead;

public class MainProcess {
	//遍历
		//分析  源文件  得到结果
		//创建 新文件
	
	//得到n个新文件
	public static void main(String args[]){
//		int chapterNum = 4;
		
		for(int chapterNum = 12;chapterNum<13;chapterNum++)
		{
		File root = new File("E:\\Users\\zheng\\Desktop\\ZARD\\ZARD全歌词_整理by田可柔\\平假名注音单独ver\\"+chapterNum);
		
//		E:\Users\zheng\Desktop\ZARD\ZARD全歌词_整理by田可柔\平假名注音单独ver\12
		
		String names[] = null;
		String names_file[] = null;
		try {
			names = Test.showAllFiles(root,true);
			names_file= Test.showAllFiles(root,false);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		for(int i=0;i<names.length;i++)
		{	String analyseResult = "";
			try {
				names_file[i] = names_file[i].substring(names_file[i].indexOf(" "), names_file[i].length());
				names_file[i] = names_file[i].substring(0, names_file[i].indexOf("."));
				
				String header = "\\section{"+names_file[i]+"}\n\\large{\n";
				analyseResult = BomRead.analyseFile(names[i]);
				
				String footer = "\n}";

				analyseResult = header + analyseResult + footer;
						
						
			//	WriteFile.Fn_WriteFile(analyseResult,names[i].replaceAll("txt", "tex"));
				WriteFile.Fn_WriteFile(analyseResult,names[i].substring(0, names[i].lastIndexOf("\\")+1)+chapterNum+"_"+i+".tex");
				} 	catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i=0;i<names_file.length;i++){
//			System.out.println("\\input{"+names_file[i].substring(0, names_file[i].length()-4)+"}");
			System.out.println("\\input{"+chapterNum+"_"+i+"}");
System.out.println();			
		}
	}
	}
}
