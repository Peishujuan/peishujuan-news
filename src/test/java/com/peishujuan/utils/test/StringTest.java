package com.peishujuan.utils.test;

import org.junit.Test;

import com.peishujuan.common.utils.StringUtil;

public class StringTest {

	@Test
	public void testIsNumber() {
		String str ="123";
		boolean b = StringUtil.isNumber(str);
		System.out.println(b);
		String str1="abc";
		boolean c = StringUtil.isNumber(str1);
		System.out.println(c);
	}
	
	@Test
	public void testHasText() {
		String str ="";
		String str1 =" ";
		String str2="abc";
		boolean b = StringUtil.hasText(str);
		System.out.println(b);
		boolean c = StringUtil.hasText(str1);
		System.out.println(c);
		boolean d = StringUtil.hasText(str2);
		System.out.println(d);
	}
	
	@Test
	public void getPlaceholderValue() {
		String str = "http://news.cnstock.com/news,yw-201908-4413224.htm";
		String placeholderValue = StringUtil.getPlaceholderValue(str);
		System.out.println(placeholderValue);
				
	}
}
