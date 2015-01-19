package com.zard;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// write your code here
		Set<Character.UnicodeBlock> japaneseUnicodeBlocks = new HashSet<Character.UnicodeBlock>() {
			{
				add(Character.UnicodeBlock.HIRAGANA);
				add(Character.UnicodeBlock.KATAKANA);
				//add(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS);
			}
		};

		//String mixed = "This is a Japanese newspaper headline: ラドクリフ、マラソン励��旗燕に1嵐m竃��にも根み";
		String mixed = "雲�┐�ず��れてゆく　サヨナラが���┐���こえた";
		for (char c : mixed.toCharArray()) {
			if (japaneseUnicodeBlocks.contains(Character.UnicodeBlock.of(c))) {
				System.out.println(c + " is a Japanese character");
			} else {
				System.out.println(c + " is not a Japanese character");
			}
		}
	}
}