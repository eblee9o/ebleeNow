package javaStudy;
/*���(inheritance)
 * �θ�Ŭ������ ������ �ִ� �Ӽ�(����)��� ����/���(�޼���)���� �׷��� �����޾� ���ο� Ŭ������ ����� ��.
 * ����� ȭ�椷�ϸ� �������� �͵��� �׷��� ���� �ǰ�, �ű⿡ ���ٿ� ���ο� �͸� ����� �ǹǷ� �׸�ŭ ��°� �ð��� �����.
 * �����ްԵǴ� ����Ŭ������ �θ� Ŭ����(parent Class/super class)
 * ����� �޾� ���Ӱ� ������� Ŭ������ �ڽ� Ŭ����(child class), ����/����Ŭ������� �Ѵ�.
 * ����/���Ŭ����-�Ļ�Ŭ����
 */
/*����� ����
 * ��Ȱ�뼺 : ������ ���ο� ���� ����� ���� �ƴ϶� ���� �θ�κ��� ����� �޾� �ʿ��� �͸� �߰��� ���ؼ� ����� ��.
 * �θ� Ŭ������ ���ǵǾ��� �ִ� ����ʵ�(����)�� �޼������ �״�� ��ӹ޾� ����ϸ� �ȴ�.
 * ��ӹ��� �޼�����ص� �ʿ信 ���� �ڽ� Ŭ�������� �뵵�� �����ؼ� ����ϴ� �͵� �����ϴ�.
 * */
/*����� ���
 * ���� �θ�Ŭ������ Ȯ���Ѵٴ� ���� -> extends Ű���� ���
 * �θ� Ŭ������ ����ʵ�, �޼���� ����� �����ϳ� �����ڴ� ��ӵ��� �ʴ´�.
 * �θ�Ŭ������ ���������ڰ� private�� ��쿡�� �ڽ�Ŭ������ ��� �޾Ҵٰ� �ص� ������ �Ұ����ϴ�.
 * */
/* �����ε� : 
 * �������̵� : ���ο� �뵵�� �������Ͽ� �����Ͽ� ���
*/
class PPerson{
	//field
	int gender;
	int power;
	
	//constructor
	PPerson(){
		this.gender = 1;
		this.power = 100;
	}
	
	//method
	void walk() {
		System.out.println("�ɾ���վ��~");
	}//walk
	
}//person
class HHero extends PPerson{
	//field
	String name;
	int age;
	
	//constructor
	HHero(){}
	HHero(String n, int a){
		this.name = n;
		this.age = a;
	}
	
	//method : �θ�Ŭ�������� ��۹��� �޼ҵ带 �����Ͽ� ����� �� �ִ�.(�������̵�)
	void walk() {
		System.out.println("2��λ��� �ɾ���վ��~");
	}
	void eat() {
		System.out.println("��԰��վ��~");
	}
	void displayPerson() {
		System.out.println("name : " + name + ", age : " + age+", gender" + gender+", power" + power);
	}
}//hero
class VVilain{}

public class OopInheritance001 {
	
	public static void main(String[] args) {
		
		//1. ��ü����
		PPerson p1 = new PPerson();
		p1.walk();
//		p1.eat();
		
		//2. ����� ���� ��ü ����
		HHero h1 = new HHero("a", 20);
		System.out.println(h1.name);
		System.out.println(h1.age);
		System.out.println(h1.gender);//�θ�Ŭ��������
		System.out.println(h1.power);//�θ�Ŭ��������
		
	}//main

}//class