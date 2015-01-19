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

		//String mixed = "This is a Japanese newspaper headline: ��ɥ���ա��ޥ饽����݆�����1��m�����ˤ⺬��";
		String mixed = "������������Ƥ椯������ʥ餬������������";
		for (char c : mixed.toCharArray()) {
			if (japaneseUnicodeBlocks.contains(Character.UnicodeBlock.of(c))) {
				System.out.println(c + " is a Japanese character");
			} else {
				System.out.println(c + " is not a Japanese character");
			}
		}
	}
}