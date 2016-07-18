package br.com.esec.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Backreferences {
	public static void main(String args[]) {
		String reg_exxp = "(\\w)(\\d)(\\w+)";

		Pattern p = Pattern.compile(reg_exxp);

		String cand = "X99 ";

		Matcher m = p.matcher(cand);

		String temp = m.replaceAll("$33");

		System.out.println("REPLACEMENT: " + temp);
		System.out.println("ORIGINAL: " + cand);
//		String str = "123456";
//		Pattern p = Pattern.compile("(\\d\\d\\d)\\1");
//		Matcher m = p.matcher(str);
//		System.out.println(m.groupCount());
//		while (m.find()) {
//			String word = m.group();
//			System.out.println(word + " " + m.start() + " " + m.end());
//		}
	}
}
