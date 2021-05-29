package com.luvina.main;

import com.luvina.smartstring.SmartString;

public class Main {

	public static void main(String[] args) {
		SmartString sm = new SmartString();
		sm.sortUpEachWord("xin chao cac ban luvina phitin");
		System.out.println("----------------------");
		sm.convertSnakeCaseToCamelCase("xin_chao_cac_ban_lu_phi");

	}

}
