package com.pputil.manager;

public class PPStringUtil {
	
	//输出函数
	public static void cout(String str) {
		System.out.println(str);
	}
	
	public static void cout(Double iData) {
		System.out.println(iData);
	}
	
	public static void cout(Float iData) {
		System.out.println(iData);
	}
	
	public static void cout(Long iData) {
		System.out.println(iData);
	}
	
	//数值型转字符串型
	public static String IntToStr(int args) {
			return Integer.toString(args);
	}
	
	public static String DoubleToStr(double args) {
		return Double.toString(args);
	}
	
	public static String FloatToStr(Float args) {
		return Float.toString(args);
	}
	
	public static int StrToInt(String args) {
		return Integer.parseInt(args);
	}
	
	public static Double StrToDouble(String args) {
		return Double.parseDouble(args);
	}
	
	public static Float StrToFloat(String args) {
		return Float.parseFloat(args);
	}
	
	public static java.sql.Date StrToDate(String dataStr) {
		return java.sql.Date.valueOf(dataStr);
	}
	
	public static String DateToString(java.sql.Date date) {
		return date.toString();
	}
}
