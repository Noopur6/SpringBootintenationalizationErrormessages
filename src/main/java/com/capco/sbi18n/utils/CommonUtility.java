package com.capco.sbi18n.utils;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;

public class CommonUtility {

	private CommonUtility() {
		// Default Constructor
	}
	@Autowired
	static Messages messages;
	public static String getMessage(String code, String appLanguage) {
		System.out.println("code:"+code+" , applanguage:"+appLanguage);
		return messages.get(code, new Locale(appLanguage));
	}

	public static String getMessage(String code) {
		return messages.get(code);
	}
}
