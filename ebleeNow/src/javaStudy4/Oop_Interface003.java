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
 * class Student1s extends Person1 implements A,B
 * 
 * */

class Person1{
	//field
	String name;
	int age;
	int weight;
	
	//constructor
	Person1(){}
	Person1(String name, int age, int weight){
		
		this.name = name;
		this.age  = age;
		this.weight = weight;
	}
	//method
	void wash() {System.out.println("wash >>> ");}
	void study() {System.out.println("study >>> ");}
	void play() {System.out.println("play >>> ");}
	
}//Person1

interface Allowence11{ //인터페이스는 추상메소드만 가용 가능
	//field
	
	//변수는 안되나 상수는 가능 -> 상수ㅗ 지정 public static final 붙여주면 됨
	//인터페이스 내 모든 멤버 필드(변수) public static final이여야함
	public static final String aaa = "ko";
	public static final int bbb = 100;
	
	//method
	abstract void in(int price, String name);
	abstract void out(int price, String name);
	
} 
interface Train1{
	abstract void Train1(int Train1ing_pay, String name);
}

class Student1 extends Person1 implements Allowence11, Train1{
	
	//field

	//constructor
	Student1(){}
	Student1(String name, int age, int weight){
		super(name, age, weight);
	}
	
	//method
	public void in(int price, String name) {System.out.printf(" %s에게서 %d 용돈을 받았습니다. >>> ",name, price);}
	public void out(int price, String name) {System.out.printf(" %d 금액을 지출했습니다. [지출용도 --> %s]%n >>> ", price, name);}
	public void Train1(int Train1ing_pay, String name) {System.out.printf(" [%s --> %d원 입금완료] >>> ", name, Train1ing_pay);}
	
	
}//Student1

public class Oop_Interface003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//1. 객체생성
		Student1 s1 = new Student1("홍길동", 20, 85);

		//2. 클래스와 인터페이스로부터 상속(Person1)과 구현(Allowence11, Train1)을 한 메서드들 호출하기
		s1.wash();
		s1.study();
		s1.play();
		s1.in(100000, "엄마");
		s1.out(5000, "lotto");
		s1.Train1(5000, "lotto");
		System.out.println();
 
		//3. 상수필드 사용하기
		System.out.println(s1.aaa);
		System.out.println(s1.bbb);
		
		System.out.println("main >>>>");
	}//main

}//class
