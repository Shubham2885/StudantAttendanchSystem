package com.bridgelazs.comman;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtil {

	final static String MOBILE_NO_PATTERN = "(0/91)?[7-9][0-9]{9}";
	
	public static boolean mobileNumberValidation(String input) {
		Pattern p = Pattern.compile(MOBILE_NO_PATTERN);
		Matcher matcher = p.matcher(input);
		return matcher.find();
	}
}
