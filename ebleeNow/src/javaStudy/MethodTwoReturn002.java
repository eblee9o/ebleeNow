package javaStudy;

import java.util.Arrays;

public class MethodTwoReturn002 {
	
	public static String[] capitalMethod(String a, String b) {
		
		String a_ = a.toUpperCase();
		String b_ = b.toLowerCase();
		
		System.out.println(">>>" + a_ +", "+ b_);
		
		//리턴값 2개를 저장할 배열 변수 선언
		String[] ret = {a_,b_};
		
		return ret;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//반환값 o, 받는 인자값 o :: 메서드 호출에 따른 리턴값이 있다는 것 --> 호출부에서 리턴값을 받는 변수 정의		
		String[] result = capitalMethod("korea","USA");
		
		//출력
		System.out.println(" >>> " + result);
		System.out.println(" >>> " + result[0]);
		System.out.println(" >>> " + result[1]);
		System.out.println(Arrays.toString(result));
		
	}//main

}//class
