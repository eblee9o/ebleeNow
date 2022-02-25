package javaStudy4;
/*인터페이스
 * 추상클래스와 거의 비슷하나 그 추상화 정도가 더 높다(더 엄격) -> 일반 메서드나 멤버필드(변수)를 가질 수 없다.
 * 표준화 및 규격을 인터페이스로 제공 -> 일종의 "설계도"개념
 * 따라서 어떤 클래스가 해당 인터페이스를 사용(상속)한다면 인터페이스에 선언되어져 있는 메서드를 구현
 * interface 키워드 사용
 * 추상클래스와 같이 메서드의 구체적인 내용은 기술되어져 있지 않으므로 인터페이스를 상속받은 클래스에서 재정의(오버ㅏ이딩)하여 사용
 * 
 * 상속
 * 클래스 - 단일상속만 가능 / extends
 * 인터페이스 - 다중상속 자능 / implements, 다중상속 시 ,로 분리
 * 이를 이용하여 여러개의 인터페이스부터 메서드를 받아올 수 있게된다 -> 다중상속 구현
 * 
 * 장점
 * 인터페이스를 이용하면 메서드의 추상적인 "선언"과 그 메서드들을 구체적인 "구현"부분을 분리시킬 수 있다. -> 매우 큰 장정
 * 하청을 주는 대기업(갑)은 하청업체(을)에 인터페이스만 제공 -> 각 하청업체드이 이를 준수하여(=상속받아) 개바
 * 분업화된 시스템을 구출하여 "갑"과 "을"이 독립적으로 프로젝트 개발을 해나갈 수 있다. -> 매우 큰 장점
 * 
 * 우선순의(extends vs implements)
 * 상속을 받는 extends 키워드와 구현을 하는 implements 키워드가 동시에 쓰일 때 ->extends 키워드가 항상 먼저 쓰인다.
 * class Students extends Person implements A,B
 * 
 * */
public class Oop_Interface002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//객체생성
		

		
		
		System.out.println(">>>>");
	}//main

}//class
