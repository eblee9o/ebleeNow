package javaStudy;
/*static 선언이 안되어ㅣㅇㅆ는 메서드를 사용하는 방법에 대해 코드로 구현
 * 메인 메서드에서 static 선언이 없는 메서드를 사용하는 방법에 대해서 확인
 * 클래스와 객체에 대한 선행 학습 필요!
 * 클래스명.메서드명
 */
public class MethodExam005 {

	public void helloWorld() {
		System.out.println("Hello World~!!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//인스턴스생성
		MothodExam003 jes = new MothodExam003();
//		jes.helloWorld();
	}//main

}//class
