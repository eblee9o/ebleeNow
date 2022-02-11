package javaStudy;

public class MethodTwoReturn {
	
	public static int[] testMethod() {
		
		int num1 = 100;
		int num2 = 200;
		
		//리턴값은 하나만 보낼 수 있기 때문에 배열에 넣어서 주소값을 보내준다.
		return new int[] {num1,num2} ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수선언
		int result[] = testMethod();
		
		//출력
		System.out.println(">>>" + result);
		System.out.println(">>>" + result[0]);
		System.out.println(">>>" + result[1]);
		
		
	}//main

}//class
