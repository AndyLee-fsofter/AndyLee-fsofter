package com.luvina.smartstring;

public class SmartString {
	
	public String sortString(String s) {
		StringBuilder sb = new StringBuilder(s);
		StringBuilder sortedString = new StringBuilder();
		while(!sb.isEmpty()) {
			char temp = sb.charAt(0);
			int countIndex = 0;
			for (int i = 0; i < sb.length(); i++) {
				if (temp > sb.charAt(i)) {
					temp = sb.charAt(i);
					countIndex = i;
				}
			}
			sortedString.append(temp);
			sb.deleteCharAt(countIndex);
		}
		
		return sortedString.toString();
	}
	/** 
	 * phương thức này để sắp xếp mỗi từ của một chuỗi theo kí tự tăng dần, sau đó in ra màn hình chuỗi đã sắp xếp
	 * không sử dụng phương thức split
	 * @param text
	 */
	public void sortUpEachWord(String text) {
		StringBuilder sb = new StringBuilder(text);
		StringBuilder s = new StringBuilder();
		System.out.println("chuỗi sau khi sắp xếp lại là :");
		while (!sb.isEmpty()) {
			
			for (int i = 0; i < sb.length(); i++) {
				if (sb.charAt(i) != 32) {
					s.append(sb.charAt(i));
					sb.deleteCharAt(i);
					i--;
				} else {
					sb.deleteCharAt(i);
					break;
				}
			}
			System.out.print(sortString(s.toString())+" ");
			//reset lại chuỗi stringbuilder s
			s.delete(0, s.length()-1);
		}
		System.out.println();
	}
	
	/**
	 * b.phương thức convertSnakeCaseToCamelCase chuyển đổi chuỗi ở dạng snake case sang dạng camel case sau đo
	 * in ra màn hình chuỗi đã chuyển đổi
	 */
	
	public void convertSnakeCaseToCamelCase(String text) {
		StringBuilder snakeCase = new StringBuilder(text.trim());
		StringBuilder camelCase = new StringBuilder();
		camelCase.append(String.valueOf(snakeCase.charAt(0)).toLowerCase());
			for (int i = 1; i < snakeCase.length(); i++) {
				if (snakeCase.charAt(i)!='_') {
					camelCase.append(snakeCase.charAt(i));
				} else {
					i++;
					if (i>=snakeCase.length()) {
						break;
					}else {
					camelCase.append(String.valueOf(snakeCase.charAt(i)).toUpperCase());
					}
				}
			}
		System.out.println("chuỗi text sau khi chuyển đổi là : "+camelCase.toString());
	}

}
