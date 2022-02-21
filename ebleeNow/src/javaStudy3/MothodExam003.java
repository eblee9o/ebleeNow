package javaStudy;

public class MothodExam003 {

/*반환값이 있고 받는 인자갑싱 없는 메서드 구현
 * 자바의 메서드 작성법과 반환값, 인자값에 대한 이해
 */	

	public static int returnMethod() {
		
		int ret = 10;
		ret *= 2;
		
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. 반환값 o, 받는 인자값 X : 반환값이 있다는 것은 메서드(함수) 호출에 따른 리턴값이 있는 것이므로 호출 시 리턴값을 받는 변수를 정의한다.
		int rst;
		
		rst = returnMethod();
		
		//2. 출력
		System.out.println("메서드 호출에 따른 리턴된 값은 = " + rst);
		
	}//main

}//class
