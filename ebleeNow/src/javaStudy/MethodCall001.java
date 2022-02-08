package javaStudy;
/*call by value : 값에 의한 호출 >> 값 자체를 보낸다~!
 *>> 작은 값은 바로 값을 보내서 빨리 처리하게한다.
 *>> 메서드로 인자값을 넘길 때 해당 값을 복사하여 넘기는 방식
 *따라서 */

public class MethodCall001 {
	public static void sum(int a) {
		a += 400;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;
		sum(a);
		System.out.println(a);
		
	}//main

}//class
