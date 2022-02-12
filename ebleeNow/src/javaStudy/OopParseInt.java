package javaStudy;
/*
 * 왜 변환이 필요한가?
 * 숫자끼리의 연산은 3이지만, 무자열끼ㅣ의 연산은 12가 되기때문에 숫자로 변환 후 연산을 수행해야한다.
 * 문자열을 숫자로 변환시키는 방법 : ParseInt
 * ParseInt : Integer 크ㅐㄹ스의 static 으로 지정 -> 따라서 객체의 생성없이 바로 "클래스명.parseInt"로 직접 사용이 가능
 * */
public class OopParseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//숫자끼리의 연산
		int a = 1;
		int b = 2;
		int c = a+b;
		System.out.println("a+b = " + c);
		
		//문자열끼ㅣ의 연산
		String a1 = "1";
		String b1 = "2";
		String c1 = a1 + b1;
		System.out.println("a1+b1 = " + c1);
		
		//문자열을 숫자ㅗ 변환 후 연산
		int a2 = Integer.parseInt(a1);
		int b2 = Integer.parseInt(b1);
		int c2 = a2+b2;
		System.out.println("parseInt >>> " + c2);
	
	}//main

}//class
