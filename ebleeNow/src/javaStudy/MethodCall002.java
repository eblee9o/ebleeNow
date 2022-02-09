package javaStudy;

public class MethodCall002 {
//call by reference방식
	
	public static void sum(MethodCall002 rst) {
		
	System.out.println("sum 메서드 안에서 출력 >>> " + rst);	
	
	}
	
	public static void sum2(int[] rst) {
		
		System.out.println("sum2 메서드 안에서 출력 >>> " + rst);	
		
		}
	
	public static void sum3(Integer d) {
		
		System.out.println("Integer 메서드 안에서 출력 >>> " + d);	
		
		}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//call by value
		int a = 100;
//		sum(a);
//		System.out.println("result >>>> " + a);
		
		// 1. 변수 선언 및 메서드 호출
		//Wrapper 클래스의 int 클래스 타압으로 변수 a를 선언하고 new를 객체로 생성하여 해당 주소 값을 메서드로 보낸다.
		int[] b = new int[5];
		MethodCall002 c = new MethodCall002(); //참조형 타입으로 생성
		
		sum(c);
		sum2(b);
		
		System.out.println("main 메서드 안에서 c 출력 >>> " + c);
		System.out.println("main 메서드 안에서 b 출력 >>> " + b);
		
		Integer d = new Integer(100);
		sum3(d);
		System.out.println("integer a >>> " + d);
	}//main

}//class
