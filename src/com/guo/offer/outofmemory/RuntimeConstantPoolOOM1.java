package com.guo.offer.outofmemory;

public class RuntimeConstantPoolOOM1 {

	public static void main(String[] args) {
		String str1 = new StringBuilder("�й�").append("���㵺").toString();
		System.out.println(str1.intern() == str1);

		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);
	}
}
