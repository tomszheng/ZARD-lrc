package com.zard;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashSet;
import java.util.Set;

public class BomRead {
//	public static void main(String args[]){
//		String s = "";
//		try {
//			s = analyseFile("E:\\Users\\zheng\\Desktop\\lyric\\2\\07 こんなに愛しても.txt");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(s);
//	}
	
	public static String analyseFile(String fileAbsPath) throws Exception {
		String fileContent = "";
		File file2 = new File(fileAbsPath);
		FileInputStream in2 = new FileInputStream(file2);
		@SuppressWarnings("resource")
		BufferedReader br2 = new BufferedReader(new UnicodeReader(in2, "UTF-8"));
		String line2 = null;
		while ((line2 = br2.readLine()) != null) {
			if (!line2.equals("")) {
				fileContent += "\n";
				fileContent += AnalyseLine(line2);
			}
			if (line2.equals("")) {
				fileContent+="\\\\\n";
			}
		}
		return fileContent;
	}
	
	public static int lastType = 0;
	public static int thisType = 0;
	public static boolean flag = false;// 开始计算为true

	private static String AnalyseLine(String line) {
		String temp = "";
		String lineToReturn = "";
		for (int i = line.length() - 1; i >= 0; i--) {
			if (line.charAt(i) == '）') {
				temp += "}";
			} else if (line.charAt(i) == '（') {
				temp += "{}";
				flag = true;
			} else {
				temp += line.charAt(i);
			}

			if (flag == true) {
				if (i == 0) {
					temp += "{ybur\\";
					flag = false;
				} else {
					lastType = typeOf(line.charAt(i - 1));
					thisType = typeOf(line.charAt(i));
				}
				if (lastType != thisType && (lastType + thisType) > 1) {
					temp += "{ybur\\";
					flag = false;
				}
			}
			lastType = thisType;
		}

		for (int i = temp.length() - 1; i >= 0; i--) {
			//System.out.print(temp.charAt(i));
			lineToReturn+=temp.charAt(i);
		}
		//System.out.println();
		lineToReturn+="\n";
		return lineToReturn;
	}

	private static int typeOf(char character) {

		Set<Character.UnicodeBlock> HIRAGANA = new HashSet<Character.UnicodeBlock>() {
			private static final long serialVersionUID = 1L;
			{
				add(Character.UnicodeBlock.HIRAGANA);
			}
		};

		Set<Character.UnicodeBlock> KATAKANA = new HashSet<Character.UnicodeBlock>() {
			private static final long serialVersionUID = 1L;
			{
				add(Character.UnicodeBlock.KATAKANA);
			}
		};

		if (character == ' '||character == '　') {
			return 4;
		}
		if (character == '）') {
			return 5;
		}
		if (HIRAGANA.contains(Character.UnicodeBlock.of(character))) {
			return 1;
		}
		if (KATAKANA.contains(Character.UnicodeBlock.of(character))) {
			return 2;
		}
		return 3;
	}
}
